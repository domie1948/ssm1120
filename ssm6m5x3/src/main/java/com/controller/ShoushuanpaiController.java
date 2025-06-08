package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShoushuanpaiEntity;
import com.entity.view.ShoushuanpaiView;

import com.service.ShoushuanpaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 手术安排
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
@RestController
@RequestMapping("/shoushuanpai")
public class ShoushuanpaiController {
    @Autowired
    private ShoushuanpaiService shoushuanpaiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShoushuanpaiEntity shoushuanpai, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("bingren")) {
			shoushuanpai.setShoujihao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yihurenyuan")) {
			shoushuanpai.setYihugonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShoushuanpaiEntity> ew = new EntityWrapper<ShoushuanpaiEntity>();
		PageUtils page = shoushuanpaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoushuanpai), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShoushuanpaiEntity shoushuanpai, HttpServletRequest request){
        EntityWrapper<ShoushuanpaiEntity> ew = new EntityWrapper<ShoushuanpaiEntity>();
		PageUtils page = shoushuanpaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoushuanpai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShoushuanpaiEntity shoushuanpai){
       	EntityWrapper<ShoushuanpaiEntity> ew = new EntityWrapper<ShoushuanpaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shoushuanpai, "shoushuanpai")); 
        return R.ok().put("data", shoushuanpaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShoushuanpaiEntity shoushuanpai){
        EntityWrapper< ShoushuanpaiEntity> ew = new EntityWrapper< ShoushuanpaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shoushuanpai, "shoushuanpai")); 
		ShoushuanpaiView shoushuanpaiView =  shoushuanpaiService.selectView(ew);
		return R.ok("查询手术安排成功").put("data", shoushuanpaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShoushuanpaiEntity shoushuanpai = shoushuanpaiService.selectById(id);
        return R.ok().put("data", shoushuanpai);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShoushuanpaiEntity shoushuanpai = shoushuanpaiService.selectById(id);
        return R.ok().put("data", shoushuanpai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShoushuanpaiEntity shoushuanpai, HttpServletRequest request){
    	shoushuanpai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shoushuanpai);

        shoushuanpaiService.insert(shoushuanpai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShoushuanpaiEntity shoushuanpai, HttpServletRequest request){
    	shoushuanpai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shoushuanpai);

        shoushuanpaiService.insert(shoushuanpai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShoushuanpaiEntity shoushuanpai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shoushuanpai);
        shoushuanpaiService.updateById(shoushuanpai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shoushuanpaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShoushuanpaiEntity> wrapper = new EntityWrapper<ShoushuanpaiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("bingren")) {
			wrapper.eq("shoujihao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yihurenyuan")) {
			wrapper.eq("yihugonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shoushuanpaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

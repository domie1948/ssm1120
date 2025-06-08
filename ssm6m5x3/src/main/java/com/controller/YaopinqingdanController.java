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

import com.entity.YaopinqingdanEntity;
import com.entity.view.YaopinqingdanView;

import com.service.YaopinqingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 药品清单
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
@RestController
@RequestMapping("/yaopinqingdan")
public class YaopinqingdanController {
    @Autowired
    private YaopinqingdanService yaopinqingdanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YaopinqingdanEntity yaopinqingdan, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("bingren")) {
			yaopinqingdan.setShoujihao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yihurenyuan")) {
			yaopinqingdan.setYihugonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YaopinqingdanEntity> ew = new EntityWrapper<YaopinqingdanEntity>();
		PageUtils page = yaopinqingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaopinqingdan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YaopinqingdanEntity yaopinqingdan, HttpServletRequest request){
        EntityWrapper<YaopinqingdanEntity> ew = new EntityWrapper<YaopinqingdanEntity>();
		PageUtils page = yaopinqingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaopinqingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YaopinqingdanEntity yaopinqingdan){
       	EntityWrapper<YaopinqingdanEntity> ew = new EntityWrapper<YaopinqingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yaopinqingdan, "yaopinqingdan")); 
        return R.ok().put("data", yaopinqingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YaopinqingdanEntity yaopinqingdan){
        EntityWrapper< YaopinqingdanEntity> ew = new EntityWrapper< YaopinqingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yaopinqingdan, "yaopinqingdan")); 
		YaopinqingdanView yaopinqingdanView =  yaopinqingdanService.selectView(ew);
		return R.ok("查询药品清单成功").put("data", yaopinqingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YaopinqingdanEntity yaopinqingdan = yaopinqingdanService.selectById(id);
        return R.ok().put("data", yaopinqingdan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YaopinqingdanEntity yaopinqingdan = yaopinqingdanService.selectById(id);
        return R.ok().put("data", yaopinqingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YaopinqingdanEntity yaopinqingdan, HttpServletRequest request){
    	yaopinqingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yaopinqingdan);

        yaopinqingdanService.insert(yaopinqingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YaopinqingdanEntity yaopinqingdan, HttpServletRequest request){
    	yaopinqingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yaopinqingdan);

        yaopinqingdanService.insert(yaopinqingdan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YaopinqingdanEntity yaopinqingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yaopinqingdan);
        yaopinqingdanService.updateById(yaopinqingdan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yaopinqingdanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YaopinqingdanEntity> wrapper = new EntityWrapper<YaopinqingdanEntity>();
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

		int count = yaopinqingdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

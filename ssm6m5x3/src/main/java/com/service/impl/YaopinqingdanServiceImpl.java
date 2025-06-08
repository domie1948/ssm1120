package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YaopinqingdanDao;
import com.entity.YaopinqingdanEntity;
import com.service.YaopinqingdanService;
import com.entity.vo.YaopinqingdanVO;
import com.entity.view.YaopinqingdanView;

@Service("yaopinqingdanService")
public class YaopinqingdanServiceImpl extends ServiceImpl<YaopinqingdanDao, YaopinqingdanEntity> implements YaopinqingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaopinqingdanEntity> page = this.selectPage(
                new Query<YaopinqingdanEntity>(params).getPage(),
                new EntityWrapper<YaopinqingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaopinqingdanEntity> wrapper) {
		  Page<YaopinqingdanView> page =new Query<YaopinqingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaopinqingdanVO> selectListVO(Wrapper<YaopinqingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaopinqingdanVO selectVO(Wrapper<YaopinqingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaopinqingdanView> selectListView(Wrapper<YaopinqingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaopinqingdanView selectView(Wrapper<YaopinqingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

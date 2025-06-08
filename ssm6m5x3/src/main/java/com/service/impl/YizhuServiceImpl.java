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


import com.dao.YizhuDao;
import com.entity.YizhuEntity;
import com.service.YizhuService;
import com.entity.vo.YizhuVO;
import com.entity.view.YizhuView;

@Service("yizhuService")
public class YizhuServiceImpl extends ServiceImpl<YizhuDao, YizhuEntity> implements YizhuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YizhuEntity> page = this.selectPage(
                new Query<YizhuEntity>(params).getPage(),
                new EntityWrapper<YizhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YizhuEntity> wrapper) {
		  Page<YizhuView> page =new Query<YizhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YizhuVO> selectListVO(Wrapper<YizhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YizhuVO selectVO(Wrapper<YizhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YizhuView> selectListView(Wrapper<YizhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YizhuView selectView(Wrapper<YizhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

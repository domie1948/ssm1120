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


import com.dao.YiliaofeiyongDao;
import com.entity.YiliaofeiyongEntity;
import com.service.YiliaofeiyongService;
import com.entity.vo.YiliaofeiyongVO;
import com.entity.view.YiliaofeiyongView;

@Service("yiliaofeiyongService")
public class YiliaofeiyongServiceImpl extends ServiceImpl<YiliaofeiyongDao, YiliaofeiyongEntity> implements YiliaofeiyongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiliaofeiyongEntity> page = this.selectPage(
                new Query<YiliaofeiyongEntity>(params).getPage(),
                new EntityWrapper<YiliaofeiyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiliaofeiyongEntity> wrapper) {
		  Page<YiliaofeiyongView> page =new Query<YiliaofeiyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiliaofeiyongVO> selectListVO(Wrapper<YiliaofeiyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiliaofeiyongVO selectVO(Wrapper<YiliaofeiyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiliaofeiyongView> selectListView(Wrapper<YiliaofeiyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiliaofeiyongView selectView(Wrapper<YiliaofeiyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

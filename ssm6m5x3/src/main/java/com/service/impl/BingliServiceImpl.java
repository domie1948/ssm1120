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


import com.dao.BingliDao;
import com.entity.BingliEntity;
import com.service.BingliService;
import com.entity.vo.BingliVO;
import com.entity.view.BingliView;

@Service("bingliService")
public class BingliServiceImpl extends ServiceImpl<BingliDao, BingliEntity> implements BingliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BingliEntity> page = this.selectPage(
                new Query<BingliEntity>(params).getPage(),
                new EntityWrapper<BingliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BingliEntity> wrapper) {
		  Page<BingliView> page =new Query<BingliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BingliVO> selectListVO(Wrapper<BingliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BingliVO selectVO(Wrapper<BingliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BingliView> selectListView(Wrapper<BingliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BingliView selectView(Wrapper<BingliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

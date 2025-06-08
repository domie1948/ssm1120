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


import com.dao.BingfangDao;
import com.entity.BingfangEntity;
import com.service.BingfangService;
import com.entity.vo.BingfangVO;
import com.entity.view.BingfangView;

@Service("bingfangService")
public class BingfangServiceImpl extends ServiceImpl<BingfangDao, BingfangEntity> implements BingfangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BingfangEntity> page = this.selectPage(
                new Query<BingfangEntity>(params).getPage(),
                new EntityWrapper<BingfangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BingfangEntity> wrapper) {
		  Page<BingfangView> page =new Query<BingfangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BingfangVO> selectListVO(Wrapper<BingfangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BingfangVO selectVO(Wrapper<BingfangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BingfangView> selectListView(Wrapper<BingfangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BingfangView selectView(Wrapper<BingfangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

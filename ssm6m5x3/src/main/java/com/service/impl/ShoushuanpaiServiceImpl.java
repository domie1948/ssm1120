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


import com.dao.ShoushuanpaiDao;
import com.entity.ShoushuanpaiEntity;
import com.service.ShoushuanpaiService;
import com.entity.vo.ShoushuanpaiVO;
import com.entity.view.ShoushuanpaiView;

@Service("shoushuanpaiService")
public class ShoushuanpaiServiceImpl extends ServiceImpl<ShoushuanpaiDao, ShoushuanpaiEntity> implements ShoushuanpaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoushuanpaiEntity> page = this.selectPage(
                new Query<ShoushuanpaiEntity>(params).getPage(),
                new EntityWrapper<ShoushuanpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoushuanpaiEntity> wrapper) {
		  Page<ShoushuanpaiView> page =new Query<ShoushuanpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShoushuanpaiVO> selectListVO(Wrapper<ShoushuanpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoushuanpaiVO selectVO(Wrapper<ShoushuanpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoushuanpaiView> selectListView(Wrapper<ShoushuanpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoushuanpaiView selectView(Wrapper<ShoushuanpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

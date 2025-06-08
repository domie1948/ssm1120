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


import com.dao.DiscussjiankangjiangtanDao;
import com.entity.DiscussjiankangjiangtanEntity;
import com.service.DiscussjiankangjiangtanService;
import com.entity.vo.DiscussjiankangjiangtanVO;
import com.entity.view.DiscussjiankangjiangtanView;

@Service("discussjiankangjiangtanService")
public class DiscussjiankangjiangtanServiceImpl extends ServiceImpl<DiscussjiankangjiangtanDao, DiscussjiankangjiangtanEntity> implements DiscussjiankangjiangtanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiankangjiangtanEntity> page = this.selectPage(
                new Query<DiscussjiankangjiangtanEntity>(params).getPage(),
                new EntityWrapper<DiscussjiankangjiangtanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiankangjiangtanEntity> wrapper) {
		  Page<DiscussjiankangjiangtanView> page =new Query<DiscussjiankangjiangtanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiankangjiangtanVO> selectListVO(Wrapper<DiscussjiankangjiangtanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiankangjiangtanVO selectVO(Wrapper<DiscussjiankangjiangtanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiankangjiangtanView> selectListView(Wrapper<DiscussjiankangjiangtanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiankangjiangtanView selectView(Wrapper<DiscussjiankangjiangtanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

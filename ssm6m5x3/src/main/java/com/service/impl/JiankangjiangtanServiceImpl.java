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


import com.dao.JiankangjiangtanDao;
import com.entity.JiankangjiangtanEntity;
import com.service.JiankangjiangtanService;
import com.entity.vo.JiankangjiangtanVO;
import com.entity.view.JiankangjiangtanView;

@Service("jiankangjiangtanService")
public class JiankangjiangtanServiceImpl extends ServiceImpl<JiankangjiangtanDao, JiankangjiangtanEntity> implements JiankangjiangtanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangjiangtanEntity> page = this.selectPage(
                new Query<JiankangjiangtanEntity>(params).getPage(),
                new EntityWrapper<JiankangjiangtanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangjiangtanEntity> wrapper) {
		  Page<JiankangjiangtanView> page =new Query<JiankangjiangtanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangjiangtanVO> selectListVO(Wrapper<JiankangjiangtanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangjiangtanVO selectVO(Wrapper<JiankangjiangtanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangjiangtanView> selectListView(Wrapper<JiankangjiangtanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangjiangtanView selectView(Wrapper<JiankangjiangtanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

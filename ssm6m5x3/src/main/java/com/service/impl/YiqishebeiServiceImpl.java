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


import com.dao.YiqishebeiDao;
import com.entity.YiqishebeiEntity;
import com.service.YiqishebeiService;
import com.entity.vo.YiqishebeiVO;
import com.entity.view.YiqishebeiView;

@Service("yiqishebeiService")
public class YiqishebeiServiceImpl extends ServiceImpl<YiqishebeiDao, YiqishebeiEntity> implements YiqishebeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiqishebeiEntity> page = this.selectPage(
                new Query<YiqishebeiEntity>(params).getPage(),
                new EntityWrapper<YiqishebeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiqishebeiEntity> wrapper) {
		  Page<YiqishebeiView> page =new Query<YiqishebeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiqishebeiVO> selectListVO(Wrapper<YiqishebeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiqishebeiVO selectVO(Wrapper<YiqishebeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiqishebeiView> selectListView(Wrapper<YiqishebeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiqishebeiView selectView(Wrapper<YiqishebeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

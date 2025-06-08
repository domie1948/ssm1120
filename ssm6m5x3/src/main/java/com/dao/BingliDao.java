package com.dao;

import com.entity.BingliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BingliVO;
import com.entity.view.BingliView;


/**
 * 病历
 * 
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface BingliDao extends BaseMapper<BingliEntity> {
	
	List<BingliVO> selectListVO(@Param("ew") Wrapper<BingliEntity> wrapper);
	
	BingliVO selectVO(@Param("ew") Wrapper<BingliEntity> wrapper);
	
	List<BingliView> selectListView(@Param("ew") Wrapper<BingliEntity> wrapper);

	List<BingliView> selectListView(Pagination page,@Param("ew") Wrapper<BingliEntity> wrapper);
	
	BingliView selectView(@Param("ew") Wrapper<BingliEntity> wrapper);
	
}

package com.dao;

import com.entity.YizhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YizhuVO;
import com.entity.view.YizhuView;


/**
 * 医嘱
 * 
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface YizhuDao extends BaseMapper<YizhuEntity> {
	
	List<YizhuVO> selectListVO(@Param("ew") Wrapper<YizhuEntity> wrapper);
	
	YizhuVO selectVO(@Param("ew") Wrapper<YizhuEntity> wrapper);
	
	List<YizhuView> selectListView(@Param("ew") Wrapper<YizhuEntity> wrapper);

	List<YizhuView> selectListView(Pagination page,@Param("ew") Wrapper<YizhuEntity> wrapper);
	
	YizhuView selectView(@Param("ew") Wrapper<YizhuEntity> wrapper);
	
}

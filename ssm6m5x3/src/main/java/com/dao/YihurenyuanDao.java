package com.dao;

import com.entity.YihurenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YihurenyuanVO;
import com.entity.view.YihurenyuanView;


/**
 * 医护人员
 * 
 * @author 
 * @email 
 * @date 2021-02-20 10:02:08
 */
public interface YihurenyuanDao extends BaseMapper<YihurenyuanEntity> {
	
	List<YihurenyuanVO> selectListVO(@Param("ew") Wrapper<YihurenyuanEntity> wrapper);
	
	YihurenyuanVO selectVO(@Param("ew") Wrapper<YihurenyuanEntity> wrapper);
	
	List<YihurenyuanView> selectListView(@Param("ew") Wrapper<YihurenyuanEntity> wrapper);

	List<YihurenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<YihurenyuanEntity> wrapper);
	
	YihurenyuanView selectView(@Param("ew") Wrapper<YihurenyuanEntity> wrapper);
	
}

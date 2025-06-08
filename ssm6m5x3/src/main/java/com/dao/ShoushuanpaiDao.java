package com.dao;

import com.entity.ShoushuanpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoushuanpaiVO;
import com.entity.view.ShoushuanpaiView;


/**
 * 手术安排
 * 
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface ShoushuanpaiDao extends BaseMapper<ShoushuanpaiEntity> {
	
	List<ShoushuanpaiVO> selectListVO(@Param("ew") Wrapper<ShoushuanpaiEntity> wrapper);
	
	ShoushuanpaiVO selectVO(@Param("ew") Wrapper<ShoushuanpaiEntity> wrapper);
	
	List<ShoushuanpaiView> selectListView(@Param("ew") Wrapper<ShoushuanpaiEntity> wrapper);

	List<ShoushuanpaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShoushuanpaiEntity> wrapper);
	
	ShoushuanpaiView selectView(@Param("ew") Wrapper<ShoushuanpaiEntity> wrapper);
	
}

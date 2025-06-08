package com.dao;

import com.entity.BingrenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BingrenVO;
import com.entity.view.BingrenView;


/**
 * 病人
 * 
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface BingrenDao extends BaseMapper<BingrenEntity> {
	
	List<BingrenVO> selectListVO(@Param("ew") Wrapper<BingrenEntity> wrapper);
	
	BingrenVO selectVO(@Param("ew") Wrapper<BingrenEntity> wrapper);
	
	List<BingrenView> selectListView(@Param("ew") Wrapper<BingrenEntity> wrapper);

	List<BingrenView> selectListView(Pagination page,@Param("ew") Wrapper<BingrenEntity> wrapper);
	
	BingrenView selectView(@Param("ew") Wrapper<BingrenEntity> wrapper);
	
}

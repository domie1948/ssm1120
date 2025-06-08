package com.dao;

import com.entity.JiankangjiangtanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangjiangtanVO;
import com.entity.view.JiankangjiangtanView;


/**
 * 健康讲坛
 * 
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface JiankangjiangtanDao extends BaseMapper<JiankangjiangtanEntity> {
	
	List<JiankangjiangtanVO> selectListVO(@Param("ew") Wrapper<JiankangjiangtanEntity> wrapper);
	
	JiankangjiangtanVO selectVO(@Param("ew") Wrapper<JiankangjiangtanEntity> wrapper);
	
	List<JiankangjiangtanView> selectListView(@Param("ew") Wrapper<JiankangjiangtanEntity> wrapper);

	List<JiankangjiangtanView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangjiangtanEntity> wrapper);
	
	JiankangjiangtanView selectView(@Param("ew") Wrapper<JiankangjiangtanEntity> wrapper);
	
}

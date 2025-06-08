package com.dao;

import com.entity.DiscussjiankangjiangtanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiankangjiangtanVO;
import com.entity.view.DiscussjiankangjiangtanView;


/**
 * 健康讲坛评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface DiscussjiankangjiangtanDao extends BaseMapper<DiscussjiankangjiangtanEntity> {
	
	List<DiscussjiankangjiangtanVO> selectListVO(@Param("ew") Wrapper<DiscussjiankangjiangtanEntity> wrapper);
	
	DiscussjiankangjiangtanVO selectVO(@Param("ew") Wrapper<DiscussjiankangjiangtanEntity> wrapper);
	
	List<DiscussjiankangjiangtanView> selectListView(@Param("ew") Wrapper<DiscussjiankangjiangtanEntity> wrapper);

	List<DiscussjiankangjiangtanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiankangjiangtanEntity> wrapper);
	
	DiscussjiankangjiangtanView selectView(@Param("ew") Wrapper<DiscussjiankangjiangtanEntity> wrapper);
	
}

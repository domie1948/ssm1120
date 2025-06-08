package com.dao;

import com.entity.YiliaofeiyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiliaofeiyongVO;
import com.entity.view.YiliaofeiyongView;


/**
 * 医疗费用
 * 
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface YiliaofeiyongDao extends BaseMapper<YiliaofeiyongEntity> {
	
	List<YiliaofeiyongVO> selectListVO(@Param("ew") Wrapper<YiliaofeiyongEntity> wrapper);
	
	YiliaofeiyongVO selectVO(@Param("ew") Wrapper<YiliaofeiyongEntity> wrapper);
	
	List<YiliaofeiyongView> selectListView(@Param("ew") Wrapper<YiliaofeiyongEntity> wrapper);

	List<YiliaofeiyongView> selectListView(Pagination page,@Param("ew") Wrapper<YiliaofeiyongEntity> wrapper);
	
	YiliaofeiyongView selectView(@Param("ew") Wrapper<YiliaofeiyongEntity> wrapper);
	
}

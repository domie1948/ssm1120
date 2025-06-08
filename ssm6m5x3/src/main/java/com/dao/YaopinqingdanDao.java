package com.dao;

import com.entity.YaopinqingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaopinqingdanVO;
import com.entity.view.YaopinqingdanView;


/**
 * 药品清单
 * 
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface YaopinqingdanDao extends BaseMapper<YaopinqingdanEntity> {
	
	List<YaopinqingdanVO> selectListVO(@Param("ew") Wrapper<YaopinqingdanEntity> wrapper);
	
	YaopinqingdanVO selectVO(@Param("ew") Wrapper<YaopinqingdanEntity> wrapper);
	
	List<YaopinqingdanView> selectListView(@Param("ew") Wrapper<YaopinqingdanEntity> wrapper);

	List<YaopinqingdanView> selectListView(Pagination page,@Param("ew") Wrapper<YaopinqingdanEntity> wrapper);
	
	YaopinqingdanView selectView(@Param("ew") Wrapper<YaopinqingdanEntity> wrapper);
	
}

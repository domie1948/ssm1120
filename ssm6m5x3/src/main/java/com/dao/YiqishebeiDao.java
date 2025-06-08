package com.dao;

import com.entity.YiqishebeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiqishebeiVO;
import com.entity.view.YiqishebeiView;


/**
 * 仪器设备
 * 
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface YiqishebeiDao extends BaseMapper<YiqishebeiEntity> {
	
	List<YiqishebeiVO> selectListVO(@Param("ew") Wrapper<YiqishebeiEntity> wrapper);
	
	YiqishebeiVO selectVO(@Param("ew") Wrapper<YiqishebeiEntity> wrapper);
	
	List<YiqishebeiView> selectListView(@Param("ew") Wrapper<YiqishebeiEntity> wrapper);

	List<YiqishebeiView> selectListView(Pagination page,@Param("ew") Wrapper<YiqishebeiEntity> wrapper);
	
	YiqishebeiView selectView(@Param("ew") Wrapper<YiqishebeiEntity> wrapper);
	
}

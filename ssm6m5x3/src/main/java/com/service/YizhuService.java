package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YizhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YizhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YizhuView;


/**
 * 医嘱
 *
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface YizhuService extends IService<YizhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YizhuVO> selectListVO(Wrapper<YizhuEntity> wrapper);
   	
   	YizhuVO selectVO(@Param("ew") Wrapper<YizhuEntity> wrapper);
   	
   	List<YizhuView> selectListView(Wrapper<YizhuEntity> wrapper);
   	
   	YizhuView selectView(@Param("ew") Wrapper<YizhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YizhuEntity> wrapper);
   	
}


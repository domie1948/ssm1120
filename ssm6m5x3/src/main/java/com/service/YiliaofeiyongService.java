package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiliaofeiyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiliaofeiyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiliaofeiyongView;


/**
 * 医疗费用
 *
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface YiliaofeiyongService extends IService<YiliaofeiyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiliaofeiyongVO> selectListVO(Wrapper<YiliaofeiyongEntity> wrapper);
   	
   	YiliaofeiyongVO selectVO(@Param("ew") Wrapper<YiliaofeiyongEntity> wrapper);
   	
   	List<YiliaofeiyongView> selectListView(Wrapper<YiliaofeiyongEntity> wrapper);
   	
   	YiliaofeiyongView selectView(@Param("ew") Wrapper<YiliaofeiyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiliaofeiyongEntity> wrapper);
   	
}


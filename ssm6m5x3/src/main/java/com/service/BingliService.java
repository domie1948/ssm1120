package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BingliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BingliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BingliView;


/**
 * 病历
 *
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface BingliService extends IService<BingliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BingliVO> selectListVO(Wrapper<BingliEntity> wrapper);
   	
   	BingliVO selectVO(@Param("ew") Wrapper<BingliEntity> wrapper);
   	
   	List<BingliView> selectListView(Wrapper<BingliEntity> wrapper);
   	
   	BingliView selectView(@Param("ew") Wrapper<BingliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BingliEntity> wrapper);
   	
}


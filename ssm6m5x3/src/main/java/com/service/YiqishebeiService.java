package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiqishebeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiqishebeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiqishebeiView;


/**
 * 仪器设备
 *
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface YiqishebeiService extends IService<YiqishebeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiqishebeiVO> selectListVO(Wrapper<YiqishebeiEntity> wrapper);
   	
   	YiqishebeiVO selectVO(@Param("ew") Wrapper<YiqishebeiEntity> wrapper);
   	
   	List<YiqishebeiView> selectListView(Wrapper<YiqishebeiEntity> wrapper);
   	
   	YiqishebeiView selectView(@Param("ew") Wrapper<YiqishebeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiqishebeiEntity> wrapper);
   	
}


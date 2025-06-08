package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BingfangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BingfangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BingfangView;


/**
 * 病房
 *
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface BingfangService extends IService<BingfangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BingfangVO> selectListVO(Wrapper<BingfangEntity> wrapper);
   	
   	BingfangVO selectVO(@Param("ew") Wrapper<BingfangEntity> wrapper);
   	
   	List<BingfangView> selectListView(Wrapper<BingfangEntity> wrapper);
   	
   	BingfangView selectView(@Param("ew") Wrapper<BingfangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BingfangEntity> wrapper);
   	
}


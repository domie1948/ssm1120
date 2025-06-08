package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoushuanpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoushuanpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoushuanpaiView;


/**
 * 手术安排
 *
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface ShoushuanpaiService extends IService<ShoushuanpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoushuanpaiVO> selectListVO(Wrapper<ShoushuanpaiEntity> wrapper);
   	
   	ShoushuanpaiVO selectVO(@Param("ew") Wrapper<ShoushuanpaiEntity> wrapper);
   	
   	List<ShoushuanpaiView> selectListView(Wrapper<ShoushuanpaiEntity> wrapper);
   	
   	ShoushuanpaiView selectView(@Param("ew") Wrapper<ShoushuanpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoushuanpaiEntity> wrapper);
   	
}


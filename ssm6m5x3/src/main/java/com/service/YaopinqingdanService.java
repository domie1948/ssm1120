package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaopinqingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaopinqingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaopinqingdanView;


/**
 * 药品清单
 *
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface YaopinqingdanService extends IService<YaopinqingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaopinqingdanVO> selectListVO(Wrapper<YaopinqingdanEntity> wrapper);
   	
   	YaopinqingdanVO selectVO(@Param("ew") Wrapper<YaopinqingdanEntity> wrapper);
   	
   	List<YaopinqingdanView> selectListView(Wrapper<YaopinqingdanEntity> wrapper);
   	
   	YaopinqingdanView selectView(@Param("ew") Wrapper<YaopinqingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaopinqingdanEntity> wrapper);
   	
}


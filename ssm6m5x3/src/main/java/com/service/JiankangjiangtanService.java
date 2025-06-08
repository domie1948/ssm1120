package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangjiangtanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangjiangtanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangjiangtanView;


/**
 * 健康讲坛
 *
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface JiankangjiangtanService extends IService<JiankangjiangtanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangjiangtanVO> selectListVO(Wrapper<JiankangjiangtanEntity> wrapper);
   	
   	JiankangjiangtanVO selectVO(@Param("ew") Wrapper<JiankangjiangtanEntity> wrapper);
   	
   	List<JiankangjiangtanView> selectListView(Wrapper<JiankangjiangtanEntity> wrapper);
   	
   	JiankangjiangtanView selectView(@Param("ew") Wrapper<JiankangjiangtanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangjiangtanEntity> wrapper);
   	
}


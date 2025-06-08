package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiankangjiangtanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiankangjiangtanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiankangjiangtanView;


/**
 * 健康讲坛评论表
 *
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public interface DiscussjiankangjiangtanService extends IService<DiscussjiankangjiangtanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiankangjiangtanVO> selectListVO(Wrapper<DiscussjiankangjiangtanEntity> wrapper);
   	
   	DiscussjiankangjiangtanVO selectVO(@Param("ew") Wrapper<DiscussjiankangjiangtanEntity> wrapper);
   	
   	List<DiscussjiankangjiangtanView> selectListView(Wrapper<DiscussjiankangjiangtanEntity> wrapper);
   	
   	DiscussjiankangjiangtanView selectView(@Param("ew") Wrapper<DiscussjiankangjiangtanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiankangjiangtanEntity> wrapper);
   	
}


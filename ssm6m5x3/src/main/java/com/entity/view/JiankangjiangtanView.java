package com.entity.view;

import com.entity.JiankangjiangtanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康讲坛
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
@TableName("jiankangjiangtan")
public class JiankangjiangtanView  extends JiankangjiangtanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangjiangtanView(){
	}
 
 	public JiankangjiangtanView(JiankangjiangtanEntity jiankangjiangtanEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangjiangtanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

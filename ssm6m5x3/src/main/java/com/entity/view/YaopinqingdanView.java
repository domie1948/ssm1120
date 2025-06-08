package com.entity.view;

import com.entity.YaopinqingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 药品清单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
@TableName("yaopinqingdan")
public class YaopinqingdanView  extends YaopinqingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaopinqingdanView(){
	}
 
 	public YaopinqingdanView(YaopinqingdanEntity yaopinqingdanEntity){
 	try {
			BeanUtils.copyProperties(this, yaopinqingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

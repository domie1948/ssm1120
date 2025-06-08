package com.entity.vo;

import com.entity.BingfangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 病房
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public class BingfangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 总床位数
	 */
	
	private Integer zongchuangweishu;
		
	/**
	 * 空床数目
	 */
	
	private Integer kongchuangshumu;
		
	/**
	 * 实际使用率
	 */
	
	private String shijishiyonglv;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：总床位数
	 */
	 
	public void setZongchuangweishu(Integer zongchuangweishu) {
		this.zongchuangweishu = zongchuangweishu;
	}
	
	/**
	 * 获取：总床位数
	 */
	public Integer getZongchuangweishu() {
		return zongchuangweishu;
	}
				
	
	/**
	 * 设置：空床数目
	 */
	 
	public void setKongchuangshumu(Integer kongchuangshumu) {
		this.kongchuangshumu = kongchuangshumu;
	}
	
	/**
	 * 获取：空床数目
	 */
	public Integer getKongchuangshumu() {
		return kongchuangshumu;
	}
				
	
	/**
	 * 设置：实际使用率
	 */
	 
	public void setShijishiyonglv(String shijishiyonglv) {
		this.shijishiyonglv = shijishiyonglv;
	}
	
	/**
	 * 获取：实际使用率
	 */
	public String getShijishiyonglv() {
		return shijishiyonglv;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}

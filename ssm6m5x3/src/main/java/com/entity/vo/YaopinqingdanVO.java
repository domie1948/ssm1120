package com.entity.vo;

import com.entity.YaopinqingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 药品清单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public class YaopinqingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 病人姓名
	 */
	
	private String bingrenxingming;
		
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 医护工号
	 */
	
	private String yihugonghao;
		
	/**
	 * 医护姓名
	 */
	
	private String yihuxingming;
		
	/**
	 * 药品清单
	 */
	
	private String yaopinqingdan;
		
	/**
	 * 总计费用
	 */
	
	private Integer zongjifeiyong;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：病人姓名
	 */
	 
	public void setBingrenxingming(String bingrenxingming) {
		this.bingrenxingming = bingrenxingming;
	}
	
	/**
	 * 获取：病人姓名
	 */
	public String getBingrenxingming() {
		return bingrenxingming;
	}
				
	
	/**
	 * 设置：手机号
	 */
	 
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
				
	
	/**
	 * 设置：医护工号
	 */
	 
	public void setYihugonghao(String yihugonghao) {
		this.yihugonghao = yihugonghao;
	}
	
	/**
	 * 获取：医护工号
	 */
	public String getYihugonghao() {
		return yihugonghao;
	}
				
	
	/**
	 * 设置：医护姓名
	 */
	 
	public void setYihuxingming(String yihuxingming) {
		this.yihuxingming = yihuxingming;
	}
	
	/**
	 * 获取：医护姓名
	 */
	public String getYihuxingming() {
		return yihuxingming;
	}
				
	
	/**
	 * 设置：药品清单
	 */
	 
	public void setYaopinqingdan(String yaopinqingdan) {
		this.yaopinqingdan = yaopinqingdan;
	}
	
	/**
	 * 获取：药品清单
	 */
	public String getYaopinqingdan() {
		return yaopinqingdan;
	}
				
	
	/**
	 * 设置：总计费用
	 */
	 
	public void setZongjifeiyong(Integer zongjifeiyong) {
		this.zongjifeiyong = zongjifeiyong;
	}
	
	/**
	 * 获取：总计费用
	 */
	public Integer getZongjifeiyong() {
		return zongjifeiyong;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}

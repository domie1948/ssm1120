package com.entity.vo;

import com.entity.YiliaofeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 医疗费用
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public class YiliaofeiyongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 病房号
	 */
	
	private String bingfanghao;
		
	/**
	 * 项目费用
	 */
	
	private Integer xiangmufeiyong;
		
	/**
	 * 检测费用
	 */
	
	private Integer jiancefeiyong;
		
	/**
	 * 药费费用
	 */
	
	private Integer yaofeifeiyong;
		
	/**
	 * 总费用
	 */
	
	private String zongfeiyong;
		
	/**
	 * 医护工号
	 */
	
	private String yihugonghao;
		
	/**
	 * 医护姓名
	 */
	
	private String yihuxingming;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：病房号
	 */
	 
	public void setBingfanghao(String bingfanghao) {
		this.bingfanghao = bingfanghao;
	}
	
	/**
	 * 获取：病房号
	 */
	public String getBingfanghao() {
		return bingfanghao;
	}
				
	
	/**
	 * 设置：项目费用
	 */
	 
	public void setXiangmufeiyong(Integer xiangmufeiyong) {
		this.xiangmufeiyong = xiangmufeiyong;
	}
	
	/**
	 * 获取：项目费用
	 */
	public Integer getXiangmufeiyong() {
		return xiangmufeiyong;
	}
				
	
	/**
	 * 设置：检测费用
	 */
	 
	public void setJiancefeiyong(Integer jiancefeiyong) {
		this.jiancefeiyong = jiancefeiyong;
	}
	
	/**
	 * 获取：检测费用
	 */
	public Integer getJiancefeiyong() {
		return jiancefeiyong;
	}
				
	
	/**
	 * 设置：药费费用
	 */
	 
	public void setYaofeifeiyong(Integer yaofeifeiyong) {
		this.yaofeifeiyong = yaofeifeiyong;
	}
	
	/**
	 * 获取：药费费用
	 */
	public Integer getYaofeifeiyong() {
		return yaofeifeiyong;
	}
				
	
	/**
	 * 设置：总费用
	 */
	 
	public void setZongfeiyong(String zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	
	/**
	 * 获取：总费用
	 */
	public String getZongfeiyong() {
		return zongfeiyong;
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

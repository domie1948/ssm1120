package com.entity.vo;

import com.entity.BingrenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 病人信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
public class BingrenxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 病房号
	 */
	
	private String bingfanghao;
		
	/**
	 * 床号
	 */
	
	private String chuanghao;
		
	/**
	 * 医护工号
	 */
	
	private String yihugonghao;
		
	/**
	 * 医护姓名
	 */
	
	private String yihuxingming;
		
	/**
	 * 病史
	 */
	
	private String bingshi;
		
	/**
	 * 入院时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ruyuanshijian;
		
	/**
	 * 住院费用
	 */
	
	private Integer zhuyuanfeiyong;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
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
	 * 设置：床号
	 */
	 
	public void setChuanghao(String chuanghao) {
		this.chuanghao = chuanghao;
	}
	
	/**
	 * 获取：床号
	 */
	public String getChuanghao() {
		return chuanghao;
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
	 * 设置：病史
	 */
	 
	public void setBingshi(String bingshi) {
		this.bingshi = bingshi;
	}
	
	/**
	 * 获取：病史
	 */
	public String getBingshi() {
		return bingshi;
	}
				
	
	/**
	 * 设置：入院时间
	 */
	 
	public void setRuyuanshijian(Date ruyuanshijian) {
		this.ruyuanshijian = ruyuanshijian;
	}
	
	/**
	 * 获取：入院时间
	 */
	public Date getRuyuanshijian() {
		return ruyuanshijian;
	}
				
	
	/**
	 * 设置：住院费用
	 */
	 
	public void setZhuyuanfeiyong(Integer zhuyuanfeiyong) {
		this.zhuyuanfeiyong = zhuyuanfeiyong;
	}
	
	/**
	 * 获取：住院费用
	 */
	public Integer getZhuyuanfeiyong() {
		return zhuyuanfeiyong;
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

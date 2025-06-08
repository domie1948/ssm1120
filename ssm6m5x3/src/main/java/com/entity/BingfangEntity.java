package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 病房
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-20 10:02:09
 */
@TableName("bingfang")
public class BingfangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BingfangEntity() {
		
	}
	
	public BingfangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 病房号
	 */
					
	private String bingfanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

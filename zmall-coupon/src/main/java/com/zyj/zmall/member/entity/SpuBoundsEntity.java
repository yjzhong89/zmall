package com.zyj.zmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * 
 * @author zyj
 * @email zyj@gmail.com
 * @date 2020-12-05 20:19:38
 */
@TableName("sms_spu_bounds")
public class SpuBoundsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long spuId;
	/**
	 * 
	 */
	private BigDecimal growBounds;
	/**
	 * 
	 */
	private BigDecimal buyBounds;
	/**
	 * 
	 */
	private Integer work;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSpuId() {
		return spuId;
	}

	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}

	public BigDecimal getGrowBounds() {
		return growBounds;
	}

	public void setGrowBounds(BigDecimal growBounds) {
		this.growBounds = growBounds;
	}

	public BigDecimal getBuyBounds() {
		return buyBounds;
	}

	public void setBuyBounds(BigDecimal buyBounds) {
		this.buyBounds = buyBounds;
	}

	public Integer getWork() {
		return work;
	}

	public void setWork(Integer work) {
		this.work = work;
	}
}

package com.zyj.zmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 
 * 
 * @author zyj
 * @email zyj@gmail.com
 * @date 2020-12-05 17:38:52
 */
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long catId;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private Long parentCid;
	/**
	 * 
	 */
	private Integer catLevel;
	/**
	 * 
	 */
	private Integer showStatus;
	/**
	 * 
	 */
	private Integer sort;
	/**
	 * 
	 */
	private String icon;
	/**
	 * 
	 */
	private String productUnit;
	/**
	 * 
	 */
	private Integer productCount;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getCatId() {
		return catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentCid() {
		return parentCid;
	}

	public void setParentCid(Long parentCid) {
		this.parentCid = parentCid;
	}

	public Integer getCatLevel() {
		return catLevel;
	}

	public void setCatLevel(Integer catLevel) {
		this.catLevel = catLevel;
	}

	public Integer getShowStatus() {
		return showStatus;
	}

	public void setShowStatus(Integer showStatus) {
		this.showStatus = showStatus;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}
}

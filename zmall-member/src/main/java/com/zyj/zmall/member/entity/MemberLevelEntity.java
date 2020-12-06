package com.zyj.zmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;

/**
 * 
 * 
 * @author zyj
 * @email zyj@gmail.com
 * @date 2020-12-05 20:37:02
 */
@TableName("ums_member_level")
public class MemberLevelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private Integer growthPoint;
	/**
	 * 
	 */
	private Integer defaultStatus;
	/**
	 * 
	 */
	private BigDecimal freeFreightPoint;
	/**
	 * 
	 */
	private Integer commentGrowthPoint;
	/**
	 * 
	 */
	private Integer priviledgeFreeFreight;
	/**
	 * 
	 */
	private Integer priviledgeMemberPrice;
	/**
	 * 
	 */
	private Integer priviledgeBirthday;
	/**
	 * 
	 */
	private String note;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGrowthPoint() {
		return growthPoint;
	}

	public void setGrowthPoint(Integer growthPoint) {
		this.growthPoint = growthPoint;
	}

	public Integer getDefaultStatus() {
		return defaultStatus;
	}

	public void setDefaultStatus(Integer defaultStatus) {
		this.defaultStatus = defaultStatus;
	}

	public BigDecimal getFreeFreightPoint() {
		return freeFreightPoint;
	}

	public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
		this.freeFreightPoint = freeFreightPoint;
	}

	public Integer getCommentGrowthPoint() {
		return commentGrowthPoint;
	}

	public void setCommentGrowthPoint(Integer commentGrowthPoint) {
		this.commentGrowthPoint = commentGrowthPoint;
	}

	public Integer getPriviledgeFreeFreight() {
		return priviledgeFreeFreight;
	}

	public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
		this.priviledgeFreeFreight = priviledgeFreeFreight;
	}

	public Integer getPriviledgeMemberPrice() {
		return priviledgeMemberPrice;
	}

	public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
		this.priviledgeMemberPrice = priviledgeMemberPrice;
	}

	public Integer getPriviledgeBirthday() {
		return priviledgeBirthday;
	}

	public void setPriviledgeBirthday(Integer priviledgeBirthday) {
		this.priviledgeBirthday = priviledgeBirthday;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}

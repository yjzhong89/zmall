package com.zyj.zmall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author zyj
 * @email zyj@gmail.com
 * @date 2020-12-05 20:50:09
 */
@TableName("oms_order_return_apply")
public class OrderReturnApplyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long orderId;
	/**
	 * 
	 */
	private Long skuId;
	/**
	 * 
	 */
	private String orderSn;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private String memberUsername;
	/**
	 * 
	 */
	private BigDecimal returnAmount;
	/**
	 * 
	 */
	private String returnName;
	/**
	 * 
	 */
	private String returnPhone;
	/**
	 * 
	 */
	private Integer status;
	/**
	 * 
	 */
	private Date handleTime;
	/**
	 * 
	 */
	private String skuImg;
	/**
	 * 
	 */
	private String skuName;
	/**
	 * 
	 */
	private String skuBrand;
	/**
	 * 
	 */
	private String skuAttrsVals;
	/**
	 * 
	 */
	private Integer skuCount;
	/**
	 * 
	 */
	private BigDecimal skuPrice;
	/**
	 * 
	 */
	private BigDecimal skuRealPrice;
	/**
	 * 
	 */
	private String reason;
	/**
	 * 
	 */
	private String descriptionêö;
	/**
	 * 
	 */
	private String descPics;
	/**
	 * 
	 */
	private String handleNote;
	/**
	 * 
	 */
	private String handleMan;
	/**
	 * 
	 */
	private String receiveMan;
	/**
	 * 
	 */
	private Date receiveTime;
	/**
	 * 
	 */
	private String receiveNote;
	/**
	 * 
	 */
	private String receivePhone;
	/**
	 * 
	 */
	private String companyAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getOrderSn() {
		return orderSn;
	}

	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getMemberUsername() {
		return memberUsername;
	}

	public void setMemberUsername(String memberUsername) {
		this.memberUsername = memberUsername;
	}

	public BigDecimal getReturnAmount() {
		return returnAmount;
	}

	public void setReturnAmount(BigDecimal returnAmount) {
		this.returnAmount = returnAmount;
	}

	public String getReturnName() {
		return returnName;
	}

	public void setReturnName(String returnName) {
		this.returnName = returnName;
	}

	public String getReturnPhone() {
		return returnPhone;
	}

	public void setReturnPhone(String returnPhone) {
		this.returnPhone = returnPhone;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getHandleTime() {
		return handleTime;
	}

	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}

	public String getSkuImg() {
		return skuImg;
	}

	public void setSkuImg(String skuImg) {
		this.skuImg = skuImg;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getSkuBrand() {
		return skuBrand;
	}

	public void setSkuBrand(String skuBrand) {
		this.skuBrand = skuBrand;
	}

	public String getSkuAttrsVals() {
		return skuAttrsVals;
	}

	public void setSkuAttrsVals(String skuAttrsVals) {
		this.skuAttrsVals = skuAttrsVals;
	}

	public Integer getSkuCount() {
		return skuCount;
	}

	public void setSkuCount(Integer skuCount) {
		this.skuCount = skuCount;
	}

	public BigDecimal getSkuPrice() {
		return skuPrice;
	}

	public void setSkuPrice(BigDecimal skuPrice) {
		this.skuPrice = skuPrice;
	}

	public BigDecimal getSkuRealPrice() {
		return skuRealPrice;
	}

	public void setSkuRealPrice(BigDecimal skuRealPrice) {
		this.skuRealPrice = skuRealPrice;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDescriptionêö() {
		return descriptionêö;
	}

	public void setDescriptionêö(String descriptionêö) {
		this.descriptionêö = descriptionêö;
	}

	public String getDescPics() {
		return descPics;
	}

	public void setDescPics(String descPics) {
		this.descPics = descPics;
	}

	public String getHandleNote() {
		return handleNote;
	}

	public void setHandleNote(String handleNote) {
		this.handleNote = handleNote;
	}

	public String getHandleMan() {
		return handleMan;
	}

	public void setHandleMan(String handleMan) {
		this.handleMan = handleMan;
	}

	public String getReceiveMan() {
		return receiveMan;
	}

	public void setReceiveMan(String receiveMan) {
		this.receiveMan = receiveMan;
	}

	public Date getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public String getReceiveNote() {
		return receiveNote;
	}

	public void setReceiveNote(String receiveNote) {
		this.receiveNote = receiveNote;
	}

	public String getReceivePhone() {
		return receivePhone;
	}

	public void setReceivePhone(String receivePhone) {
		this.receivePhone = receivePhone;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
}

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
@TableName("oms_refund_info")
public class RefundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long orderReturnId;
	/**
	 * 
	 */
	private BigDecimal refund;
	/**
	 * 
	 */
	private String refundSn;
	/**
	 * 
	 */
	private Integer refundStatus;
	/**
	 * 
	 */
	private Integer refundChannel;
	/**
	 * 
	 */
	private String refundContent;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderReturnId() {
		return orderReturnId;
	}

	public void setOrderReturnId(Long orderReturnId) {
		this.orderReturnId = orderReturnId;
	}

	public BigDecimal getRefund() {
		return refund;
	}

	public void setRefund(BigDecimal refund) {
		this.refund = refund;
	}

	public String getRefundSn() {
		return refundSn;
	}

	public void setRefundSn(String refundSn) {
		this.refundSn = refundSn;
	}

	public Integer getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(Integer refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Integer getRefundChannel() {
		return refundChannel;
	}

	public void setRefundChannel(Integer refundChannel) {
		this.refundChannel = refundChannel;
	}

	public String getRefundContent() {
		return refundContent;
	}

	public void setRefundContent(String refundContent) {
		this.refundContent = refundContent;
	}
}

package com.zyj.zmall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author zyj
 * @email zyj@gmail.com
 * @date 2020-12-05 20:50:09
 */
@TableName("oms_order_setting")
public class OrderSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Integer flashOrderOvertime;
	/**
	 * 
	 */
	private Integer normalOrderOvertime;
	/**
	 * 
	 */
	private Integer confirmOvertime;
	/**
	 * 
	 */
	private Integer finishOvertime;
	/**
	 * 
	 */
	private Integer commentOvertime;
	/**
	 * 
	 */
	private Integer memberLevel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getFlashOrderOvertime() {
		return flashOrderOvertime;
	}

	public void setFlashOrderOvertime(Integer flashOrderOvertime) {
		this.flashOrderOvertime = flashOrderOvertime;
	}

	public Integer getNormalOrderOvertime() {
		return normalOrderOvertime;
	}

	public void setNormalOrderOvertime(Integer normalOrderOvertime) {
		this.normalOrderOvertime = normalOrderOvertime;
	}

	public Integer getConfirmOvertime() {
		return confirmOvertime;
	}

	public void setConfirmOvertime(Integer confirmOvertime) {
		this.confirmOvertime = confirmOvertime;
	}

	public Integer getFinishOvertime() {
		return finishOvertime;
	}

	public void setFinishOvertime(Integer finishOvertime) {
		this.finishOvertime = finishOvertime;
	}

	public Integer getCommentOvertime() {
		return commentOvertime;
	}

	public void setCommentOvertime(Integer commentOvertime) {
		this.commentOvertime = commentOvertime;
	}

	public Integer getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(Integer memberLevel) {
		this.memberLevel = memberLevel;
	}
}

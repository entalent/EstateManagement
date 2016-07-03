package com.estatemanagement.domain;

import java.sql.Timestamp;

public class ComplainBean {
	private int complainId;
	private Timestamp complainTime;
	private int userId;
	private int handlerId;
	private Timestamp handlerTime;
	private String complainText;
	private String remark;
	public ComplainBean(int complainId, Timestamp complainTime, int userId,
			int handlerId, Timestamp handlerTime, String complainText,
			String remark) {
		super();
		this.complainId = complainId;
		this.complainTime = complainTime;
		this.userId = userId;
		this.handlerId = handlerId;
		this.handlerTime = handlerTime;
		this.complainText = complainText;
		this.remark = remark;
	}
	public ComplainBean() {
		super();
	}
	public int getComplainId() {
		return complainId;
	}
	public void setComplainId(int complainId) {
		this.complainId = complainId;
	}
	public Timestamp getComplainTime() {
		return complainTime;
	}
	public void setComplainTime(Timestamp complainTime) {
		this.complainTime = complainTime;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getHandlerId() {
		return handlerId;
	}
	public void setHandlerId(int handlerId) {
		this.handlerId = handlerId;
	}
	public Timestamp getHandlerTime() {
		return handlerTime;
	}
	public void setHandlerTime(Timestamp handlerTime) {
		this.handlerTime = handlerTime;
	}
	public String getComplainText() {
		return complainText;
	}
	public void setComplainText(String complainText) {
		this.complainText = complainText;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + complainId;
		result = prime * result
				+ ((complainText == null) ? 0 : complainText.hashCode());
		result = prime * result
				+ ((complainTime == null) ? 0 : complainTime.hashCode());
		result = prime * result + handlerId;
		result = prime * result
				+ ((handlerTime == null) ? 0 : handlerTime.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + userId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComplainBean other = (ComplainBean) obj;
		if (complainId != other.complainId)
			return false;
		if (complainText == null) {
			if (other.complainText != null)
				return false;
		} else if (!complainText.equals(other.complainText))
			return false;
		if (complainTime == null) {
			if (other.complainTime != null)
				return false;
		} else if (!complainTime.equals(other.complainTime))
			return false;
		if (handlerId != other.handlerId)
			return false;
		if (handlerTime == null) {
			if (other.handlerTime != null)
				return false;
		} else if (!handlerTime.equals(other.handlerTime))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
}

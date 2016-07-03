package com.estatemanagement.domain;

import java.sql.Timestamp;

public class SecurityLog {
	private int userId;
	private String securityStatus;
	private Timestamp createTime;
	public SecurityLog(int userId, String securityStatus, Timestamp createTime) {
		super();
		this.userId = userId;
		this.securityStatus = securityStatus;
		this.createTime = createTime;
	}
	public SecurityLog() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSecurityStatus() {
		return securityStatus;
	}
	public void setSecurityStatus(String securityStatus) {
		this.securityStatus = securityStatus;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((securityStatus == null) ? 0 : securityStatus.hashCode());
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
		SecurityLog other = (SecurityLog) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (securityStatus == null) {
			if (other.securityStatus != null)
				return false;
		} else if (!securityStatus.equals(other.securityStatus))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
}

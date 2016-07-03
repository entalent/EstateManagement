package com.estatemanagement.domain;

import java.sql.Timestamp;

public class SecurityBean {
	private int securityId;
	private int userId;
	private int classId;
	private Timestamp hireTime;
	public SecurityBean(int securityId, int userId, int classId,
			Timestamp hireTime) {
		super();
		this.securityId = securityId;
		this.userId = userId;
		this.classId = classId;
		this.hireTime = hireTime;
	}
	public SecurityBean() {
		super();
	}
	public int getSecurityId() {
		return securityId;
	}
	public void setSecurityId(int securityId) {
		this.securityId = securityId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public Timestamp getHireTime() {
		return hireTime;
	}
	public void setHireTime(Timestamp hireTime) {
		this.hireTime = hireTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classId;
		result = prime * result
				+ ((hireTime == null) ? 0 : hireTime.hashCode());
		result = prime * result + securityId;
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
		SecurityBean other = (SecurityBean) obj;
		if (classId != other.classId)
			return false;
		if (hireTime == null) {
			if (other.hireTime != null)
				return false;
		} else if (!hireTime.equals(other.hireTime))
			return false;
		if (securityId != other.securityId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
}

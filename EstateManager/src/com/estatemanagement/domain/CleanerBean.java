package com.estatemanagement.domain;

import java.sql.Timestamp;

public class CleanerBean {
	private int userId;
	private int cleanerId;
	private int classId;
	private Timestamp hireTime;
	public CleanerBean(int userId, int cleanerId, int classId,
			Timestamp hireTime) {
		super();
		this.userId = userId;
		this.cleanerId = cleanerId;
		this.classId = classId;
		this.hireTime = hireTime;
	}
	public CleanerBean() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCleanerId() {
		return cleanerId;
	}
	public void setCleanerId(int cleanerId) {
		this.cleanerId = cleanerId;
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
		result = prime * result + cleanerId;
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
		CleanerBean other = (CleanerBean) obj;
		if (classId != other.classId)
			return false;
		if (hireTime == null) {
			if (other.hireTime != null)
				return false;
		} else if (!hireTime.equals(other.hireTime))
			return false;
		if (cleanerId != other.cleanerId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
}

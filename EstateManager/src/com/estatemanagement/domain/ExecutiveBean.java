package com.estatemanagement.domain;

import java.sql.Timestamp;

public class ExecutiveBean {
	private int userId;
	private int executiveId;
	private int departmentId;
	private String executiveAddress;
	private Timestamp executiveHireTime;
	public ExecutiveBean(int userId, int executiveId, int departmentId,
			String executiveAddress, Timestamp executiveHireTime) {
		super();
		this.userId = userId;
		this.executiveId = executiveId;
		this.departmentId = departmentId;
		this.executiveAddress = executiveAddress;
		this.executiveHireTime = executiveHireTime;
	}
	public ExecutiveBean() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getExecutiveId() {
		return executiveId;
	}
	public void setExecutiveId(int executiveId) {
		this.executiveId = executiveId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getExecutiveAddress() {
		return executiveAddress;
	}
	public void setExecutiveAddress(String executiveAddress) {
		this.executiveAddress = executiveAddress;
	}
	public Timestamp getExecutiveHireTime() {
		return executiveHireTime;
	}
	public void setExecutiveHireTime(Timestamp executiveHireTime) {
		this.executiveHireTime = executiveHireTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departmentId;
		result = prime
				* result
				+ ((executiveAddress == null) ? 0 : executiveAddress.hashCode());
		result = prime
				* result
				+ ((executiveHireTime == null) ? 0 : executiveHireTime
						.hashCode());
		result = prime * result + executiveId;
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
		ExecutiveBean other = (ExecutiveBean) obj;
		if (departmentId != other.departmentId)
			return false;
		if (executiveAddress == null) {
			if (other.executiveAddress != null)
				return false;
		} else if (!executiveAddress.equals(other.executiveAddress))
			return false;
		if (executiveHireTime == null) {
			if (other.executiveHireTime != null)
				return false;
		} else if (!executiveHireTime.equals(other.executiveHireTime))
			return false;
		if (executiveId != other.executiveId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
}

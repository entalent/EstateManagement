package com.estatemanagement.domain;

import java.sql.Timestamp;

public class CleanLogBean {
	private int logId;
	private String managerStatus;
	private Timestamp createTime;
	public CleanLogBean(int logId, String managerStatus, Timestamp createTime) {
		super();
		this.logId = logId;
		this.managerStatus = managerStatus;
		this.createTime = createTime;
	}
	public CleanLogBean() {
		super();
	}
	public int getLogId() {
		return logId;
	}
	public void setLogId(int logId) {
		this.logId = logId;
	}
	public String getManagerStatus() {
		return managerStatus;
	}
	public void setManagerStatus(String managerStatus) {
		this.managerStatus = managerStatus;
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
		result = prime * result + logId;
		result = prime * result
				+ ((managerStatus == null) ? 0 : managerStatus.hashCode());
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
		CleanLogBean other = (CleanLogBean) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (logId != other.logId)
			return false;
		if (managerStatus == null) {
			if (other.managerStatus != null)
				return false;
		} else if (!managerStatus.equals(other.managerStatus))
			return false;
		return true;
	}
	
}

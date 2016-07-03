package com.estatemanagement.domain;

import java.sql.Timestamp;

public class CleanWorkBean {
	private int workId;
	private int userId;
	private String dayTable;
	private String weekTable;
	private String monthTable;
	private String yearTable;
	private Timestamp createTime;
	public CleanWorkBean(int workId, int userId, String dayTable, String weekTable,
			String monthTable, String yearTable, Timestamp createTime) {
		super();
		this.workId = workId;
		this.userId = userId;
		this.dayTable = dayTable;
		this.weekTable = weekTable;
		this.monthTable = monthTable;
		this.yearTable = yearTable;
		this.createTime = createTime;
	}
	public CleanWorkBean() {
		super();
	}
	public int getWorkId() {
		return workId;
	}
	public void setWorkId(int workId) {
		this.workId = workId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getDayTable() {
		return dayTable;
	}
	public void setDayTable(String dayTable) {
		this.dayTable = dayTable;
	}
	public String getWeekTable() {
		return weekTable;
	}
	public void setWeekTable(String weekTable) {
		this.weekTable = weekTable;
	}
	public String getMonthTable() {
		return monthTable;
	}
	public void setMonthTable(String monthTable) {
		this.monthTable = monthTable;
	}
	public String getYearTable() {
		return yearTable;
	}
	public void setYearTable(String yearTable) {
		this.yearTable = yearTable;
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
				+ ((dayTable == null) ? 0 : dayTable.hashCode());
		result = prime * result
				+ ((monthTable == null) ? 0 : monthTable.hashCode());
		result = prime * result + userId;
		result = prime * result
				+ ((weekTable == null) ? 0 : weekTable.hashCode());
		result = prime * result + workId;
		result = prime * result
				+ ((yearTable == null) ? 0 : yearTable.hashCode());
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
		CleanWorkBean other = (CleanWorkBean) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (dayTable == null) {
			if (other.dayTable != null)
				return false;
		} else if (!dayTable.equals(other.dayTable))
			return false;
		if (monthTable == null) {
			if (other.monthTable != null)
				return false;
		} else if (!monthTable.equals(other.monthTable))
			return false;
		if (userId != other.userId)
			return false;
		if (weekTable == null) {
			if (other.weekTable != null)
				return false;
		} else if (!weekTable.equals(other.weekTable))
			return false;
		if (workId != other.workId)
			return false;
		if (yearTable == null) {
			if (other.yearTable != null)
				return false;
		} else if (!yearTable.equals(other.yearTable))
			return false;
		return true;
	}
	
}

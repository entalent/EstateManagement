package com.estatemanagement.domain;

public class HousePropertyBean {
	private int HouseId;
	private int UserId;
	private int UserInnTime;
	private int UserOutTime;
	private int UserEmergencyTel;
	public HousePropertyBean(int houseId, int userId, int userInnTime,
			int userOutTime, int userEmergencyTel) {
		super();
		HouseId = houseId;
		UserId = userId;
		UserInnTime = userInnTime;
		UserOutTime = userOutTime;
		UserEmergencyTel = userEmergencyTel;
	}
	public HousePropertyBean() {
		super();
	}
	public int getHouseId() {
		return HouseId;
	}
	public void setHouseId(int houseId) {
		HouseId = houseId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public int getUserInnTime() {
		return UserInnTime;
	}
	public void setUserInnTime(int userInnTime) {
		UserInnTime = userInnTime;
	}
	public int getUserOutTime() {
		return UserOutTime;
	}
	public void setUserOutTime(int userOutTime) {
		UserOutTime = userOutTime;
	}
	public int getUserEmergencyTel() {
		return UserEmergencyTel;
	}
	public void setUserEmergencyTel(int userEmergencyTel) {
		UserEmergencyTel = userEmergencyTel;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + HouseId;
		result = prime * result + UserEmergencyTel;
		result = prime * result + UserId;
		result = prime * result + UserInnTime;
		result = prime * result + UserOutTime;
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
		HousePropertyBean other = (HousePropertyBean) obj;
		if (HouseId != other.HouseId)
			return false;
		if (UserEmergencyTel != other.UserEmergencyTel)
			return false;
		if (UserId != other.UserId)
			return false;
		if (UserInnTime != other.UserInnTime)
			return false;
		if (UserOutTime != other.UserOutTime)
			return false;
		return true;
	}
	
}

package com.estatemanagement.domain;

import java.sql.Timestamp;

public class ParkingBean {
	private int parkingId;
	private String parkingLocation;
	private int userId;
	private Timestamp startTime;
	private Timestamp EndTime;
	private String parkingStatus;
	private float parkingFee;
	public ParkingBean(int parkingId, String parkingLocation, int userId,
			Timestamp startTime, Timestamp endTime, String parkingStatus,
			float parkingFee) {
		super();
		this.parkingId = parkingId;
		this.parkingLocation = parkingLocation;
		this.userId = userId;
		this.startTime = startTime;
		EndTime = endTime;
		this.parkingStatus = parkingStatus;
		this.parkingFee = parkingFee;
	}
	public ParkingBean() {
		super();
	}
	public int getParkingId() {
		return parkingId;
	}
	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}
	public String getParkingLocation() {
		return parkingLocation;
	}
	public void setParkingLocation(String parkingLocation) {
		this.parkingLocation = parkingLocation;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return EndTime;
	}
	public void setEndTime(Timestamp endTime) {
		EndTime = endTime;
	}
	public String getParkingStatus() {
		return parkingStatus;
	}
	public void setParkingStatus(String parkingStatus) {
		this.parkingStatus = parkingStatus;
	}
	public float getParkingFee() {
		return parkingFee;
	}
	public void setParkingFee(float parkingFee) {
		this.parkingFee = parkingFee;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EndTime == null) ? 0 : EndTime.hashCode());
		result = prime * result + Float.floatToIntBits(parkingFee);
		result = prime * result + parkingId;
		result = prime * result
				+ ((parkingLocation == null) ? 0 : parkingLocation.hashCode());
		result = prime * result
				+ ((parkingStatus == null) ? 0 : parkingStatus.hashCode());
		result = prime * result
				+ ((startTime == null) ? 0 : startTime.hashCode());
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
		ParkingBean other = (ParkingBean) obj;
		if (EndTime == null) {
			if (other.EndTime != null)
				return false;
		} else if (!EndTime.equals(other.EndTime))
			return false;
		if (Float.floatToIntBits(parkingFee) != Float
				.floatToIntBits(other.parkingFee))
			return false;
		if (parkingId != other.parkingId)
			return false;
		if (parkingLocation == null) {
			if (other.parkingLocation != null)
				return false;
		} else if (!parkingLocation.equals(other.parkingLocation))
			return false;
		if (parkingStatus == null) {
			if (other.parkingStatus != null)
				return false;
		} else if (!parkingStatus.equals(other.parkingStatus))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
}

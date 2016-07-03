package com.estatemanagement.domain;

import java.sql.Timestamp;

public class FeeBean {
	private int feeId;
	private int userId;
	private Timestamp createTime;
	private float waterFee;
	private float elecFee;
	private float gasFee;
	private float parkingFee;
	private float propertyFee;
	private float otherFee;
	private float paid;
	private Timestamp payTime;
	private int handlerId;
	private String remark;
	public FeeBean(int feeId, int userId, Timestamp createTime, float waterFee,
			float elecFee, float gasFee, float parkingFee, float propertyFee,
			float otherFee, float paid, Timestamp payTime, int handlerId,
			String remark) {
		super();
		this.feeId = feeId;
		this.userId = userId;
		this.createTime = createTime;
		this.waterFee = waterFee;
		this.elecFee = elecFee;
		this.gasFee = gasFee;
		this.parkingFee = parkingFee;
		this.propertyFee = propertyFee;
		this.otherFee = otherFee;
		this.paid = paid;
		this.payTime = payTime;
		this.handlerId = handlerId;
		this.remark = remark;
	}
	public FeeBean() {
		super();
	}
	public int getFeeId() {
		return feeId;
	}
	public void setFeeId(int feeId) {
		this.feeId = feeId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public float getWaterFee() {
		return waterFee;
	}
	public void setWaterFee(float waterFee) {
		this.waterFee = waterFee;
	}
	public float getElecFee() {
		return elecFee;
	}
	public void setElecFee(float elecFee) {
		this.elecFee = elecFee;
	}
	public float getGasFee() {
		return gasFee;
	}
	public void setGasFee(float gasFee) {
		this.gasFee = gasFee;
	}
	public float getParkingFee() {
		return parkingFee;
	}
	public void setParkingFee(float parkingFee) {
		this.parkingFee = parkingFee;
	}
	public float getPropertyFee() {
		return propertyFee;
	}
	public void setPropertyFee(float propertyFee) {
		this.propertyFee = propertyFee;
	}
	public float getOtherFee() {
		return otherFee;
	}
	public void setOtherFee(float otherFee) {
		this.otherFee = otherFee;
	}
	public float getPaid() {
		return paid;
	}
	public void setPaid(float paid) {
		this.paid = paid;
	}
	public Timestamp getPayTime() {
		return payTime;
	}
	public void setPayTime(Timestamp payTime) {
		this.payTime = payTime;
	}
	public int getHandlerId() {
		return handlerId;
	}
	public void setHandlerId(int handlerId) {
		this.handlerId = handlerId;
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
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + Float.floatToIntBits(elecFee);
		result = prime * result + feeId;
		result = prime * result + Float.floatToIntBits(gasFee);
		result = prime * result + handlerId;
		result = prime * result + Float.floatToIntBits(otherFee);
		result = prime * result + Float.floatToIntBits(paid);
		result = prime * result + Float.floatToIntBits(parkingFee);
		result = prime * result + ((payTime == null) ? 0 : payTime.hashCode());
		result = prime * result + Float.floatToIntBits(propertyFee);
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + userId;
		result = prime * result + Float.floatToIntBits(waterFee);
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
		FeeBean other = (FeeBean) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (Float.floatToIntBits(elecFee) != Float
				.floatToIntBits(other.elecFee))
			return false;
		if (feeId != other.feeId)
			return false;
		if (Float.floatToIntBits(gasFee) != Float.floatToIntBits(other.gasFee))
			return false;
		if (handlerId != other.handlerId)
			return false;
		if (Float.floatToIntBits(otherFee) != Float
				.floatToIntBits(other.otherFee))
			return false;
		if (Float.floatToIntBits(paid) != Float.floatToIntBits(other.paid))
			return false;
		if (Float.floatToIntBits(parkingFee) != Float
				.floatToIntBits(other.parkingFee))
			return false;
		if (payTime == null) {
			if (other.payTime != null)
				return false;
		} else if (!payTime.equals(other.payTime))
			return false;
		if (Float.floatToIntBits(propertyFee) != Float
				.floatToIntBits(other.propertyFee))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (userId != other.userId)
			return false;
		if (Float.floatToIntBits(waterFee) != Float
				.floatToIntBits(other.waterFee))
			return false;
		return true;
	}
	
}

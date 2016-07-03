package com.estatemanagement.domain;

import java.sql.Timestamp;

public class KeysBean {
	private int keyId;
	private String keyDescription;
	private int holderId;
	private Timestamp holdStartTime;
	private Timestamp holdEndTime;
	private int isLoss;
	public KeysBean(int keyId, String keyDescription, int holderId,
			Timestamp holdStartTime, Timestamp holdEndTime, int isLoss) {
		super();
		this.keyId = keyId;
		this.keyDescription = keyDescription;
		this.holderId = holderId;
		this.holdStartTime = holdStartTime;
		this.holdEndTime = holdEndTime;
		this.isLoss = isLoss;
	}
	public KeysBean() {
		super();
	}
	public int getKeyId() {
		return keyId;
	}
	public void setKeyId(int keyId) {
		this.keyId = keyId;
	}
	public String getKeyDescription() {
		return keyDescription;
	}
	public void setKeyDescription(String keyDescription) {
		this.keyDescription = keyDescription;
	}
	public int getHolderId() {
		return holderId;
	}
	public void setHolderId(int holderId) {
		this.holderId = holderId;
	}
	public Timestamp getHoldStartTime() {
		return holdStartTime;
	}
	public void setHoldStartTime(Timestamp holdStartTime) {
		this.holdStartTime = holdStartTime;
	}
	public Timestamp getHoldEndTime() {
		return holdEndTime;
	}
	public void setHoldEndTime(Timestamp holdEndTime) {
		this.holdEndTime = holdEndTime;
	}
	public int getIsLoss() {
		return isLoss;
	}
	public void setIsLoss(int isLoss) {
		this.isLoss = isLoss;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((holdEndTime == null) ? 0 : holdEndTime.hashCode());
		result = prime * result
				+ ((holdStartTime == null) ? 0 : holdStartTime.hashCode());
		result = prime * result + holderId;
		result = prime * result + isLoss;
		result = prime * result
				+ ((keyDescription == null) ? 0 : keyDescription.hashCode());
		result = prime * result + keyId;
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
		KeysBean other = (KeysBean) obj;
		if (holdEndTime == null) {
			if (other.holdEndTime != null)
				return false;
		} else if (!holdEndTime.equals(other.holdEndTime))
			return false;
		if (holdStartTime == null) {
			if (other.holdStartTime != null)
				return false;
		} else if (!holdStartTime.equals(other.holdStartTime))
			return false;
		if (holderId != other.holderId)
			return false;
		if (isLoss != other.isLoss)
			return false;
		if (keyDescription == null) {
			if (other.keyDescription != null)
				return false;
		} else if (!keyDescription.equals(other.keyDescription))
			return false;
		if (keyId != other.keyId)
			return false;
		return true;
	}
	
}

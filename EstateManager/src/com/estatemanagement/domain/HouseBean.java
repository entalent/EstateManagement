package com.estatemanagement.domain;

import java.io.Serializable;

public class HouseBean implements Serializable{
	private static final long serialVersionUID = 7354941252731714148L;
	private int houseId;
	private String houseLayout;
	private String houseInfo;
	private String houseCheck;
	private float houseSize;
	private float houseUseSize;
	private String houseName;
	public HouseBean(int houseId, String houseLayout, String houseInfo,
			String houseCheck, float houseSize, float houseUseSize,
			String houseName) {
		super();
		this.houseId = houseId;
		this.houseLayout = houseLayout;
		this.houseInfo = houseInfo;
		this.houseCheck = houseCheck;
		this.houseSize = houseSize;
		this.houseUseSize = houseUseSize;
		this.houseName = houseName;
	}
	public HouseBean() {
		super();
	}
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public String getHouseLayout() {
		return houseLayout;
	}
	public void setHouseLayout(String houseLayout) {
		this.houseLayout = houseLayout;
	}
	public String getHouseInfo() {
		return houseInfo;
	}
	public void setHouseInfo(String houseInfo) {
		this.houseInfo = houseInfo;
	}
	public String getHouseCheck() {
		return houseCheck;
	}
	public void setHouseCheck(String houseCheck) {
		this.houseCheck = houseCheck;
	}
	public float getHouseSize() {
		return houseSize;
	}
	public void setHouseSize(float houseSize) {
		this.houseSize = houseSize;
	}
	public float getHouseUseSize() {
		return houseUseSize;
	}
	public void setHouseUseSize(float houseUseSize) {
		this.houseUseSize = houseUseSize;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((houseCheck == null) ? 0 : houseCheck.hashCode());
		result = prime * result + houseId;
		result = prime * result
				+ ((houseInfo == null) ? 0 : houseInfo.hashCode());
		result = prime * result
				+ ((houseLayout == null) ? 0 : houseLayout.hashCode());
		result = prime * result
				+ ((houseName == null) ? 0 : houseName.hashCode());
		result = prime * result + Float.floatToIntBits(houseSize);
		result = prime * result + Float.floatToIntBits(houseUseSize);
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
		HouseBean other = (HouseBean) obj;
		if (houseCheck == null) {
			if (other.houseCheck != null)
				return false;
		} else if (!houseCheck.equals(other.houseCheck))
			return false;
		if (houseId != other.houseId)
			return false;
		if (houseInfo == null) {
			if (other.houseInfo != null)
				return false;
		} else if (!houseInfo.equals(other.houseInfo))
			return false;
		if (houseLayout == null) {
			if (other.houseLayout != null)
				return false;
		} else if (!houseLayout.equals(other.houseLayout))
			return false;
		if (houseName == null) {
			if (other.houseName != null)
				return false;
		} else if (!houseName.equals(other.houseName))
			return false;
		if (Float.floatToIntBits(houseSize) != Float
				.floatToIntBits(other.houseSize))
			return false;
		if (Float.floatToIntBits(houseUseSize) != Float
				.floatToIntBits(other.houseUseSize))
			return false;
		return true;
	}
	
}

package com.estatemanagement.domain;

import java.sql.Timestamp;

public class HouseExchangeBean {
	private int userPre;
	private int userNew;
	private int houseId;
	private Timestamp saleTime;
	private Timestamp buyTime;
	public HouseExchangeBean(int userPre, int userNew, int houseId,
			Timestamp saleTime, Timestamp buyTime) {
		super();
		this.userPre = userPre;
		this.userNew = userNew;
		this.houseId = houseId;
		this.saleTime = saleTime;
		this.buyTime = buyTime;
	}
	public HouseExchangeBean() {
		super();
	}
	public int getUserPre() {
		return userPre;
	}
	public void setUserPre(int userPre) {
		this.userPre = userPre;
	}
	public int getUserNew() {
		return userNew;
	}
	public void setUserNew(int userNew) {
		this.userNew = userNew;
	}
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public Timestamp getSaleTime() {
		return saleTime;
	}
	public void setSaleTime(Timestamp saleTime) {
		this.saleTime = saleTime;
	}
	public Timestamp getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Timestamp buyTime) {
		this.buyTime = buyTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buyTime == null) ? 0 : buyTime.hashCode());
		result = prime * result + houseId;
		result = prime * result
				+ ((saleTime == null) ? 0 : saleTime.hashCode());
		result = prime * result + userNew;
		result = prime * result + userPre;
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
		HouseExchangeBean other = (HouseExchangeBean) obj;
		if (buyTime == null) {
			if (other.buyTime != null)
				return false;
		} else if (!buyTime.equals(other.buyTime))
			return false;
		if (houseId != other.houseId)
			return false;
		if (saleTime == null) {
			if (other.saleTime != null)
				return false;
		} else if (!saleTime.equals(other.saleTime))
			return false;
		if (userNew != other.userNew)
			return false;
		if (userPre != other.userPre)
			return false;
		return true;
	}
	
}

package com.estatemanagement.domain;

public class DepartmentBean {
	private int departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentDescription;
	public DepartmentBean(int departmentId, String departmentName,
			String departmentAddress, String departmentDescription) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentDescription = departmentDescription;
	}
	public DepartmentBean() {
		super();
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentDescription() {
		return departmentDescription;
	}
	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((departmentAddress == null) ? 0 : departmentAddress
						.hashCode());
		result = prime
				* result
				+ ((departmentDescription == null) ? 0 : departmentDescription
						.hashCode());
		result = prime * result + departmentId;
		result = prime * result
				+ ((departmentName == null) ? 0 : departmentName.hashCode());
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
		DepartmentBean other = (DepartmentBean) obj;
		if (departmentAddress == null) {
			if (other.departmentAddress != null)
				return false;
		} else if (!departmentAddress.equals(other.departmentAddress))
			return false;
		if (departmentDescription == null) {
			if (other.departmentDescription != null)
				return false;
		} else if (!departmentDescription.equals(other.departmentDescription))
			return false;
		if (departmentId != other.departmentId)
			return false;
		if (departmentName == null) {
			if (other.departmentName != null)
				return false;
		} else if (!departmentName.equals(other.departmentName))
			return false;
		return true;
	}
	
}

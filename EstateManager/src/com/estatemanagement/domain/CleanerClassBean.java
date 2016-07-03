package com.estatemanagement.domain;

public class CleanerClassBean {
	private int classId;
	private String className;
	public CleanerClassBean(int classId, String className) {
		super();
		this.classId = classId;
		this.className = className;
	}
	public CleanerClassBean() {
		super();
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classId;
		result = prime * result
				+ ((className == null) ? 0 : className.hashCode());
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
		CleanerClassBean other = (CleanerClassBean) obj;
		if (classId != other.classId)
			return false;
		if (className == null) {
			if (other.className != null)
				return false;
		} else if (!className.equals(other.className))
			return false;
		return true;
	}
	
}

package com.estatemanagement.domain;

import java.sql.Timestamp;

public class FileBean {
	private int fileId;
	private int userId;
	private String fileName;
	private String fileAddress;
	private String fileExt;
	private int fileSize;
	private String fileSha1;
	private Timestamp fileCreateTime;
	public FileBean(int fileId, int userId, String fileName,
			String fileAddress, String fileExt, int fileSize, String fileSha1,
			Timestamp fileCreateTime) {
		super();
		this.fileId = fileId;
		this.userId = userId;
		this.fileName = fileName;
		this.fileAddress = fileAddress;
		this.fileExt = fileExt;
		this.fileSize = fileSize;
		this.fileSha1 = fileSha1;
		this.fileCreateTime = fileCreateTime;
	}
	public FileBean() {
		super();
	}
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileAddress() {
		return fileAddress;
	}
	public void setFileAddress(String fileAddress) {
		this.fileAddress = fileAddress;
	}
	public String getFileExt() {
		return fileExt;
	}
	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileSha1() {
		return fileSha1;
	}
	public void setFileSha1(String fileSha1) {
		this.fileSha1 = fileSha1;
	}
	public Timestamp getFileCreateTime() {
		return fileCreateTime;
	}
	public void setFileCreateTime(Timestamp fileCreateTime) {
		this.fileCreateTime = fileCreateTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fileAddress == null) ? 0 : fileAddress.hashCode());
		result = prime * result
				+ ((fileCreateTime == null) ? 0 : fileCreateTime.hashCode());
		result = prime * result + ((fileExt == null) ? 0 : fileExt.hashCode());
		result = prime * result + fileId;
		result = prime * result
				+ ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result
				+ ((fileSha1 == null) ? 0 : fileSha1.hashCode());
		result = prime * result + fileSize;
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
		FileBean other = (FileBean) obj;
		if (fileAddress == null) {
			if (other.fileAddress != null)
				return false;
		} else if (!fileAddress.equals(other.fileAddress))
			return false;
		if (fileCreateTime == null) {
			if (other.fileCreateTime != null)
				return false;
		} else if (!fileCreateTime.equals(other.fileCreateTime))
			return false;
		if (fileExt == null) {
			if (other.fileExt != null)
				return false;
		} else if (!fileExt.equals(other.fileExt))
			return false;
		if (fileId != other.fileId)
			return false;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (fileSha1 == null) {
			if (other.fileSha1 != null)
				return false;
		} else if (!fileSha1.equals(other.fileSha1))
			return false;
		if (fileSize != other.fileSize)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
}

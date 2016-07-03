package com.estatemanagement.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserBean implements Serializable{
	private static final long serialVersionUID = -5323046634249352452L;
	private int userId;
	private String userLogin;
	private String userPass;
	private String userNickname;
	private String userTel;
	private String userEmail;
	private String userImg;
	private int userAuth;
	private Timestamp userRegTime;
	private String userSex;
	private String userName;
	private String userType;
	public UserBean(String userLogin, String userPass,
			String userNickname, String userTel, String userEmail,
			String userImg, int userAuth, Timestamp userRegTime,
			String userSex, String userName, String userType) {
		this.userLogin = userLogin;
		this.userPass = userPass;
		this.userNickname = userNickname;
		this.userTel = userTel;
		this.userEmail = userEmail;
		this.userImg = userImg;
		this.userAuth = userAuth;
		this.userRegTime = userRegTime;
		this.userName = userName;
		this.userType = userType;
		this.userSex = userSex;
	}
	public UserBean() {
		super();
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public int getUserAuth() {
		return userAuth;
	}
	public void setUserAuth(int userAuth) {
		this.userAuth = userAuth;
	}
	public Timestamp getUserRegTime() {
		return userRegTime;
	}
	public void setUserRegTime(Timestamp userRegTime) {
		this.userRegTime = userRegTime;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userAuth;
		result = prime * result
				+ ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userImg == null) ? 0 : userImg.hashCode());
		result = prime * result
				+ ((userLogin == null) ? 0 : userLogin.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result
				+ ((userNickname == null) ? 0 : userNickname.hashCode());
		result = prime * result
				+ ((userPass == null) ? 0 : userPass.hashCode());
		result = prime * result
				+ ((userRegTime == null) ? 0 : userRegTime.hashCode());
		result = prime * result + ((userSex == null) ? 0 : userSex.hashCode());
		result = prime * result + ((userTel == null) ? 0 : userTel.hashCode());
		result = prime * result
				+ ((userType == null) ? 0 : userType.hashCode());
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
		UserBean other = (UserBean) obj;
		if (userAuth != other.userAuth)
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userId != other.userId)
			return false;
		if (userImg == null) {
			if (other.userImg != null)
				return false;
		} else if (!userImg.equals(other.userImg))
			return false;
		if (userLogin == null) {
			if (other.userLogin != null)
				return false;
		} else if (!userLogin.equals(other.userLogin))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userNickname == null) {
			if (other.userNickname != null)
				return false;
		} else if (!userNickname.equals(other.userNickname))
			return false;
		if (userPass == null) {
			if (other.userPass != null)
				return false;
		} else if (!userPass.equals(other.userPass))
			return false;
		if (userRegTime == null) {
			if (other.userRegTime != null)
				return false;
		} else if (!userRegTime.equals(other.userRegTime))
			return false;
		if (userSex == null) {
			if (other.userSex != null)
				return false;
		} else if (!userSex.equals(other.userSex))
			return false;
		if (userTel == null) {
			if (other.userTel != null)
				return false;
		} else if (!userTel.equals(other.userTel))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		return true;
	}
	
	
	
}

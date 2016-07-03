package com.estatemanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.estatemanagement.domain.UserBean;

public class UserDao {
	private Connection con;
	private ResultSet rest;
	private int updateRes;
	private PreparedStatement pred;
	private String sql;
	private UserBean ubRes = new UserBean();
	public UserDao(Connection con){
		this.con = con;
	}
	public int addUser(UserBean ub) throws SQLException {
		sql = "insert into user (userlogin, " +
				"userpass, usernickname, usertel, useremail, userimg, " +
				"userauth, userregtime, usersex, username, usertype) " +
				"values(?,?,?,?,?,?,?,?,?,?,?)";
		pred = con.prepareStatement(sql);
		pred.setString(1, ub.getUserLogin());
		pred.setString(2, ub.getUserPass());
		pred.setString(3, ub.getUserNickname());
		pred.setString(4, ub.getUserTel());
		pred.setString(5, ub.getUserEmail());
		pred.setString(6, ub.getUserImg());
		pred.setInt(7, ub.getUserAuth());
		pred.setTimestamp(8, ub.getUserRegTime());
		pred.setString(9, ub.getUserSex());
		pred.setString(10, ub.getUserName());
		pred.setString(11, ub.getUserType());
		pred.executeUpdate();
		rest = pred.getGeneratedKeys();
		rest.next();
		updateRes = rest.getInt(1);
		pred.close();
		return updateRes;
	}
	
	public int deleteUser(int userId) throws SQLException{
		sql = "delete from user where UserId = ?";
		PreparedStatement pred = con.prepareStatement(sql);
		pred.setInt(1, userId);
		updateRes = pred.executeUpdate();
		pred.close();
		return updateRes;
	}
	
	public int changeUser(UserBean ub) throws SQLException{
		sql = "update user set UserLogin=?, UserPass=?, UserNickname=?, UserTel=?, UserEmail=?, UserImg=?, UserAuth=?, UserRegTime=?, UserSex=?, UserName=?, UserType=? where UserId = ?";
		pred = con.prepareStatement(sql);
		pred.setString(1, ub.getUserLogin());
		pred.setString(2, ub.getUserPass());
		pred.setString(3, ub.getUserNickname());
		pred.setString(4, ub.getUserTel());
		pred.setString(5, ub.getUserEmail());
		pred.setString(6, ub.getUserImg());
		pred.setInt(7, ub.getUserAuth());
		pred.setTimestamp(8, ub.getUserRegTime());
		pred.setString(9, ub.getUserSex());
		pred.setString(10, ub.getUserName());
		pred.setString(11, ub.getUserType());
		pred.setInt(12, ub.getUserId());
		updateRes = pred.executeUpdate();
		pred.close();
		return updateRes;
	}
	
	public UserBean getUserById(int userId) throws SQLException{
		sql = "select * from user where userId=?";
		pred = con.prepareStatement(sql);
		pred.setInt(1, userId);
		rest = pred.executeQuery();
		while(rest.next()){
			ubRes.setUserId(rest.getInt("UserId"));
			ubRes.setUserLogin(rest.getString("UserLogin"));
			ubRes.setUserPass(rest.getString("UserPass"));
			ubRes.setUserNickname(rest.getString("UserNickname"));
			ubRes.setUserTel(rest.getString("UserTel"));
			ubRes.setUserEmail(rest.getString("UserEmail"));
			ubRes.setUserImg(rest.getString("UserImg"));
			ubRes.setUserAuth(rest.getInt("UserAuth"));
			ubRes.setUserRegTime(rest.getTimestamp("UserRegTime"));
			ubRes.setUserSex(rest.getString("UserSex"));
			ubRes.setUserName(rest.getString("UserName"));
			ubRes.setUserType(rest.getString("UserType"));
		}
		pred.close();
		return ubRes;
	}
}

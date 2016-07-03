package com.estatemanagement.test.daotest;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import junit.framework.Assert;
import org.junit.Test;

import com.estatemanagement.dao.UserDao;
import com.estatemanagement.domain.UserBean;
import com.estatemanagement.util.DBUtil;

public class UserDaoTest {
	private Connection con = DBUtil.getCon();
	private UserBean ub;
	private UserDao ud;
	private int userId;
	private int testRes;
	
	@Test
	public void userOperaterTest() throws SQLException{
		ub = new UserBean("admin", "123", "peiqi", 
			"123456", "a@a.com", "http://img.img", 10, new Timestamp((System.currentTimeMillis() / 1000) * 1000),
			"male", "裴棋", "SuperAdmin");
		ud = new UserDao(con);
		userId = ud.addUser(ub);
		Assert.assertFalse(userId == 0);
		ub.setUserId(userId);
		Assert.assertTrue(ub.equals(ud.getUserById(userId)));
		
		ub.setUserLogin("peiqi123");
		ub.setUserRegTime(new Timestamp((System.currentTimeMillis() / 1000) * 1000));
		testRes = ud.changeUser(ub);
		Assert.assertTrue(ub.equals(ud.getUserById(userId)) && testRes != 0);
		Assert.assertTrue(ud.deleteUser(userId) != 0);
	}
}

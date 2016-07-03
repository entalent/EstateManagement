package com.estatemanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection con = null;
	public static Connection getCon(){
		//JDBC
		try {
			//我们使用数据库的类型
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost/estatemanagement","root","123456");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("数据库驱动加载错误!");
		} catch (SQLException e){
			e.printStackTrace();
			System.out.println("数据库连接出现问题！");
		} catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
}

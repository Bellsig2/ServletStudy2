package com.wookdongkang.s1.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	public Connection getConnect() {
		String userId = "user02";
		String userPw = "user02";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		Connection connection = null;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, userId, userPw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}

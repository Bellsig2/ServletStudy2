package com.wookdongkang.s1.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wookdongkang.s1.util.DBConnector;

public class MemberDAO {
	private DBConnector dbConnector;
	
	public MemberDAO() {
		dbConnector = new DBConnector();
	}
	public int join(MemberDTO memberDTO) throws Exception{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int insert = 0;
			connection = dbConnector.getConnect();
			String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getId());
			preparedStatement.setString(2, memberDTO.getPw());
			preparedStatement.setString(3, memberDTO.getName());
			preparedStatement.setString(4, memberDTO.getPhone());
			preparedStatement.setString(5, memberDTO.getEmail());
			
			insert = preparedStatement.executeUpdate();
		return insert;
	}
}

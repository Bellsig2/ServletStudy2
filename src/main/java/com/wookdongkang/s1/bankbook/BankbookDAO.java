package com.wookdongkang.s1.bankbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.wookdongkang.s1.util.DBConnector;

public class BankbookDAO {
	private DBConnector dbConnector;

	public BankbookDAO() {
		dbConnector = new DBConnector();
	}

	public BankbookDTO getSelect(BankbookDTO bankBookDTO) {
		Connection connection = dbConnector.getConnect();
		PreparedStatement preparedStatement = null;
		ResultSet result = null;
		BankbookDTO dto = null;
		try {
			System.out.println(connection);
			String sql = "SELECT * FROM BANKBOOK WHERE BOOK_NUMBER=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, bankBookDTO.getBook_number());
			result = preparedStatement.executeQuery();
			if (result.next()) {
				dto = new BankbookDTO();
				dto.setBook_name(result.getString("book_name"));
				dto.setBook_number(result.getLong("book_number"));
				dto.setBook_rate(result.getDouble("book_rate"));
				dto.setBook_sale(result.getInt("book_sale"));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}

	public ArrayList<BankbookDTO> getList() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		BankbookDTO bankbookDTO = null;
		ArrayList<BankbookDTO> bookList = new ArrayList<BankbookDTO>();
		ResultSet resultSet = null;
		try {
			connection = dbConnector.getConnect();
			String sql = "SELECT * FROM BANKBOOK";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				bankbookDTO = new BankbookDTO();
				bankbookDTO.setBook_name(resultSet.getString("book_name"));
				bankbookDTO.setBook_number(resultSet.getLong("book_number"));
				bankbookDTO.setBook_rate(resultSet.getDouble("book_rate"));
				bankbookDTO.setBook_sale(resultSet.getInt("book_sale"));
				bookList.add(bankbookDTO);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookList;
	}
}

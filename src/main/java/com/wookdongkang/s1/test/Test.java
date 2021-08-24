package com.wookdongkang.s1.test;

import java.util.ArrayList;

import com.wookdongkang.s1.bankbook.BankbookDAO;
import com.wookdongkang.s1.bankbook.BankbookDTO;

public class Test {

	public static void main(String[] args) {
		ArrayList<BankbookDTO> bankList = new ArrayList<>();
		// TODO Auto-generated method stub

//		BankbookDAO bankbookDAO = new BankbookDAO();
//		BankbookDTO bankbookDTO = new BankbookDTO();
		
//		bankbookDTO.setBook_number(1);
//		bankbookDTO = bankbookDAO.getSelect(bankbookDTO);
//		
//		System.out.println(bankbookDTO.getBook_name());
		BankbookDAO bankbookDAO = new BankbookDAO();
		bankList = bankbookDAO.getList();
		
		for(int i = 0; i<bankList.size(); i++) {
			System.out.println(bankList.get(i).getBook_name());
			System.out.println(bankList.get(i).getBook_number());
			System.out.println(bankList.get(i).getBook_rate());
			System.out.println(bankList.get(i).getBook_sale());
		}
	}

}

package com.wookdongkang.s1.bankbook;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BankbookController {
	private BankbookDAO bankbookDAO;

	public BankbookController() {
		bankbookDAO = new BankbookDAO();
	}

	public void start(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BankBook Controller 실행");
		String url = request.getRequestURI();
		String[] uris = url.split("/");
		String path = uris[3];
		if (path.equals("bankbookList.do")) {
			System.out.println("상품목록");
			ArrayList<BankbookDTO> bankList = bankbookDAO.getList();
			// for(초기식; 조건식; 증감식)
			// for(모은타입명 변수명 : 컬렉션참조변수명)
			for (BankbookDTO bankbookDTO : bankList) {
				System.out.println(bankbookDTO.getBook_name());
			}
			request.setAttribute("bankList", bankList);
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/bankbook/bankbookList.jsp");
			try {
				view.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (path.equals("bankbookInsert.do")) {
			System.out.println("상품등록");
			String method = request.getMethod();
			System.out.println("method : " + method);

			if (method.equals("POST")) {
				String bookName = request.getParameter("book_name");
				String bookRate = request.getParameter("book_rate");
				String bookSale = request.getParameter("book_sale");

				BankbookDTO bankbookDTO = new BankbookDTO();
				bankbookDTO.setBook_name(bookName);
				bankbookDTO.setBook_rate(Double.parseDouble(bookRate));
				bankbookDTO.setBook_sale(Integer.parseInt(bookSale));

				BankbookDAO bankbookDAO = new BankbookDAO();
				int check = bankbookDAO.setInsert(bankbookDTO);
				System.out.println(check);
//				ArrayList<BankbookDTO> arrayList = bankbookDAO.getList();
//				request.setAttribute("list", arrayList);
				try {
					response.sendRedirect("./bankbookList.do");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {
				RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/bankbook/bankbookInsert.jsp");
				try {
					view.forward(request, response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		else if (path.equals("bankbookSelect.do")) {
			String value = request.getParameter("bookNumber");
			Long value2 = Long.parseLong(value);
			System.out.println("상품상세조회");
			BankbookDTO bankbookDTO = new BankbookDTO();
			bankbookDTO.setBook_number(1);
			bankbookDTO = bankbookDAO.getSelect(bankbookDTO);
			System.out.println(bankbookDTO.getBook_name());
			request.setAttribute("dto", bankbookDTO);
			request.setAttribute("count", 123);
			request.setAttribute("name", "iu");
			
			HttpSession session = request.getSession();
			session.setAttribute("session", session);
			request.setAttribute("session", request);
			
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/bankbook/bankbookSelect.jsp");
			try {
				view.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

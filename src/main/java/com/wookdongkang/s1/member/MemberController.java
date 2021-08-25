package com.wookdongkang.s1.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

public class MemberController {
	private MemberService memberService;

	public MemberController() {
		memberService = new MemberService();
	}

	public void start(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("MemberController 실행");

		String uri = request.getRequestURI();

		String[] uris = uri.split("/");
		String path = uris[3];
		if (path.equals("memberLogin.do")) {
			System.out.println("로그인 페이지");
			String value = request.getParameter("id");
			String pw = request.getParameter("pw");
			System.out.println(value);
			System.out.println(pw);
		} else if (path.equals("memberJoin.do")) {
			System.out.println("회원가입 페이지");
			if (request.getMethod().equals("GET")) {
				RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/member/memberJoin.jsp");
				view.forward(request, response);
			} else {
				int result = memberService.memberJoin(request, response);
				if (result > 0) {
					response.sendRedirect("../index.jsp");
				}
				else {
					response.sendRedirect("./memberJoin.do");
				}
			}
		} else if (path.equals("memberPage.do")) {
			System.out.println("마이 페이지?");
		}
	}
}

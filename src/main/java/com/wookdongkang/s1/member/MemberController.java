package com.wookdongkang.s1.member;

import javax.servlet.http.HttpServletRequest;

public class MemberController {
	public void start(HttpServletRequest request) {
		System.out.println("MemberController 실행");
	
		String uri = request.getRequestURI();
		
		String[]uris = uri.split("/");
		String path = uris[3];
		if(path.equals("memberLogin.do")) {
			System.out.println("로그인 페이지");
			String value = request.getParameter("id");
			String pw = request.getParameter("pw");
			System.out.println(value);
			System.out.println(pw);
		}
		else if(path.equals("memberJoin.do")) {
			System.out.println("회원가입 페이지");
		}
		else if(path.equals("memberPage.do")) {
			System.out.println("마이 페이지?");
		}
	}
}

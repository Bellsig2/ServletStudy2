package com.wookdongkang.s1.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberService {
	private MemberDAO memberDAO;

	public MemberService() {
		memberDAO = new  MemberDAO();
	}

	public int memberJoin(HttpServletRequest request, HttpServletResponse response) throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");

		memberDTO.setId(id);
		memberDTO.setPw(pw);
		memberDTO.setName(name);
		memberDTO.setPhone(phone);
		memberDTO.setEmail(email);
		
		return memberDAO.join(memberDTO);

	}
}

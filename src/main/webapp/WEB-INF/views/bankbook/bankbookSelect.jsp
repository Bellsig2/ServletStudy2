<%@page import="com.wookdongkang.s1.bankbook.BankbookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBook Select Page</h1>
	<% 
		String num = request.getParameter("bookNumber");
		Object obj = request.getAttribute("dto");
		BankbookDTO bankbookDTO = (BankbookDTO)obj;
	%>
	<h3>num : <%= num %></h3>
	<h3>Name : <%= bankbookDTO.getBook_name() %></h3>
	<h3>이자율 : <%= bankbookDTO.getBook_number() %></h3>
	<h3><%=bankbookDTO.getBook_rate() %></h3>
	<h3><%= bankbookDTO.getBook_sale() %></h3>
</body>
</html>
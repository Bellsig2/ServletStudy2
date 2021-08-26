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
	<h3>num : ${requestScope.dto.book_number}</h3>
	<h3>Name : ${requestScope.dto.book_name}</h3>
	<h3>Count : ${count}</h3>
	<h3>Name : ${name}</h3>
	<h3>session : ${sessionScope.session}</h3>
</body>
</html>
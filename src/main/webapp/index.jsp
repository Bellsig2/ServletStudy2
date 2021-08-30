<%@page import="com.wookdongkang.s1.bankbook.BankbookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link href="./css/test.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Index Page</h1>

	<h3 id="t1">Memeber</h3>
	<p id="t2">
	<a href="/ServletStudy2/member/memberLogin.do?id=t1&pw=pw1"> MemberLogin </a>
	<a href="./member/memberJoin.do">Member Join</a>
	<a href="member/memberPage.do">Memeber Page</a>
	</p>

	<h3 id = "t3" class="c2">Bankbook</h3>
	<a href="/ServletStudy2/bankbook/bankbookList.do">BankBook List</a>
	<a href="./bankbook/bankbookInsert.do">Bankbook Insert</a>
	<a href="./bankbook/bankbookSelect.do?bookNumber=5">Bankbook Select</a>

	<h2 class="c1 c2">버튼</h2>
</body>
</html>
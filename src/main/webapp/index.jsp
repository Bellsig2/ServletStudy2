<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Index Page</h1>
	<h3>Memeber</h3>
	<p>
		<a href="/ServletStudy2/member/memberLogin.do?id=t1&pw=pw1"> Member Login </a>
		<a href="./member/memberJoin.do">Member Join</a>
		<a href="member/memberPage.do">Memeber Page</a>
	</p>
	
	<h3>Bankbook</h3>
	<p>
		<a href="/ServletStudy2/bankbook/bankbookList.do">BankBook List</a>
		<a href="./bankbook/bankbookInsert.do">Bankbook Insert</a>
		<a href="bankbook/bankbookSelect.do?bookNumber=5">Bankbook Select</a>
	</p>
</body>
</html>
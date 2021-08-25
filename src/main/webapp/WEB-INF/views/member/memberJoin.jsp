<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Member Join</h1>

<form action="./memberJoin.do" method="post">
	아이디 <input type = "text" name = "id">
	비밀번호 <input type = "text" name = "pw">
	이름 <input type = "text" name = "name">
	전화번호 <input type = "tel" name = "phone">
	이메일 <input type = "email" name = "email">
	<button type="submit">전송</button>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Insert Page 입니다.</h1>

	<form action="./bankbookInsert.do" method="post">
		제품명 : <input type="text" placeholder="ex) 청약저축" name="book_name">
		<br> 이자율 : <input type="text" value="1.12" name="book_rate">
		<br> 판매여부 : <input type="radio" value="1" name="book_sale" checked="checked">
		<input type="radio" name="book_sale" value = "0"> <br>

		<div>
			<button type="submit">Write</button>
		</div>
	</form>
</body>
</html>
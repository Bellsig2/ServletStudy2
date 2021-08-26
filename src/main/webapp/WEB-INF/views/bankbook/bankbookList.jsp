<%@page import="com.wookdongkang.s1.bankbook.BankbookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBook List Page By JSTL</h1>

	<table>
		<tr>
			<th>일련번호</th>
			<th>제품명</th>
			<th>이자율</th>
			<th>Status</th>
		</tr>
		<c:forEach items="${bankList}" var="dto" varStatus="i">
			<tr>
				<td>${dto.book_number}</td>
				<td><a href="./bankbookSelect.do?bookNumber=${dto.book_number}">${dto.book_name}</a>></td>
				<td>${dto.book_rate}</td>
				<td>
					<p>현재 아이템 : ${i.current}</p>
					<p>인덱스 번호 : ${i.index}</p>
					<p>1부터 순서번호 : ${i.count}</p>
					<p>처음인지: ${i.first }</p>
					<p>마지막인지 : ${i.last }</p>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<c:forEach begin="10" end="-1" var="num" step="-3">
			<button>${num}</button>
		</c:forEach>
	</div>
	
	<a href="bankbookInsert.do">Insert Page</a>
</body>
</html>
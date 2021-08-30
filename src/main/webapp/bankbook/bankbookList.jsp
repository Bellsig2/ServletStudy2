<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="../css/list.css" rel ="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBook List Page</h1>
	<table>
	<tr>
	 </table>
	 <a href = "bankbookInsert.do">Insert Page</a>
	<h1 class = "title">BankBook List Page By JSTL</h1>
	<table class = "listTable">
		<tr>
			<th class = "tableHeader">일련번호</th>
			<th class = "tableHeader">제품명</th>
			<th class = "tableHeader">이자율</th>
			<th class = "tableHeader">Status</th>
		</tr>
		<c:forEach items="${bankList}" var="dto" varStatus="i">
			<tr>
				<td class = "tableBody">${dto.book_number}</td>
				<td class = "tableBody"><a href="./bankbookSelect.do?bookNumber=${dto.book_number}">${dto.book_name}</a>></td>
				<td class = "tableBody">${dto.book_rate}</td>
				<td class = "tableBody">
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
		<c:forEach begin="1" end="10" var="num" step="1">
			<button>${num}</button>
		</c:forEach>
	</div>
	
	<a href="bankbookInsert.do">Insert Page</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
</head>
<body>
	명단보기
	<br>
	<c:forEach var="list" items="${list }">
	${list.seq } : ${list.writer } : ${list.message } : ${list.write_date }<br>
	</c:forEach>
	<br>
	<form action="deleteProc" method="get">
		<input type="text" name="seq" placeholder="삭제하고싶은 번호 입력">
		<button>삭제하기</button>
	</form>
	<br>

	<form action="updateProc" method="post">
		<input type="text" name="seq" placeholder="수정을 원하는 번호 입력"><br>
		<input type="text" name="writer" placeholder="작성자"><br> <input
			type="text" name="message" placeholder="메세지"><br>
		<button>수정하기</button>
	</form>
	<br>

	<form action="search" method="post">
		<input type="text" name="seq" placeholder="검색을 원하는 번호 입력"><br>
		<button>찾기</button>
	</form>
	<br>

	<a href="/">뒤로가기</a>
</body>
</html>
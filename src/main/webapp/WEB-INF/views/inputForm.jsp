<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InputMessages</title>
</head>
<body>
<form action="inputProc" method="get">
	<table>
		<tr>
			<th colspan=2>Messages
		</tr>
		<tr>
			<td><input type=text name=writer placholder="write your name">
			<td><input type=text name=contents placeholder="write messages">
		</tr>
		<tr>
			<td><input type=submit value=write>
		</tr>
		<tr>
			<td><a href="/">back</a>
		</tr>
	</table>
</form>
</body>
</html>
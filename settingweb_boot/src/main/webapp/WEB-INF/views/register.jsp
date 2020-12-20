<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko"> 
	<head> 
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
		<title>lechae</title> 
	</head> 
	<body> 
		<h2>😀유저 등록😀</h2> 
		
		<form action="/register" method="get" margin="0" padding="0">
			<table>
				<tr>
					<td width="70px" align="center">아이디</td>
					<td width="170px"><input name="userId" type="text"></td>
				</tr>
				<tr>
					<td align="center">이름</td>
					<td><input name="name" type="text"></td>
				</tr>
				<tr>
					<td align="center">부서</td>
					<td><input name="dept" type="text"></td>
				</tr>
			</table>
			<input type="submit" value="Let's register" style="width: 240px;">
		</form>
	</body> 
</html>
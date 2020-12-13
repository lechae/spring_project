<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko"> 
	<head> 
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
		<title>View Test Page</title> 
	</head> 
	<body> 
		<h2>Hello!</h2> 
		<div>requestInfo</div> 
		<c:forEach var="item" items="${list}" varStatus="idx"> 
			${item.requestId}, ${item.requestCode}, ${item.userId}, ${item.createDate} <br/> 
		</c:forEach> 
	</body> 
</html>
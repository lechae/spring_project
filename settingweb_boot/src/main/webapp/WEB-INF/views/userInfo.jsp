<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko"> 
	<head> 
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
		<title>lechae</title> 
		<style type="text/css">
			#sp1 {
				width: 100px;
				display:inline-block;
				text-align: center;
			}
			
			#sp2 {
				width: 150px;
				display:inline-block;
				text-align: center;
			}
			
			.sub {
				font-weight: bold;
			}
 		</style>
	</head> 
	<body> 
		<h2>📜유저 정보📜</h2> 
		
		<div>
         	<span id="sp1" class="sub">아이디</span>
         	<span id="sp1" class="sub">이름</span>
         	<span id="sp1" class="sub">부서</span>
         	<span id="sp2" class="sub">유저 정보 삭제</span>
	    </div>
		<c:forEach var="item" items="${list}" varStatus="idx"> 
	         <div>
	         	<form action="/remove" method="get">
	         		<input type="hidden" name="userId" value="${item.userId}">
		         	<span id="sp1">${item.userId} </span>
		         	<span id="sp1">${item.name} </span>
		         	<span id="sp1">${item.dept} </span>
		         	<span id="sp2"><input type="submit" value="삭제"> </span>
	         	</form>
	         </div>
	     </c:forEach>
	</body> 
</html>
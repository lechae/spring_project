<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>lechae</title>
</head>
<body>
    <h1>movie 데이터 조회</h1>
 
    <table border="1">
        <thead>
            <tr>
                <th>영화이름</th>
                <th>감독</th>
                <th>장르</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${movieList}" var="movie">
                <tr>
                    <td width="100" align="center">${movie.movieName}</td>
                    <td width="50" align="center">${movie.director}</td>
                    <td width="100" align="center">${movie.type}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
 
 
</body>
</html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>
		Hello world!  
	</h1>
	
	<P>  The time on the server is ${hello}. </P>
	
	<table>
		<tr>
			<th> ID</th>
			<th> 번호</th>
			<th> 이름</th>
			<th> 제목</th>
			<th> 내용</th>
			<th> 날짜</th>
		</tr>
		<c:forEach items="${todoList}" var="tl" >
			<tr>
				<td> <c:out value="${tl.stId}"></c:out> </td>	
				<td> <c:out value="${tl.stNo}"></c:out> </td>	
				<td> <c:out value="${tl.stName}"></c:out> </td>	
				<td> <c:out value="${tl.stTitle}"></c:out> </td>	
				<td> <c:out value="${tl.stCont}"></c:out> </td>	
				<td> <c:out value="${tl.stDt}"></c:out> </td>	
			</tr>
		</c:forEach>
	</table>
</body>
</html>

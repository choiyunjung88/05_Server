<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>�л� ��ü ��ȸ</title>
</head>
<body>
	<h1>�л� ��ü ���</h1>
	
	<table border="1">
		<tr>
			<th>��ȣ</th>
			<th>�й�</th>
			<th>�̸�</th>
			<th>�а�</th>
			<th>�ּ�</th>
		</tr>
		
		<c:forEach var="std" items="${stdList}">
			<tr>
				<td>${vs.count}</td>
				<td>${std.studentNo}</td>
				<td>${std.studentName}</td>
				<td>${std.departmentName}</td>
				<td>${std.studentAddress}</td>
			</tr>
		</c:forEach>
		
		
		
		
	</table>




</body>
</html>
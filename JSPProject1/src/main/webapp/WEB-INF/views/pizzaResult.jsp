<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� �ֹ� ���</title>
</head>
<body>
	<h3>���� ���� : <%= request.getAttribute("pizzaName") %>
	                   <%= request.getParameter("size") %>
	</h3>
	<h3>���� : <%= request.getParameter("amount")%> </h3>
	<h3>�� ���� : <%= request.getAttribute("price")%></h3>
</body>
</html>
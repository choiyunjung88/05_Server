<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>피자 주문 결과</title>
</head>
<body>
	<h3>피자 종류 : <%= request.getAttribute("pizzaName") %>
	                   <%= request.getParameter("size") %>
	</h3>
	<h3>수량 : <%= request.getParameter("amount")%> </h3>
	<h3>총 가격 : <%= request.getAttribute("price")%></h3>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSTL ���ǹ�</title>
</head>
<body>

	<h1>4. ���ǹ� - if</h1>
	
	<pre>
		�Ӽ��� test �� ����
		test�� �Ӽ����� ������ EL ����, true, false������, �յ� ���� X
	</pre>
	
	<c:if test="${money == 50000}" >
		<h1>���� 5���� �ֽ��ϴ�</h1>
	</c:if>
	
	<h3>EL���� ��� �񱳴� == �Ǵ� eq / != �Ǵ� ne, ���ڿ��� ''Ȭ����ǥ�� ǥ��</h3>
	
	<c:if test="${name eq 'g }"></c:if>
	
	
</body>
</html>
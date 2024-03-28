<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSTL 조건문</title>
</head>
<body>

	<h1>4. 조건문 - if</h1>
	
	<pre>
		속성은 test 만 존재
		test의 속성값은 무조건 EL 구문, true, false여야함, 앞뒤 공백 X
	</pre>
	
	<c:if test="${money == 50000}" >
		<h1>돈이 5만원 있습니다</h1>
	</c:if>
	
	<h3>EL에서 모든 비교는 == 또는 eq / != 또는 ne, 문자열은 ''홑따옴표로 표현</h3>
	
	<c:if test="${name eq 'g }"></c:if>
	
	
</body>
</html>
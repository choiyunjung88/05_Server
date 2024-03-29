<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 가입</title>
	
	<link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>
	<main>
		<img id="logo" src="./images/logo.png">
		<h3>회원가입</h3>
		
		<form action="/signup" method="post" class="signup-form" onsubmit="return validate()">
			<p>ID</p>
			<input type="text" name="inputId" id="inputId" autocomplete="off" required>
			
			<p>비밀번호</p>
			<input type="password" name="inputPw" id="inputPw" required>
			<span id="idMsg">영어 소문자, 숫자, _- 특수문자 8~14글자</span>
			
			<p>비밀번호 확인</p>
			<input type="password" name="inputPw2" id="inputPw2" required>
			<span id="pwMessage"></span>
			
			<p>이름</p>
			<input type="text" name="inputName" id="inputName" required>
			<span id="nameMessage"></span>
			<br>
			
			<button>가입하기</button>
		</form>
	</main>
	
	<script src="./resources/js/signup.js"></script>
	
	
	
	
	
	
	
</body>
</html>
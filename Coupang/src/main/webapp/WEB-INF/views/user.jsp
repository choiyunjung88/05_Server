<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>마이페이지</title>
        <link rel="stylesheet" href="/resources/css/user.css" />
    </head>
    <body>
        <a href="/"><img src="/images/logo.png" /></a>
        <h2>마이페이지</h2>
        <%-- Check if loginMember is not null --%>
        <c:if test="${not empty loginMember}">
            <table>
                <tr>
                    <td class="a">회원 번호</td>
                    <td>${loginMember.memberNo}</td>
                </tr>
                <tr>
                    <td class="a">아이디</td>
                    <td>${loginMember.memberId}</td>
                </tr>
                <tr>
                    <td class="a">이름</td>
                    <td>${loginMember.memberNickname}</td>
                </tr>
                <tr>
                    <td class="a">가입일</td>
                    <td>${loginMember.enrollDate}</td>
                </tr>
            </table>
        </c:if>

        <div class="button-div">
            <a href="/logout" class="logout-btn">
                <button><h2>로그아웃</h2></button>
            </a>
        </div>
    </body>
</html>

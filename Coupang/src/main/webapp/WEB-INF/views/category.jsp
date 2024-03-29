<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>카테고리</title>
        <link rel="stylesheet" href="/resources/css/cart.css" />
    </head>
    <body>
        <a href="/"><img src="/images/logo.png" /></a>
        <h1>${sessionScope.loginMember.memberNickname}의 판매 카테고리</h1>
        <c:choose>
            <c:when test="${empty cart}">
                <h2>카테고리가 비었습니다. 물건을 등록하세요.</h2>
            </c:when>

            <c:otherwise>
                <table>
                    <c:forEach var="item" items="${cart}">
                        <tr class="tr">
                            <td class="b">${item.cartTitle}</td>
                            <td>
                                <a
                                    href="/update?cartNo=${item.cartNo}"
                                    class="update-btn"
                                    ><button name="button">수정</button></a
                                >
                            </td>
                            <td>
                                <a
                                    href="/delete?cartNo=${item.cartNo}"
                                    onclick="return confirm('정말 삭제하시겠습니까?');"
                                    class="delete-btn"
                                    ><button name="button">삭제</button></a
                                >
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </c:otherwise>
        </c:choose>
        <div class="button-div">
            <a href="/insert" class="insert-btn"> <button>등록하기</button></a>
        </div>
    </body>
</html>

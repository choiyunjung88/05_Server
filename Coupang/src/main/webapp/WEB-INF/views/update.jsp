<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>물건 수정하기</title>

        <link rel="stylesheet" href="/resources/css/cart.css" />
    </head>
    <body>
        <main>
            <h1>물건 수정하기</h1>

            <form action="/update" method="post">
                <p>물건 이름(가격)</p>
                <input
                    type="text"
                    name="title"
                    value="${cart.cartTitle}"
                    required
                />

                <p>물건 설명</p>
                <textarea
                    name="memo"
                    style="resize: none; font-size: 18px"
                    cols="20"
                    rows="5"
                >
${cart.cartMemo}</textarea
                >

                <input name="cartNo" value="${cart.cartNo}" type="hidden" />

                <br />
                <button class="insert-btn">수정하기</button>
            </form>
        </main>
    </body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>물건 등록하기</title>

        <link rel="stylesheet" href="/resources/css/cart.css" />
    </head>
    <body>
        <main>
            <h1>물건 등록하기</h1>

            <form action="/insert" method="post">
                <p>물건 이름</p>
                <input type="text" name="title" required />

                <p>상품설명</p>
                <textarea name="memo" cols="20" rows="5"></textarea>

                <br />
                <button class="insert-btn">등록하기</button>
            </form>
        </main>
    </body>
</html>

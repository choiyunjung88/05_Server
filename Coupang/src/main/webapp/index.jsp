<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <link rel="stylesheet" href="./resources/css/firstpage.css">
        <title>Coupang</title>
        <script
            src="https://kit.fontawesome.com/b27f4139d3.js"
            crossorigin="anonymous"
        ></script>
    </head>
    <body>
        <main>
            <c:choose>
                <c:when test="${empty sessionScope.loginMember}">
                    <section class="logo">
                        <img id="logo" src="./images/logo.png">
                    </section>
                    <section class="login">
                        <form action="/login" method="post" class="login-form">
                            <section class="id">
                                <section class="id-icon">
                                    <span id="message"></span>
                                </section>
                                <section id="id-area">
                                    <input id="id-input" name="inputId" type="text" placeholder="아이디(이메일)">
                                </section>
                            </section>
                            <section class="pw">
                                <section class="pw-icon">
                                    <span id="lock"></span>
                                </section>
                                <section id="pw-area">
                                    <input id="pw-input" name="inputPw" type="password" placeholder="비밀번호">
                                </section>
                            </section>
                            <button id="login-btn">로그인</button>
                        </form>
                        <a href="/signup" class="signup">
                            <button id="signup-btn">회원가입</button>
                        </a>
                    </section>
                </c:when>
                <c:otherwise>
                    <header>
                        <section id="head">
                            <a href="/category">
                                <button id="category" class="fas fa-bars"></button>
                            </a>
                            <a href="#">
                                <img src="../images/logo.png" id="home-logo" />
                            </a>
                            <section class="search-area">
                                <section id="search-bar">
                                    <form id="search-form" action="/search">
                                        <fieldset>
                                            <section id="search-1">
                                                <input
                                                    type="search"
                                                    name="search"
                                                    autocomplete="off"
                                                    placeholder="    검색"
                                                />
                                                <button
                                                    id="search-btn"
                                                    class="fa-solid fa-magnifying-glass"
                                                ></button>
                                            </section>
                                        </fieldset>
                                    </form>
                                </section>
                            </section>
                            <section id="user-cart-btn">
                                <a href="/user">
                                    <button id="user" class="far fa-user"></button>
                                </a>
                                <a href="/cart">
                                    <button
                                        id="cart"
                                        class="fas fa-cart-arrow-down"
                                    ></button>
                                </a>
                            </section>
                        </section>
                    </header>
                    <section class="content">
                        <section id="ads">
                            <a href="https://www.coupang.com/np/campaigns/83">
                                <img src="../images/add1.jpg" id="ad1" />
                            </a>
                            <a href="https://www.coupang.com/np/campaigns/11725/components/194176">
                                <img src="../images/add2.jpg" id="ad2" />
                            </a>
                            <a href="https://www.coupang.com/">
                                <img src="../images/add3.jpg" id="ad3" />
                            </a>
                            <a href="https://www.coupang.com/np/campaigns/12456">
                                <img src="../images/add4.jpg" id="ad4" />
                            </a>
                        </section>
                    </section>
                </c:otherwise>
            </c:choose>
        </main>
		<c:if test="${not empty sessionScope.message}">
			
			<script>
				alert('${message}');
			</script>
		
			 <c:remove var="message" scope="session" />
		
		</c:if>
        <footer>
            &copy; Coupang Corp. All rights reserved.
        </footer>
    </body>
</html>

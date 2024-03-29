package edu.kh.coupang.member.controller;

import java.io.IOException;
import java.util.List;

import edu.kh.coupang.cart.model.dto.Cart;
import edu.kh.coupang.cart.model.service.CartService;
import edu.kh.coupang.member.model.dto.Member;
import edu.kh.coupang.member.model.service.MemberService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

	@WebServlet("/user")
	public class UserController extends HttpServlet {
	    @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        try {
	            String inputId = req.getParameter("inputId");
	            String inputPw = req.getParameter("inputPw");

	            MemberService service = new MemberService();

	            Member loginMember = service.login(inputId, inputPw);
	            req.setAttribute("loginMember", loginMember);
	            req.getRequestDispatcher("/WEB-INF/views/user.jsp").forward(req, resp);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	
}}

package edu.kh.coupang.member.controller;

import java.io.IOException;
import edu.kh.coupang.member.model.dto.Member;
import edu.kh.coupang.member.model.service.MemberService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    
	    try {
	        
	        String inputId = req.getParameter("inputId");
	        String inputPw = req.getParameter("inputPw");
	        
	        MemberService service = new MemberService();
	        
	        Member loginMember = service.login(inputId, inputPw);
	        System.out.println(loginMember);
	        req.setAttribute("loginMember", loginMember);
	        
	        HttpSession session = req.getSession();
	        
	        if(loginMember != null) {
	            
	            session.setAttribute("loginMember", loginMember);
	            session.setMaxInactiveInterval(60 * 60); 
	            
	            resp.sendRedirect("/");
	            
	        } else { 
	            
	            session.setAttribute("message", "아이디 또는 비밀번호 불일치");
	            
	            String referer = req.getHeader("referer");
	            
	            resp.sendRedirect(referer);
	        }
	        
	    } catch (Exception e) {
	        System.out.println("[로그인 중 예외 발생]");
	        e.printStackTrace();
	    }
	}

	
	
}

package edu.kh.coupang.cart.member.controller;

import java.io.IOException;
import java.util.List;

import edu.kh.coupang.member.model.dto.Member;
import edu.kh.coupang.cart.model.dto.Cart;
import edu.kh.coupang.cart.model.service.CartService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/insert")
public class InsertController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/views/insert.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			HttpSession session = req.getSession();
			
			String title = req.getParameter("title");
			String memo = req.getParameter("memo");
			
			Member member = (Member) session.getAttribute("loginMember");
			
			CartService service = new CartService();
			
			int result = service.insert(title, memo, member.getMemberNo());
			
			if(result > 0) {
				session.setAttribute("message", "등록되었습니다.");
				
				List<Cart> cartList = service.selectAll(member.getMemberNo());
				session.setAttribute("cartList", cartList);
				String referer = req.getHeader("referer");
				resp.sendRedirect("/");
				
			} else {
				session.setAttribute("message", "등록 실패!");
				
				resp.sendRedirect( req.getHeader("referer") );
				
			}
			
		} catch(Exception e) {
			System.out.println("[Cart 등록 중 예외발생]");
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

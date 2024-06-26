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

@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String cartNo = req.getParameter("cartNo");
			
			CartService service = new CartService();
			
			int result = service.delete(cartNo);
			
			HttpSession session = req.getSession();
			Member member = (Member) session.getAttribute("loginMember");
			
			if(result > 0) {
				
				List<Cart> cartList = service.selectAll(member.getMemberNo());
				session.setAttribute("cartList", cartList);
				
				
			} else {
				session.setAttribute("message", "삭제 실패!");
				
			}
			
			resp.sendRedirect("/");
			
		} catch (Exception e) {
			System.out.println("[삭제 중 예외발생]");
			e.printStackTrace();
		}
	}
}

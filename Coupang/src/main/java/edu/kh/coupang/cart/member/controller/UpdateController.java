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

@WebServlet("/update")
public class UpdateController extends HttpServlet {

	private CartService service = new CartService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			HttpSession session = req.getSession();
			Member member = (Member) session.getAttribute("loginMember");
			
			Cart cart = service.selectOne(req.getParameter("cartNo"), member.getMemberNo());
			
			req.setAttribute("cart", cart);
			
			req.getRequestDispatcher("/WEB-INF/views/update.jsp").forward(req, resp);
			
			
		} catch(Exception e) {
			System.out.println("[수정할 cart 조회 중 예외발생]");
			e.printStackTrace();
		}
		
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			HttpSession session = req.getSession();
			
			Member member = (Member) session.getAttribute("loginMember");
			String title = req.getParameter("title");
			String memo = req.getParameter("memo");
			String cartNo = req.getParameter("cartNo");
			
			int result = service.update(title, memo, member.getMemberNo(), cartNo);
			
			if(result > 0) {
				session.setAttribute("message", "수정 되었습니다!");
				
				List<Cart> cartList = service.selectAll(member.getMemberNo());
				session.setAttribute("cartList", cartList);
				
				resp.sendRedirect("/");
				
			} else {
				session.setAttribute("message", "수정 실패!");
				
				resp.sendRedirect( req.getHeader("referer") );
			}
			
			
			
		} catch(Exception e) {
			System.out.println("[cart 수정 중 예외 발생]");
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
	
	
	

}

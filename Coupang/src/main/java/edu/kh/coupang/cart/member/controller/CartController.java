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

@WebServlet("/cart")
public class CartController extends HttpServlet {

	private CartService service = new CartService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			HttpSession session = req.getSession();
			Member member = (Member) session.getAttribute("loginMember");
			
			List<Cart> cart = service.selectAll(member.getMemberNo());
			System.out.println(cart);
			req.setAttribute("cart", cart);
			
			req.getRequestDispatcher("/WEB-INF/views/cart.jsp").forward(req, resp);
			
			
		} catch(Exception e) {
			System.out.println("[cart 조회 중 예외발생]");
			e.printStackTrace();
		}
		
	}
	

}

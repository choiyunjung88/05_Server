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

@WebServlet("/search")
public class SearchController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			req.getRequestDispatcher("/WEB-INF/views/search.jsp").forward(req, resp);
			
			
		} catch(Exception e) {
			System.out.println("[search 조회 중 예외발생]");
			e.printStackTrace();
		}
		
	}
	

}

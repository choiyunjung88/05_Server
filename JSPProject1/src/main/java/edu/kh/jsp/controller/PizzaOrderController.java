package edu.kh.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.kh.jsp.model.dto.Pizza;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/pizzaOrder")
public class PizzaOrderController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Pizza> pizzaList = new ArrayList<Pizza>();
		
		pizzaList.add(new Pizza("치즈", 8000));
		pizzaList.add(new Pizza("불고기", 9000));
		pizzaList.add(new Pizza("고구마", 10000));
		
		String pizza = req.getParameter("pizza");
		
		String size = req.getParameter("size");
		
		String amount = req.getParameter("amount");
		
		Pizza p = pizzaList.get(Integer.parseInt(pizza) -1);
		
		String pizzaName = p.getName();
		int price = p.getPrice();
		
		if(size.equals("L")) price += 2000;
		
		price *= Integer.parseInt(amount);
		
		req.setAttribute("pizzaName", pizzaName);
		req.setAttribute("price", price);
		
		//jsp로 요청 위임
		//jsp 경로 작성 기준 폴더 : wepapp
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/pizzaResult.jsp");
		
		dispatcher.forward(req, resp);
		
	}
}

package edu.kh.jsp.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/test/result")
public class TestController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//파라미터 X 값세팅X
		// 바로 jsp로 위임코드 작성
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/testResult.jsp");
		dispatcher.forward(req, resp);
		
		
		
		
	}

}

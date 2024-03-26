package edu.kh.servlet.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//요청에 따라 어떤 서비스를 호출할지 "제어"
public class ExampleController1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// HttpServletRequest
		// 클라이언트 요청 시 생성되는 객체
		
		// HttpServletResponse
		// 클라이언트 요청 시 서버에서 생성되는 객체
		
		System.out.println("---이름, 나이를 입력받아 처리하는 코드---");
		// 요청시 입력된 이름, 나이를 전달 받아오기
		
		//req.getParameter("name 속성값");
		//-> 요청시 전달된 데이터 중 name 속성값이 일치하는 데이터의 value를 얻어와 String
		//    형태로 변환
		
		String name = req.getParameter("inputName");
		String age = req.getParameter("inputAge");
		
		System.out.println("입력받은 이름 : "+ name);
		System.out.println("입력받은 나이 : " + age);
	}

}

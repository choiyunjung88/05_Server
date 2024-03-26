package edu.kh.jsp.student.model.service;


import java.sql.Connection;
import java.util.List;

import edu.kh.jsp.common.*;
import edu.kh.jsp.common.JDBCTemplate.*;
import edu.kh.jsp.student.model.dao.StudentDAO;
import edu.kh.jsp.student.model.dto.Student;

public class StudentService{

	private StudentDAO dao = new StudentDAO();
	
	public List<Student> selectAll() throws Exception {
		Connection conn = JDBCTemplate.getConnection();
		
		List<Student> stdList = dao.selectAll(conn);
		
		JDBCTemplate.close(conn);
		return stdList;
	}
	
	public List<Student> selectdep() throws Exception{
		
		
		return null;
		
	}
}

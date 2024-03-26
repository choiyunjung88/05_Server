package edu.kh.todoList.todo.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class TodoDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties prop;
	
	public TodoDAO() {
		try {
			prop = new Properties();
			String filePath 
			    = TodoDAO.class.getResource("/edu/kh/todoList/sql/todo-sql.xml").getPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

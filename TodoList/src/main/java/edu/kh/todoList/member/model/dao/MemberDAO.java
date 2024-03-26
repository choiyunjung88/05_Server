package edu.kh.todoList.member.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class MemberDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties prop;
	
	public MemberDAO() {
		try {
			prop = new Properties();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public Member login(Connection conn, String inputId, String inputPw) {
		
		Member loginMember o :
	}
	
	
	
	
	
	
	
}

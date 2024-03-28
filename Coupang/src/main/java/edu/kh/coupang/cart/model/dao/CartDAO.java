package edu.kh.coupang.cart.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import static edu.kh.coupang.common.JDBCTemplate.*;

import edu.kh.coupang.member.model.dao.MemberDAO;
import edu.kh.coupang.cart.model.dto.Cart;

public class CartDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties prop;
	
	public CartDAO() {
		try {
			prop = new Properties();
			
			String filePath 
				= CartDAO.class.getResource("/edu/kh/coupang/sql/cart-sql.xml").getPath();
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** 로그인한 회원이 등록한 CARTList 전체 조회 SQL 실행 DAO
	 * @param conn
	 * @param memberNo
	 * @return CARTList
	 */
	public List<Cart> selectAll(Connection conn, int memberNo) throws Exception{
		
		List<Cart> cartList = new ArrayList<Cart>();
		
		try {
			String sql = prop.getProperty("selectAll");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, memberNo);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Cart cart = new Cart();
				
				cart.setCartNo( rs.getInt("CART_NO"));
				cart.setCartTitle( rs.getString("CART_TITLE"));
				cart.setCartMemo( rs.getString("CART_MEMO"));
				cart.setCartDate( rs.getString("CART_DATE"));
			
				cartList.add(cart);
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return cartList;
	}

	/** CART 등록 SQL 수행 DAO
	 * @param conn
	 * @param title
	 * @param memo
	 * @param memberNo
	 * @return result
	 */
	public int insert(Connection conn, String title, String memo, int memberNo) throws Exception{
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("insert");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, title);
			pstmt.setString(2, memo);
			pstmt.setInt(3, memberNo);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	/** CART 삭제 SQL 수행 DAO
	 * @param conn
	 * @param CARTNo
	 * @return result
	 */
	public int delete(Connection conn, String CARTNo) throws Exception {
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("delete");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, CARTNo);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	/** CART 조회 SQL 수행 DAO
	 * @param conn
	 * @param CARTNo
	 * @param memberNo
	 * @return CART
	 */
	public Cart selectOne(Connection conn, String CARTNo, int memberNo) throws Exception{
		
		Cart CART = null;
		
		try {
			String sql = prop.getProperty("selectOne");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, memberNo);
			pstmt.setString(2, CARTNo);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				CART = new Cart();
				CART.setCartNo( rs.getInt("CART_NO") );
				CART.setCartTitle( rs.getString("CART_TITLE") );
				CART.setCartMemo( rs.getString("CART_MEMO") );
				CART.setCartDate( rs.getString("CART_DATE") );
				
			}
			
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		
		return CART;
	}

	/** CART 수정 SQL 수행 DAO
	 * @param conn
	 * @param title
	 * @param memo
	 * @param memberNo
	 * @param CARTNo
	 * @return result
	 */
	public int update(Connection conn, String title, String memo, int memberNo, String CARTNo) throws Exception {
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("update");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, title);
			pstmt.setString(2, memo);
			pstmt.setString(3, CARTNo);
			pstmt.setInt(4, memberNo);
			
			result = pstmt.executeUpdate();
			
			
		} finally {
			close(pstmt);
		}
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}

package edu.kh.coupang.cart.model.service;

import java.sql.Connection;
import java.util.List;

import static edu.kh.coupang.common.JDBCTemplate.*;
import edu.kh.coupang.cart.model.dao.CartDAO;
import edu.kh.coupang.cart.model.dto.Cart;

public class CartService {

	private static CartDAO dao = new CartDAO();

	/** 로그인한 회원의 CARTList 전체 조회하기 서비스
	 * @param memberNo
	 * @return CARTList
	 */
	public List<Cart> selectAll(int memberNo) throws Exception{
		
		Connection conn = getConnection();
		
		List<Cart> CARTList = dao.selectAll(conn, memberNo);
		
		close(conn);
		
		return CARTList;
	}

	/** CART 등록하기 서비스
	 * @param title
	 * @param memo
	 * @param memberNo
	 * @return result
	 */
	public int insert(String title, String memo, int memberNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.insert(conn, title, memo, memberNo);
		
		if(result > 0) commit(conn);
		else		rollback(conn);
		
		close(conn);
		
		
		return result;
	}

	/** CART 삭제 서비스
	 * @param CARTNo
	 * @return result
	 */
	public int delete(String CARTNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.delete(conn, CARTNo);
		
		if(result > 0) commit(conn);
		else		rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** CART 조회 서비스
	 * @param parameter
	 * @param memberNo
	 * @return CART
	 */
	public Cart selectOne(String CARTNo, int memberNo) throws Exception {
		
		Connection conn = getConnection();
		
		Cart CART = dao.selectOne(conn, CARTNo, memberNo);
		
		close(conn);
		
		
		return CART;
	}

	/** CART 수정하기 서비스
	 * @param title
	 * @param memo
	 * @param memberNo
	 * @param CARTNo
	 * @return result
	 */
	public int update(String title, String memo, int memberNo, String CARTNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.update(conn, title, memo, memberNo, CARTNo);
		
		if(result > 0) commit(conn);
		else 		rollback(conn);
		
		close(conn);
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

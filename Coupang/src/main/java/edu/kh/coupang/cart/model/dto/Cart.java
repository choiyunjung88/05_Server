package edu.kh.coupang.cart.model.dto;

public class Cart {

	private int cartNo;
	private String cartTitle;
	private String cartMemo;
	private String cartDate;
	private String cartDeleteFlag;
	public int getCartNo() {
		return cartNo;
	}
	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}
	public String getCartTitle() {
		return cartTitle;
	}
	public void setCartTitle(String cartTitle) {
		this.cartTitle = cartTitle;
	}
	public String getCartMemo() {
		return cartMemo;
	}
	public void setCartMemo(String cartMemo) {
		this.cartMemo = cartMemo;
	}
	public String getCartDate() {
		return cartDate;
	}
	public void setCartDate(String cartDate) {
		this.cartDate = cartDate;
	}
	public String getCartDeleteFlag() {
		return cartDeleteFlag;
	}
	public void setCartDeleteFlag(String cartDeleteFlag) {
		this.cartDeleteFlag = cartDeleteFlag;
	}
	@Override
	public String toString() {
		return "Cart [cartNo=" + cartNo + ", cartTitle=" + cartTitle + ", cartMemo=" + cartMemo + ", cartDate="
				+ cartDate + ", cartDeleteFlag=" + cartDeleteFlag + "]";
	}
	public Cart() {
	}
	public Cart(int cartNo, String cartTitle, String cartMemo, String cartDate, String cartDeleteFlag) {
		super();
		this.cartNo = cartNo;
		this.cartTitle = cartTitle;
		this.cartMemo = cartMemo;
		this.cartDate = cartDate;
		this.cartDeleteFlag = cartDeleteFlag;
	}
	
	
}

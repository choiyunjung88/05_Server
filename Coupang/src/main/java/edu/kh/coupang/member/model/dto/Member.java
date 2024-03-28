package edu.kh.coupang.member.model.dto;

public class Member {
	
	private int memberNo;
	private String memberId;
	private String memberPw;
	private String memberNickname;
	private String enrollDate;
	private String memberDeleteFlag;
	
	public Member() {}

	public Member(int memberNo, String memberId, String memberPw, String memberNickname, String enrollDate,
			String memberDeleteFlag) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberNickname = memberNickname;
		this.enrollDate = enrollDate;
		this.memberDeleteFlag = memberDeleteFlag;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public String getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getMemberDeleteFlag() {
		return memberDeleteFlag;
	}

	public void setMemberDeleteFlag(String memberDeleteFlag) {
		this.memberDeleteFlag = memberDeleteFlag;
	}

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPw=" + memberPw
				+ ", memberNickname=" + memberNickname + ", enrollDate=" + enrollDate + ", memberDeleteFlag="
				+ memberDeleteFlag + "]";
	}
	
	
	
}
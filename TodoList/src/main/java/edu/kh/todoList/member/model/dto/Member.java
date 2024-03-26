package edu.kh.todoList.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor //기본생성자
@Setter
@Getter
@ToString
public class Member {

	private int memberNo;
	private String memberId;
	private String memberPw;
	private String memberNickname;
	private String enrollDate;
	private String memberDeleteFlag;
}

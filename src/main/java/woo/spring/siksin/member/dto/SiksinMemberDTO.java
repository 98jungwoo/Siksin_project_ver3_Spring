package woo.spring.siksin.member.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SiksinMemberDTO {

	private int memberNum;
	private String memberName;
	private String nickName;
	private String password;
	private String memberBirth;
	private String gender;
	private String phoneNum;
	private String memberArea;
	private String agree;
}
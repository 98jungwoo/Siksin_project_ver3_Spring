package woo.spring.siksin.review.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SiksinReviewDTO {

	private int reviewNum;
	private String reviewNickName; //nickName으로 변경해야함 회원가입이랑 같아야하니까
	private String reviewPassword; 
	private String ratingScore; // 이거 필수요소 아니니까 그냥 지우기
	private String reviewContent;
	private String restaurantName;
	private String restaurantArea;
	private String restaurantTag;
	private String writeday;
	
}
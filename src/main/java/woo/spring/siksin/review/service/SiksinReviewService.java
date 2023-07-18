package woo.spring.siksin.review.service;

import java.util.List;

import woo.spring.siksin.review.dto.SiksinReviewDTO;

public interface SiksinReviewService {

	List<SiksinReviewDTO> reviewSelectAll();

	void reviewInsert(SiksinReviewDTO siksinReviewDTO);

	int reviewUpdate(SiksinReviewDTO siksinReviewDTO);

	void reviewDelete(SiksinReviewDTO siksinReviewDTO);

	SiksinReviewDTO reviewSelectDetail(int reviewNum);

	int reviewCount();

	//SiksinReviewDTO passwordCheck(int reviewNum, String reviewPassword);
}

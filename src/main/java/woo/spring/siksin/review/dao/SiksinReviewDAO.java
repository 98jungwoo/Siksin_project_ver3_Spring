package woo.spring.siksin.review.dao;

import java.util.List;

import woo.spring.siksin.review.dto.SiksinReviewDTO;


public interface SiksinReviewDAO {

	
	public List<SiksinReviewDTO> selectAll();

	public void insert(SiksinReviewDTO siksinReviewDTO);

	public int update(SiksinReviewDTO siksinReviewDTO);

	public void delete(SiksinReviewDTO siksinReviewDTO);

	public SiksinReviewDTO selectDetail(int reviewNum);

	public int reviewCount();

	//public SiksinReviewDTO passwordCheck(int reviewNum, String reviewPassword);
	
}

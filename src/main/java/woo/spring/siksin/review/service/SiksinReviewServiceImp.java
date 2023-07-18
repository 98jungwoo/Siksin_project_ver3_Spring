package woo.spring.siksin.review.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import woo.spring.siksin.review.dao.SiksinReviewDAO;
import woo.spring.siksin.review.dto.SiksinReviewDTO;

@Service
public class SiksinReviewServiceImp implements SiksinReviewService {

	private static final Logger logger = LoggerFactory.getLogger(SiksinReviewServiceImp.class);

	private final SiksinReviewDAO siksinReviewDAO;

	@Autowired
	public SiksinReviewServiceImp(SiksinReviewDAO siksinReviewDAO) {
		this.siksinReviewDAO = siksinReviewDAO;
	}

	@Override
	public List<SiksinReviewDTO> reviewSelectAll() {
		return siksinReviewDAO.selectAll();
	}

	@Override
	public void reviewInsert(SiksinReviewDTO siksinReviewDTO) {

		try {
			siksinReviewDAO.insert(siksinReviewDTO);

		} catch (DataIntegrityViolationException e) {
			e.printStackTrace();
		}

	}

	@Override
	public int reviewUpdate(SiksinReviewDTO siksinReviewDTO) {
		return siksinReviewDAO.update(siksinReviewDTO);
	}

	@Override
	public void reviewDelete(SiksinReviewDTO siksinReviewDTO) {
		siksinReviewDAO.delete(siksinReviewDTO);
	}

	@Override
	public SiksinReviewDTO reviewSelectDetail(int reviewNum) {
		return siksinReviewDAO.selectDetail(reviewNum);
	}

	@Override
	public int reviewCount() {
		logger.info("■■■■■■ 카운트 reviewCount가 잘 들어왔나 " + siksinReviewDAO.reviewCount());
		return siksinReviewDAO.reviewCount();
	}

//	public SiksinReviewDTO passwordCheck(int reviewNum, String reviewPassword) {
//		return siksinReviewDAO.passwordCheck(reviewNum,reviewPassword);
//		
//	}

}
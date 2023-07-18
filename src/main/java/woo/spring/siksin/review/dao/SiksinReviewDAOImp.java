package woo.spring.siksin.review.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import woo.spring.siksin.review.dto.SiksinReviewDTO;

@Repository
@RequiredArgsConstructor
public class SiksinReviewDAOImp implements SiksinReviewDAO {

	@Autowired
	private final SqlSessionTemplate sqlSessionTemplate;

	//private static final Logger logger = LoggerFactory.getLogger(SiksinReviewDAOImp.class);

	@Override
	public List<SiksinReviewDTO> selectAll() {
		return sqlSessionTemplate.selectList("woo.spring.siksin.review.dao.selectAll");
	}

	@Transactional

	@Override
	public void insert(SiksinReviewDTO siksinReviewDTO) {
		sqlSessionTemplate.insert("woo.spring.siksin.review.dao.insert", siksinReviewDTO);
	}

	@Override
	public int update(SiksinReviewDTO siksinReviewDTO) {
		
		return sqlSessionTemplate.update("woo.spring.siksin.review.dao.update", siksinReviewDTO);
	}

	@Override
	public void delete(SiksinReviewDTO siksinReviewDTO) {
		sqlSessionTemplate.delete("woo.spring.siksin.review.dao.delete", siksinReviewDTO);
	}

	@Override
	public SiksinReviewDTO selectDetail(int reviewNum) {
		return sqlSessionTemplate.selectOne("woo.spring.siksin.review.dao.selectDetail", reviewNum);
	}

	@Override
	public int reviewCount() {
		return sqlSessionTemplate.selectOne("woo.spring.siksin.review.dao.reviewCount");
	}

}

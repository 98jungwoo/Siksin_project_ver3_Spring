package woo.spring.siksin.member.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import woo.spring.siksin.member.dto.SiksinMemberDTO;

@Repository
@RequiredArgsConstructor
public class SiksinMemberDAOImp implements SiksinMemberDAO {

	@Autowired
	private final SqlSessionTemplate sqlsessionTemplate;

	@Override
	public List<SiksinMemberDTO> selectAll() {
		return sqlsessionTemplate.selectList("woo.spring.siksin.member.dao.selectAll");
	}

	@Transactional

	@Override
	public void insert(SiksinMemberDTO siksinMemberDTO) {
		sqlsessionTemplate.insert("woo.spring.siksin.member.dao.insert", siksinMemberDTO);
	}

	@Override
	public void update(SiksinMemberDTO siksinMemberDTO) {
		sqlsessionTemplate.update("woo.spring.siksin.member.dao.update", siksinMemberDTO);

	}

	@Override
	public void delete(SiksinMemberDTO siksinMemeberDTO) {
		sqlsessionTemplate.delete("woo.spring.siksin.member.dao.delete", siksinMemeberDTO);
	}

	@Override
	public SiksinMemberDTO selectDetail(int memberNum) {
		return sqlsessionTemplate.selectOne("woo.spring.siksin.member.dao.selectDetail", memberNum);
	}


	@Override
	public int memberCount() {
		return sqlsessionTemplate.selectOne("woo.spring.siksin.member.dao.memberCount");

	}

	@Override
	public SiksinMemberDTO login(SiksinMemberDTO siksinMemberDTO) {
		return sqlsessionTemplate.selectOne("woo.spring.siksin.member.dao.login", siksinMemberDTO);
	}

	@Override
	public SiksinMemberDTO searchPassword(SiksinMemberDTO siksinMemberDTO) {
		return sqlsessionTemplate.selectOne("woo.spring.siksin.member.dao.searchPassword", siksinMemberDTO);
	}

	@Override
	public List<SiksinMemberDTO> boardDeleteAll(SiksinMemberDTO siksinMemberDTO) {
		return sqlsessionTemplate.selectList("woo.spring.siksin.member.dao.boardDeleteAll", siksinMemberDTO);
	}


}

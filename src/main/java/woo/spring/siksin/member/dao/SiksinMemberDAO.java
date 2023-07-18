package woo.spring.siksin.member.dao;

import java.util.List;

import woo.spring.siksin.member.dto.SiksinMemberDTO;

public interface SiksinMemberDAO {

	public List<SiksinMemberDTO> selectAll();

	public void insert(SiksinMemberDTO siksinMemeberDTO);

	public void update(SiksinMemberDTO siksinMemeberDTO);

	public void delete(SiksinMemberDTO siksinMemeberDTO);

	public SiksinMemberDTO selectDetail(int memberNum);
	
	public int memberCount();

	public SiksinMemberDTO login(SiksinMemberDTO siksinMemberDTO);

	public SiksinMemberDTO searchPassword(SiksinMemberDTO siksinMemberDTO);
	
	public List<SiksinMemberDTO> boardDeleteAll(SiksinMemberDTO siksinMemberDTO);

}

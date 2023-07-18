package woo.spring.siksin.member.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import woo.spring.siksin.member.dto.SiksinMemberDTO;

public interface SiksinMemberService {
	
	List<SiksinMemberDTO> siksinSelectAll();

	void siksinInsert(SiksinMemberDTO siksinMemberDTO);

	void siksinUpdate(SiksinMemberDTO siksinMemberDTO);

	void siksinDelete(SiksinMemberDTO siksinMemberDTO);

	SiksinMemberDTO siksinSelectDetail(int memberNum);

	void siksinMemberNumber();
	
	int siksinMemberCount();
	
	SiksinMemberDTO siksinLogin(SiksinMemberDTO siksinMemberDTO, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse);
	
	void siksinLogout(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse);

	SiksinMemberDTO siksinSearchPassword(SiksinMemberDTO siksinMemberDTO);
	
	List<SiksinMemberDTO> boardDeleteAll(SiksinMemberDTO siksinMemberDTO);

}

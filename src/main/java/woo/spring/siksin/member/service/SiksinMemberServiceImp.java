package woo.spring.siksin.member.service;

import java.util.List;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import woo.spring.siksin.member.dao.SiksinMemberDAO;
import woo.spring.siksin.member.dto.SiksinMemberDTO;

@Service
public class SiksinMemberServiceImp implements SiksinMemberService {

	private static final Logger logger = LoggerFactory.getLogger(SiksinMemberServiceImp.class);

	private final SiksinMemberDAO siksinMemberDAO;

	@Autowired
	public SiksinMemberServiceImp(SiksinMemberDAO siksinMemberDAO) {

		this.siksinMemberDAO = siksinMemberDAO;
	}

	@Override
	public List<SiksinMemberDTO> siksinSelectAll() {
		return siksinMemberDAO.selectAll();
	}

	@Override
	public void siksinInsert(SiksinMemberDTO siksinMemberDTO) {

//		무결성 제약조건
		try {
			siksinMemberDAO.insert(siksinMemberDTO);

		} catch (DataIntegrityViolationException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void siksinUpdate(SiksinMemberDTO siksinMemberDTO) {
		siksinMemberDAO.update(siksinMemberDTO);
	}

	@Override
	public void siksinDelete(SiksinMemberDTO siksinMemberDTO) {
		siksinMemberDAO.delete(siksinMemberDTO);

	}

	@Override
	public SiksinMemberDTO siksinSelectDetail(int memberNum) {
		return siksinMemberDAO.selectDetail(memberNum);
	}

	@Override
	public void siksinMemberNumber() {

	}

	@Override
	public int siksinMemberCount() {
		return siksinMemberDAO.memberCount();
	}

	@Override
	public SiksinMemberDTO siksinLogin(SiksinMemberDTO siksinMemberDTO, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("■■■1■■■ 로그인 서비스 " + siksinMemberDTO);
		siksinMemberDTO = siksinMemberDAO.login(siksinMemberDTO);
		logger.info("■■■2■■■ 로그인 서비스 쿼리 동작하고 옴 " + siksinMemberDTO);
		
		HttpSession httpSession = request.getSession();

		if (siksinMemberDTO == null) {
			return null;

		} else {

			httpSession.setAttribute("memberName", siksinMemberDTO.getMemberName());
			httpSession.setAttribute("nickName", siksinMemberDTO.getNickName());
			httpSession.setAttribute("phoneNum", siksinMemberDTO.getPhoneNum());
			logger.info("■■■3■■■ 로그인 서비스  세션 " + httpSession);
			
			Cookie memberNameCookie = new Cookie("memberName", siksinMemberDTO.getNickName());
			memberNameCookie.setMaxAge(60 * 60 * 24);
			memberNameCookie.setPath("/");
			response.addCookie(memberNameCookie);
			logger.info("■■■4■■■ 로그인 서비스  쿠키 " + response +" ///// " + memberNameCookie);

			Cookie nickNameCookie = new Cookie("nickName", siksinMemberDTO.getMemberName());
			nickNameCookie.setMaxAge(60 * 60 * 24);
			nickNameCookie.setPath("/");
			response.addCookie(nickNameCookie);
			logger.info("■■■5■■■ 로그인 서비스  쿠키 " + response +" ///// " + nickNameCookie);

			Cookie phoneNumCookie = new Cookie("phoneNum", siksinMemberDTO.getPhoneNum());
			phoneNumCookie.setMaxAge(60 * 60 * 24);
			phoneNumCookie.setPath("/");
			response.addCookie(phoneNumCookie);
			logger.info("■■■6■■■ 로그인 서비스  쿠키 " + response +" ///// " + phoneNumCookie);

			return siksinMemberDTO;
		}

	}

	//로그아웃하면 쿠키 세션 초기화 메서드
	@Override
	public void siksinLogout(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession(false);

		// 세션에 값이 있다면 초기화 해라
		if (session != null) {
			logger.info("■■■1■■■ 로그아웃 서비스  세션 초기화 전 " + session);
			session.invalidate();
			logger.info("■■■2■■■ 로그아웃 서비스  세션 초기화 후 " + session);
		}

		Cookie[] cookies = request.getCookies();

		// 쿠키에 값이 있다면
		if (cookies != null) {
			logger.info("■■■3■■■ 로그아웃 서비스 쿠키 초기화 전 " + cookies);
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("nickName") || cookie.getName().equals("memberName")
						|| cookie.getName().equals("phoneNum")) {
					cookie.setMaxAge(0); // 쿠키수명을 0으로 초기화 한다.
					cookie.setPath("/");
					response.addCookie(cookie);
				}
			}
			logger.info("■■■4■■■ 로그아웃 서비스 쿠키 초기화 후 " + cookies);
		}
	}

	//비밀번호 찾기 메서드
	@Override
	public SiksinMemberDTO siksinSearchPassword(SiksinMemberDTO siksinMemberDTO) {
		return siksinMemberDAO.searchPassword(siksinMemberDTO);
	}

	//회원탈퇴하면 해당회원 게시글 삭제되게 하는 메서드
	@Override
	public List<SiksinMemberDTO> boardDeleteAll(SiksinMemberDTO siksinMemberDTO) {
		return siksinMemberDAO.boardDeleteAll(siksinMemberDTO);
	}

}

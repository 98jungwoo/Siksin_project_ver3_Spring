package woo.spring.siksin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import woo.spring.siksin.member.dto.SiksinMemberDTO;
import woo.spring.siksin.member.service.SiksinMemberServiceImp;

@Controller
@RequiredArgsConstructor
public class SiksinLoginController {

	private static final Logger logger = LoggerFactory.getLogger(SiksinLoginController.class);

	@Autowired
	private final SiksinMemberServiceImp siksinMemberServiceImp;

	// 로그인 페이지로 넘어가는 메서드
	@GetMapping("/SiksinLogin")
	public String login() {
		logger.info("■■■1■■■ login GET 컨트롤러 들어옴 ");
		return "./login/login";
	}

	// 로그인 쿼리 동작 메서드
	@PostMapping("/SiksinLogin")
	public String login(Model model, SiksinMemberDTO siksinMemberDTO, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("■■■2■■■ login POST 컨트롤러 들어옴 ");
		model.addAttribute("siksinMemberDTO", siksinMemberServiceImp.siksinLogin(siksinMemberDTO, request, response));
		logger.info("■■■3■■■ login POST 컨트롤러 : 로그인 쿼리 동작하고 옴 ");
		return "./login/login_check";
	}

	// 로그아웃 메서드 쿠키세션 초기화
	@GetMapping("/SiksinLogout")
	public String logout(SiksinMemberDTO siksinMemberDTO, HttpServletRequest request, HttpServletResponse response) {
		logger.info("■■■1■■■ logout GET 컨트롤러 들어옴 ");
		siksinMemberServiceImp.siksinLogout(request, response);
		logger.info("■■■2■■■ logout GET 컨트롤러 : 로그아웃 서비스가서 초기화하고옴 ");
		return "./login/logout";
	}

	// 비밀번호 찾기 페이지로 넘어가는 메서드
	@GetMapping("/SiksinSearchPassword")
	public String searchPassword() {
		logger.info("■■■1■■■ searchPassword GET 컨트롤러 들어옴 ");
		return "./login/password_search";
	}

	// 비밀번호 찾는 쿼리 동작
	@PostMapping("/SiksinSearchPassword")
	public String searchPassword(Model model, SiksinMemberDTO siksinMemberDTO) {
		logger.info("■■■2■■■ searchPassword POST 컨트롤러 들어옴 ");
		model.addAttribute("siksinMemberDTO", siksinMemberServiceImp.siksinSearchPassword(siksinMemberDTO));
		logger.info("■■■3■■■ searchPassword POST 컨트롤러 : 비밀번호 검색 쿼리 동작하고 옴 ");
		return "./login/password_search_view";
	}

}

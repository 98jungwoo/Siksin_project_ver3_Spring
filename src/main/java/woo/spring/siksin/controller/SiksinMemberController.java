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
public class SiksinMemberController {

	@Autowired
	private final SiksinMemberServiceImp siksinMemberServiceImp;

	private static final Logger logger = LoggerFactory.getLogger(SiksinMemberController.class);

	// 회원 전체보기(회원전체 쿼리동작)
	@GetMapping("/SiksinMemberSelect")
	public String selectAll(Model model, SiksinMemberDTO siksinMemberDTO) {
		model.addAttribute("listCount", siksinMemberServiceImp.siksinMemberCount());

		// 리스트로보낼때는 모델로 받아서 보내줘야하는거임
		model.addAttribute("list", siksinMemberServiceImp.siksinSelectAll());
		logger.info("■■■1■■■ selectAll 가 잘 들어왔나 ");
		return "./member/member_select_view";
	}

	// 회원가입 화면이동
	@GetMapping("/SiksinMemberInsert")
	public String insert() {
		logger.info("■■■1■■■ insert겟 메서드 동작함 ");
		return "./member/member_insert";
	}

	// 회원가입 쿼리문 동작(회원전체 쿼리동작_중복안되게 하기 위해서)
	@PostMapping("/SiksinMemberInsert")
	public String insert(Model model, SiksinMemberDTO siksinMemberDTO) {
		logger.info("■■■2■■■ insert포스트 들어옴 ");
		// 모델로감싸면 안된다.->리스트에서 리스트로불러오면 되는건데 리스트에서 그중한가지 불러오는게안되는거야? // 여러개중에서 한가지 값을
		// 가져오기때문에 감싸면 안되는거임
		siksinMemberServiceImp.siksinSelectAll();
		logger.info("■■■3■■■ insert _selectAll(); 메서드 동작하고 옴 ");
		siksinMemberServiceImp.siksinInsert(siksinMemberDTO);
		logger.info("■■■4■■■ insert _insert(); 메서드 동작하고 옴 ");
		return "./member/member_insert_view";
	}

	// 회원정보수정 화면(회원정보상세내용 쿼리동작_기존작성내용 보이게하려고)
	@GetMapping("/SiksinMemberUpdate")
	public String update(Model model, SiksinMemberDTO siksinMemberDTO) {
		logger.info("■■■1■■■ update겟 메서드 동작함 ");
		// 디테일은 모델이없으면 값이 보여지지 않는다.why? -> 단일 값을 조회하여 반환하는 경우일 때, 그 값을 모델에 담아서 뷰로 전달해야
		// 하기 때문에 꼭 모델을 써야한다.
		// ㄴ 디테일에서 모델을 꼭 써야지만 값이 넘어가는 이유가 서비스랑 DAO에서 매개변수가 넘버이기 때문이야(가지고 있는 값이 맴버넘이기
		// 때문에) 만약 매개변수가 DTO면 모델 안써줘도 되는거야
		model.addAttribute("siksinMemberDTO",
				siksinMemberServiceImp.siksinSelectDetail(siksinMemberDTO.getMemberNum()));
		logger.info("■■■2■■■ update갯 selectDetail(); 메서드 동작하고 옴 ");
		return "./member/member_update";
	}

	// 회원정보수정 쿼리동작
	@PostMapping("/SiksinMemberUpdate")
	public String update(SiksinMemberDTO siksinMemberDTO) {
		logger.info("■■■3■■■ update포스트 들어옴 ");
		siksinMemberServiceImp.siksinUpdate(siksinMemberDTO);
		logger.info("■■■4■■■ update포스트 update(); 메서드 동작하고 옴 ");
		return "./member/member_update_view";
	}

	// 회원탈퇴 비밀번호 확인(리뷰상세내용 쿼리동작)
	@GetMapping("/SiksinMemberDelete")
	public String delete(Model model, SiksinMemberDTO siksinMemberDTO) {
		logger.info("■■■1■■■ delete겟 메서드 동작함 ");
		model.addAttribute("siksinMemberDTO",
				siksinMemberServiceImp.siksinSelectDetail(siksinMemberDTO.getMemberNum()));
		logger.info("■■■2■■■ delete갯 selectDetail(); 메서드 동작하고 옴 ");
		return "./member/member_delete";
	}

	// 회원 탈퇴 쿼리 동작
	@PostMapping("/SiksinMemberDelete")
	public String delete(SiksinMemberDTO siksinMemberDTO,HttpServletRequest request, HttpServletResponse response) {
		logger.info("■■■3■■■ delete포스트 메서드 동작함 ");
		siksinMemberServiceImp.boardDeleteAll(siksinMemberDTO);
		logger.info("■■■4■■■ delete포스트boardDeleteAll 메서드  동작하고 옴 ");
		siksinMemberServiceImp.siksinDelete(siksinMemberDTO);
		logger.info("■■■5■■■ delete포스트_delete 메서드  동작하고 옴 ");
		siksinMemberServiceImp.siksinLogout(request, response);
		logger.info("■■■6■■■ delete포스트siksinLogout 메서드  동작하고 옴 ");
		return "./member/member_delete_view";
	}

	// 회원 정보 상세보기메서드
	@GetMapping("/SiksinMemberSelectDetail")
	public String selectDetail(Model model, SiksinMemberDTO siksinMemberDTO) {
		logger.info("■■■1■■■ selectDetail겟 메서드 동작함 ");
		model.addAttribute("siksinMemberDTO",
				siksinMemberServiceImp.siksinSelectDetail(siksinMemberDTO.getMemberNum()));
		logger.info("■■■2■■■ selectDetail겟selectDetail 메서드  동작하고 옴 ");
		return "./member/member_select_detail_view";
	}
	
	
}

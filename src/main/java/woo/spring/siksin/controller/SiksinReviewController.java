package woo.spring.siksin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import woo.spring.siksin.review.dto.SiksinReviewDTO;
import woo.spring.siksin.review.service.SiksinReviewServiceImp;

@Controller
@RequiredArgsConstructor
public class SiksinReviewController {

	private static final Logger logger = LoggerFactory.getLogger(SiksinReviewController.class);

	@Autowired
	private final SiksinReviewServiceImp siksinReviewServiceImp;

	// 리뷰 전체보기(리뷰전체내용 쿼리동작)
	@GetMapping("/SiksinReviewSelect")
	public String selectAll(Model model, SiksinReviewDTO siksinReviewDTO) {
		model.addAttribute("list", siksinReviewServiceImp.reviewSelectAll());
		model.addAttribute("listcount", siksinReviewServiceImp.reviewCount());
		logger.info("■■■■■■ 카운트 reviewCount가 잘 들어왔나 " + siksinReviewServiceImp.reviewCount());
		return "./review/review_select_view";
	}

	// 리뷰작성 화면이동
	@GetMapping("/SiksinReviewInsert")
	public String insert() {
		logger.info("■■■■■■ insert 갯 메서드 동작함 ");
		return "./review/review_insert";
	}

	// 리뷰작성 쿼리문 동작(리뷰전체내용 쿼리동작_중복안되게 하기 위해서)
	@PostMapping("/SiksinReviewInsert")
	public String insert(Model model, SiksinReviewDTO siksinReviewDTO) {
		logger.info("■■■■■■ 인설트 포스트 들어옴 ");
		model.addAttribute("list", siksinReviewServiceImp.reviewSelectAll());
		logger.info("■■■■■■ 인설트 _selectAll 메서드 동작하고 옴 ");
		siksinReviewServiceImp.reviewInsert(siksinReviewDTO);
		logger.info("■■■■■■ 인설트 _insert 메서드 동작하고 옴 ");
		return "./review/review_insert_view";
	}

	// 리뷰수정 화면(리뷰상세내용 쿼리동작_기존작성내용 보이게하려고)
	@GetMapping("/SiksinReviewUpdate")
	public String update(Model model, SiksinReviewDTO siksinReviewDTO) {
		model.addAttribute("siksinReviewDTODetail",
				siksinReviewServiceImp.reviewSelectDetail(siksinReviewDTO.getReviewNum()));
		logger.info(" ■■■■■■■ 여기 업데이트 갯 _ reviewSelectDetail 동작하고 옴 + " + siksinReviewDTO.getReviewNum());
		return "./review/review_update";
	}

	// 리뷰수정 쿼리문 동작
	@PostMapping("/SiksinReviewUpdate")
	public String update(SiksinReviewDTO siksinReviewDTO) {
		siksinReviewServiceImp.reviewUpdate(siksinReviewDTO);
		logger.info(" ■■■■■■■ 여기 업데이트 포스트" + siksinReviewDTO);
		return "./review/review_update_view";
	}

	// 리뷰삭제 비밀번호 확인(리뷰상세내용 쿼리동작)
	@GetMapping("/SiksinReviewDelete")
	public String delete(Model model, SiksinReviewDTO siksinReviewDTO) {
		logger.info(" ■■■■■■■ 여기 딜리트 갯" + siksinReviewDTO.getReviewNum());
		model.addAttribute("siksinReviewDTODetail",
				siksinReviewServiceImp.reviewSelectDetail(siksinReviewDTO.getReviewNum()));
		return "./review/review_delete";
	}

	// 리뷰삭제 쿼리 동작
	@PostMapping("/SiksinReviewDelete")
	public String delete(SiksinReviewDTO siksinReviewDTO) {
		logger.info(" ■■■■■■■ 여기 딜리트 포스트" + siksinReviewDTO);
		siksinReviewServiceImp.reviewDelete(siksinReviewDTO);
		return "./review/review_delete_view";
	}

	// 리뷰상세내용 보기 쿼리동작
	@GetMapping("/SiksinReviewSelectDetail")
	public String selectDetail(Model model, SiksinReviewDTO siksinReviewDTO) {
		model.addAttribute("siksinReviewDTO",
				siksinReviewServiceImp.reviewSelectDetail(siksinReviewDTO.getReviewNum()));
		return "./review/review_select_detail_view";
	}

}

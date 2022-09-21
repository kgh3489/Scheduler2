package com.group2.scheduler.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.group2.scheduler.entity.LectureEntity;
import com.group2.scheduler.service.LectureService;
import com.group2.scheduler.service.RegisterService;

@Controller
@RequestMapping("/lecture")
public class LectureController {
	
	@Autowired
	@Qualifier("lectureService")
	private LectureService lectureService;
	
	@Autowired
	@Qualifier("registerService")
	private RegisterService registerService;
	
	//강의 리스트
	@GetMapping("/list")
	public String list(Model model) {
		
		List<LectureEntity> list = lectureService.getList();
		model.addAttribute("list", list);
		
		return "lecture/mainlist";
	}
	
	//상세 화면
	@GetMapping("/detail")
	public String detail(@RequestParam("lno") int lno, 
						 Model model,
						 RedirectAttributes ra) {
		
		LectureEntity lecture = lectureService.getDetail(lno);
		model.addAttribute("lecture", lecture);
		
		//수강 인원
		int fixedNum = 0;
		fixedNum = registerService.CountUp(lecture);
		model.addAttribute("fixedNum", fixedNum);
		
		//수강 신청 인원이 가능 인원 이상이면 접근 불가
		if (fixedNum >= lecture.getFixedNum()) {
			ra.addFlashAttribute("msg", "수강 인원이 꽉 찼습니다...");
			return "redirect:/lecture/list";
		}
		
		return "lecture/detail";
	}
	
	//마이 페이지
	@GetMapping("/mypage")
	public String mypage(HttpSession session,
						 @RequestParam("uno") int uno,
						 Model model) {
//		int uno = (int)session.getAttribute("uno");
		
		List<LectureEntity> list = lectureService.getMyPage(uno);
		model.addAttribute("list", list);
		
		return "lecture/mypage";
	}
	
}

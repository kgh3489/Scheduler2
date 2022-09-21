package com.group2.scheduler.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.group2.scheduler.service.RegisterService;

@Controller
@RequestMapping("register")
public class RegisterController {

	@Autowired
	@Qualifier("registerService")
	RegisterService registerService;

	// 강의 신청
	@PostMapping("/lecture")
	public String register(HttpSession session, @RequestParam("lno") int lno, RedirectAttributes ra) {

		int uno = (int) session.getAttribute("uno");
		System.out.println("lno" + lno);
		System.out.println("uno" + uno);

		registerService.LectureRegister(lno, uno);

		ra.addFlashAttribute("msg", "신청이 완료되었습니다.");

		return "redirect:/lecture/list";
	}

	// 강의 삭제
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {

		registerService.lectureDelete(id);
		
		return "redirect:/lecture/mypage";
	}

}

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

import com.group2.scheduler.entity.LectureEntity;
import com.group2.scheduler.service.LectureService;

@Controller
@RequestMapping("/lecture")
public class LectureController {
	
	@Autowired
	@Qualifier("lectureService")
	private LectureService lectureService;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		List<LectureEntity> list = lectureService.getList();
		model.addAttribute("list", list);
		
		return "lecture/mainlist";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam("lno") int lno, Model model) {
		
		LectureEntity lecture = lectureService.getDetail(lno);
		model.addAttribute("lecture", lecture);
		
		return "lecture/detail";
	}
	
	@GetMapping("/mypage")
	public String mypage(HttpSession session, Model model) {
		
		List<LectureEntity> list = lectureService.getMyList();
		model.addAttribute("list", list);
		
		return "lecture/mypage";
	}
	
	
}

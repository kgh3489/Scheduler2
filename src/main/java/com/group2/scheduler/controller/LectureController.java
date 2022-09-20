package com.group2.scheduler.controller;

import java.util.List;

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
		
		return "lecture/list";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam("lno") int lno) {
		
		lectureService.getDetail(lno);
		
		return "lecture/detail";
	}
	
	
	
}

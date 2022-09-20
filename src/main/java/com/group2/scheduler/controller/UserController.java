package com.group2.scheduler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/main")
	public void main() {
		System.out.println("main is running...");
	}
}

package com.group2.scheduler.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.group2.scheduler.entity.UserEntity;
import com.group2.scheduler.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// 회원가입, 로그인 페이지
	@GetMapping("/main")
	public void main(HttpServletRequest request
					) {
		//자바 쿠키
//		Cookie[] arr = request.getCookies();
//		
//		if(arr != null) {
//			for(Cookie c : arr) {
//				System.out.println(c.getName());
//				System.out.println(c.getValue());
//			}
//			
//		}

		
		
		
	}
	
	// 회원가입
	@PostMapping("/join")
	public String join(UserEntity.Request user,
					  RedirectAttributes ra) {
		
		// 아이디 중복 확인
		UserEntity userInfo = user.toEntity(user);
		if (userService.getUserInfo(userInfo) != null) {
			
			ra.addFlashAttribute("msg", "아이디가 중복됩니다.");
			return "redirect:/user/main";
		} else {
			
			int result = userService.join(userInfo);
			
			if (result == 1) {
				ra.addFlashAttribute("msg", "환영합니다!");
				return "user/main"; // 경로 지정 필요
			} else {
				ra.addFlashAttribute("msg", "회원가입에 실패했습니다.");
				return "redirect:/user/main";
			}
			
		}
		
	}
	
	// 로그인
	@PostMapping("/login")
	public String login(UserEntity user, 
						HttpSession session,
						RedirectAttributes ra) {
		
		UserEntity userInfo = userService.getUserInfo(user);
		
		if (userInfo == null) {
			
			ra.addFlashAttribute("msg", "아이디나 비밀번호를 확인해주세요.");
			
			return "redirect:/user/main";
		} else {

			session.setAttribute("userId", userInfo.getId());
			session.setAttribute("uno", userInfo.getUno());
			session.setAttribute("userName", userInfo.getName());

			return "redirect:/lecture/list";
		}
		
	}
	
	// 로그아웃
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/user/main";
	}
	
}
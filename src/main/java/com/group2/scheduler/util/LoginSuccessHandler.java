package com.group2.scheduler.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginSuccessHandler implements HandlerInterceptor {

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		
		//자바측 쿠키생성
		//로그인 성공시 포스트 핸들
		String a = request.getParameter("saveId");
		String id = request.getParameter("id");
		if(a != null) {
			Cookie coo = new Cookie("user", id);
			coo.setMaxAge(3600); //1시간
			response.addCookie(coo);
		}
		
	}

	
	
}

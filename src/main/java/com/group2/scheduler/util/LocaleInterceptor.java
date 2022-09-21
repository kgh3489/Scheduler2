package com.group2.scheduler.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LocaleInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(
			HttpServletRequest request,
			HttpServletResponse response,
			Object handler) throws Exception {

		System.out.println("인터셉터 실행됨");


		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("userId");

		//개발단계에서는 가짜 아이디로 세션을 등록
		//session.setAttribute("userId", "admin");
		//session.setAttribute("userName", "곽건호");
		//String userId = (String)session.getAttribute("userId");

		if(userId == null) {
			response.sendRedirect("/user/main"); //로그인화면으로

			return false; //컨트롤러를 실행하지 않음

		} else {
			return true; //컨트롤러를 실행함
		}
	} //헐
	
	
	
}

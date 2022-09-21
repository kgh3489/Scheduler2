package com.group2.scheduler.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.group2.scheduler.util.LocaleInterceptor;
import com.group2.scheduler.util.LoginSuccessHandler;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
	
	@Bean //인터셉터 빈 등록
	public LocaleInterceptor localeInterceptor() {
		return new LocaleInterceptor();
	}
	
	//로그인 석세스 핸들러
	@Bean
	public LoginSuccessHandler loginSuccessHandler() {
		return new LoginSuccessHandler();
	}
	
	
	@Override // 인터셉터 추가
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor( localeInterceptor() )
				.addPathPatterns("/lecture/detail")
				.addPathPatterns("/lecture/list")
				.addPathPatterns("/lecture/mypage")
				
				.excludePathPatterns("/user/main");
		
		//hello
		registry.addInterceptor( loginSuccessHandler())
				.addPathPatterns("/user/login");
				
	}
	
}

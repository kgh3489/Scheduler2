package com.group2.scheduler.service;

import com.group2.scheduler.entity.UserEntity;

public interface UserService {

	// 회원가입
	int join(UserEntity user);
	
	// 회원정보 조회
	UserEntity getUserInfo(UserEntity user);
	
}

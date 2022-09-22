package com.group2.scheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group2.scheduler.entity.UserEntity;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public int join(UserEntity user) {

		UserEntity result = userRepository.save(user);
		
		if (result != null) {
			
			return 1;
		}
		
		return 0;
	}

	@Override
	public UserEntity getUserInfo(UserEntity user) {
		

		UserEntity userInfo = userRepository.checkUserInfo(user.getId());
		
		if (userInfo != null) {
			
			return userInfo;
		}
		
		return null;
	}
	
}

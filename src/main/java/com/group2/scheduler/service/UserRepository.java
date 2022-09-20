package com.group2.scheduler.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group2.scheduler.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	UserEntity findByIdAndPw(String id, String pw);
}

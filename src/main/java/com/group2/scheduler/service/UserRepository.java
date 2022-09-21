package com.group2.scheduler.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.group2.scheduler.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	@Query("select u from UserEntity u where u.id = :id")
	UserEntity checkUserInfo(@Param("id") String id);
}

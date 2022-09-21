package com.group2.scheduler.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group2.scheduler.entity.RegisterEntity;

public interface RegisterRepository extends JpaRepository<RegisterEntity, Integer>{

}

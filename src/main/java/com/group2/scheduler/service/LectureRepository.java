package com.group2.scheduler.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group2.scheduler.entity.LectureEntity;

public interface LectureRepository extends JpaRepository<LectureEntity, Integer> {

}

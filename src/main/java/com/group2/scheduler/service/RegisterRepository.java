package com.group2.scheduler.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.group2.scheduler.entity.LectureEntity;
import com.group2.scheduler.entity.RegisterEntity;

public interface RegisterRepository extends JpaRepository<RegisterEntity, Integer> {

	@Query("SELECT COUNT(r) FROM RegisterEntity r WHERE r.lectureEntity = :lectureEntity")
	public int CountUp(@Param("lectureEntity") LectureEntity lectureEntity);
}

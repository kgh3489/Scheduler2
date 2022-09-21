package com.group2.scheduler.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.group2.scheduler.entity.LectureEntity;

public interface LectureRepository extends JpaRepository<LectureEntity, Integer> {

	@Query(value = "SELECT r.id, r.uno, l.* "
			+ "FROM register r LEFT JOIN lecture l "
			+ "ON r.lno = l.lno WHERE r.uno = ?", nativeQuery = true)
	public List<LectureEntity> getMyPage(int uno);
}

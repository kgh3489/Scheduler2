package com.group2.scheduler.service;

import java.util.List;

import com.group2.scheduler.entity.LectureEntity;

public interface LectureService {

	List<LectureEntity> getList(); //모든 목록
	
	LectureEntity getDetail(int lno); //상세 화면
	
	List<LectureEntity> getMyPage(int uno); //마이 페이지
}

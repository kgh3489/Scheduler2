package com.group2.scheduler.service;

import com.group2.scheduler.entity.LectureEntity;
import com.group2.scheduler.entity.RegisterEntity;

public interface RegisterService {
	
	RegisterEntity LectureRegister(int lno, int uno); //강의 신청
	
	int CountUp(LectureEntity lectureEntity); //강의 수강인원 확인
}

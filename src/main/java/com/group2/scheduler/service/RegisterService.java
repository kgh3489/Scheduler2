package com.group2.scheduler.service;

import com.group2.scheduler.entity.RegisterEntity;

public interface RegisterService {
	
	RegisterEntity LectureRegister(int lno, int uno); //강의 신청
	
	void lectureDelete(int id);
}

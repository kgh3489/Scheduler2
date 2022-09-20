package com.group2.scheduler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group2.scheduler.entity.LectureEntity;

@Service("lectureService")
public class LectureServiceImpl implements LectureService{

	@Autowired
	LectureRepository lectureRepository;
	
	@Override
	public List<LectureEntity> getList() {
		
		return lectureRepository.findAll();
	}
	
}

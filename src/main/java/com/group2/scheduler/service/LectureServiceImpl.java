package com.group2.scheduler.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public LectureEntity getDetail(int lno) {
		Optional<LectureEntity> result = lectureRepository.findById(lno);
		if (result.isPresent()) {
			LectureEntity lectureEntity = result.get();
			return lectureEntity;
		} else {
			return null;
		}
	}
	
}

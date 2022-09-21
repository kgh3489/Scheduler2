package com.group2.scheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group2.scheduler.entity.LectureEntity;
import com.group2.scheduler.entity.RegisterEntity;

@Service("registerService")
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	RegisterRepository registerRepository;
	
	@Autowired
	LectureRepository lectureRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public RegisterEntity LectureRegister(int lno, int uno) {
		
		RegisterEntity en = RegisterEntity.builder().build();
		
		en.setLectureEntity(lectureRepository.findById(lno).get());
		
		en.setUserEntity(userRepository.findById(uno).get());
		
//		RegisterEntity re = RegisterEntity.builder()
//				  .lectureEntity(lno)
//				  .userEntity(null)
//				  .build();
		
		return registerRepository.save(en);
	}

	@Override
<<<<<<< HEAD
	public void lectureDelete(int id) {
		
		registerRepository.deleteById(id);
		
	}
	
=======
	public int CountUp(LectureEntity lectureEntity) {
		
		return registerRepository.CountUp(lectureEntity);
	}
>>>>>>> origin/master
}

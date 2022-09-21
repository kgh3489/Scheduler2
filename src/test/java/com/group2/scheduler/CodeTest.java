package com.group2.scheduler;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.group2.scheduler.entity.LectureEntity;
import com.group2.scheduler.service.LectureService;
import com.group2.scheduler.service.RegisterService;

@SpringBootTest
public class CodeTest {

	@Autowired
	RegisterService registerService;
	
	@Autowired
	LectureService lectureService;
	
//	@Test
//	public void test01() {
//		
//		RegisterEntity re = registerService.LectureRegister(1, 1);
//			
//		System.out.println(re);
//		System.out.println(re.getUserEntity().getPw());
//	}
	
//	@Test
//	public void test02() {
//		List<LectureEntity> list = lectureService.getMyPage(2);
//		System.out.println(list);
//	}
}

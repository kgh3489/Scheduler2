package com.group2.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.group2.scheduler.entity.RegisterEntity;
import com.group2.scheduler.service.RegisterService;

@SpringBootTest
public class Test {

	@Autowired
	RegisterService registerService;
	
	@org.junit.jupiter.api.Test
	public void test12312() {
		
		RegisterEntity re = registerService.LectureRegister(1, 1);
			
		System.out.println(re);
		
		System.out.println(re.getUserEntity().getPw());
		
	}
	
}

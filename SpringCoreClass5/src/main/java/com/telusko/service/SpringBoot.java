package com.telusko.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class SpringBoot implements ICourse {
	
	
	public SpringBoot() {
		System.out.println("springboot bean is created");
	}
	

	@Override
	public Boolean getTheCourse(Double amount) {
		System.out.println("Spring boot course is purchased and fees paid is "+amount);
		return true;
	}

}

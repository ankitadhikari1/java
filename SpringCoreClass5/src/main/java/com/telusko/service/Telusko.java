package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Telusko {
	
//	@Autowired
//	@Qualifier("java")
	private ICourse course;
	
	public Telusko() {
		super();
		System.out.println("telusko bean created");
	}
	
	
	@Autowired
	public Telusko(@Qualifier("java")ICourse course) {
		
		super();
		System.out.println("this is constructor injection");
		this.course = course;
	}
	

//	@Autowired
//	@Qualifier("java")
	public void setCourse(ICourse course) {
		System.out.println("setter injection");
		this.course = course;
	}



	public Boolean buyTheCourse(Double Amount){
		return course.getTheCourse(Amount);
	}
	
}

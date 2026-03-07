package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.service.Telusko;

public class LaunchApplication {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		
		Telusko t = container.getBean(Telusko.class);
		Boolean status = t.buyTheCourse(444.4);
		
		if(status) {
			System.out.println("course purchased successfull");
		}
		else {
			System.out.println("something went wrong");
		}
		 

	}

}

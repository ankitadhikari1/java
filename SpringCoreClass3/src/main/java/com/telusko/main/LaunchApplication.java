package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.main.service.Password;

public class LaunchApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		Password p = container.getBean(Password.class);
		p.passwordAlgoUsed();
		
	}

}

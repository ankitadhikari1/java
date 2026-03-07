package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.telusko.main.config.JavaConfiguration;
import com.telusko.main.services.Greetings;

public class LaunchApplication {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
		Greetings greet = container.getBean(Greetings.class);
		System.out.println(greet.generateGreetings("Ankit"));

	}

}

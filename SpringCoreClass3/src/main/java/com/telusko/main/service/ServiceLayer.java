package com.telusko.main.service;

import org.springframework.stereotype.Service;

@Service  // bean id - camel case (serviceLayer)
public class ServiceLayer {
	public ServiceLayer() {
		System.out.println("service layer bean created");
	}
}

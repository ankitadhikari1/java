package com.telusko.main.service;



public class Password {
	
	String algo;
	
	public Password(String algo) {
		this.algo = algo;
		System.out.println("Password bean created");
	}
	
	
	public void passwordAlgoUsed() {
		System.out.println("algo used for pass is "+ algo);
	}
}

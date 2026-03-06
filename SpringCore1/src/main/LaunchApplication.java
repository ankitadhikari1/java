package main;

import services.Java;
import services.Telusko;

public class LaunchApplication {

	public static void main(String[] args) {
		
		Telusko t = new Telusko();
		t.setCourse(new Java());
		Boolean flag = t.buyTheCourse(4545.5);
		if(flag==true) {
			System.out.println("course enrollemnt successfull");
		}
		else {
			System.out.println("something went wrong");
		}

	}

}

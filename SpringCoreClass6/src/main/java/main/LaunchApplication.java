package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import services.Employee;

public class LaunchApplication {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		
		Employee e1 = container.getBean("emp1",Employee.class);
		System.out.println(e1);
		System.out.println(e1.employeeTask());
		
		System.out.println("......................................");
		
		Employee e2 = container.getBean("emp2",Employee.class);
		System.out.println(e2);
		System.out.println(e2.employeeTask());

	}

}

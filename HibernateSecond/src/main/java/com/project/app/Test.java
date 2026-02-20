package com.project.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.model.Student;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.openSession();
		
		Student s = session.get(Student.class, 1);
		
		System.out.println(s);
		
		session.close();
		factory.close();
		

	}

}

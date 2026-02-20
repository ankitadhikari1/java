package com.project.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.model.Student;

public class Level2Caching {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session1 = factory.openSession();
		Session session2 = factory.openSession();
		
		Student s1 = session1.get(Student.class, 1);
		System.out.println(s1);
		Student s2 = session1.get(Student.class, 1);
		System.out.println(s2);
		
		Student s3 = session2.get(Student.class, 1);
		System.out.println(s3);
		Student s4 = session2.get(Student.class, 1);
		System.out.println(s4);
		
		
	}

}

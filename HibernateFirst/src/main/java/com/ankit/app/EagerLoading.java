package com.ankit.app;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ankit.model.Student;

public class EagerLoading {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Student student = session.get(Student.class, 44);
		if(student!=null) {
			System.out.println("Name :"+student.getsName());
			System.out.println("City :"+student.getCity());
		}
		else {
			System.out.println("data is not present in database");
		}

	}

}

package com.ankit.app;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ankit.model.Student;

public class LazyLoading {

	public static void main(String[] args) throws IOException {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Student student = session.getReference(Student.class,44);
		System.out.println("Student id :"+student.getsId());
		System.in.read();
		//after this ObjectNotFoundException will be thrown becuase data is not present
		System.out.println("Student name :"+student.getsName());
		System.out.println("Student city :"+student.getCity());
		
		session.close();
		factory.close();
		

	}

}

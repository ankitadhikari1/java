package com.ankit.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ankit.model.Student;

public class LaunchGetDetails {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction  = null;
		
		sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		session = sessionFactory.openSession();
		boolean flag = false;
		Student student = null;
		
		try {
			 
			 student = session.get(Student.class, 1);
			 System.out.println(student);
			 flag = true;
			 
		}
		catch(HibernateException e) {
			e.getStackTrace();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		finally {
			if(flag == true) {
				System.out.println("data retrieval completed");
			}
			else {
				System.out.println("data retrieval failed");
			}
			
			session.close();
			sessionFactory.close();
		}

	}

}

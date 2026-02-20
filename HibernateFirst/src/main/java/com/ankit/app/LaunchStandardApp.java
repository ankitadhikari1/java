package com.ankit.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ankit.model.Student;

public class LaunchStandardApp {

	public static void main(String[] args) {
		Configuration config  = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		
		config = new Configuration();
		config.configure();
		
		sessionFactory = config.buildSessionFactory();
		session = sessionFactory.openSession();
		
		Student student = new Student();
		student.setsName("Deepak");
		student.setsId(2);
		student.setCity("dehradun");
		
		boolean flag = false;
		
		
		try{
			transaction = session.beginTransaction();
			session.persist(student);
			flag = true;
			
		}
		catch(HibernateException e) {
			e.getStackTrace();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		finally {
			if(flag) {
				transaction.commit();
				System.out.println("transion completed successfully");
			}
			else {
				transaction.rollback();
			}
			
			session.close();
			sessionFactory.close();
		}
		
		

	}

}

package com.ankit.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ankit.model.Student;

public class LaunchUpdate {

	public static void main(String[] args) {
		Configuration config = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction  = null;
		
		config = new Configuration();
		config.configure();
		
		sessionFactory = config.buildSessionFactory();
		session = sessionFactory.openSession();
		boolean flag = false;
		
		try {
			 transaction  = session.beginTransaction();
			 Student student = new Student();
			 student.setsId(3);
			 student.setCity("pithoragarh");
			 student.setsName("pooja");
			 
			 session.merge(student);
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
				transaction.commit();
				System.out.println("transaction completed");
			}
			else {
				System.out.println("transaction failed");
			}
			
			session.close();
			sessionFactory.close();
		}

	}

}

package main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import services.Employee;

public class LaunchApp {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure();
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction txn= session.beginTransaction();
		
		Employee emp = new Employee();
		
		emp.setName("Rohit");
		emp.setCity("Haldwani");
		
		try {
			session.persist(emp);
			txn.commit();
			System.out.println("transaction successfull");
		}
		catch(HibernateException e) {
			e.getStackTrace();
		}
		
		session.close();
		factory.close();

	}

}

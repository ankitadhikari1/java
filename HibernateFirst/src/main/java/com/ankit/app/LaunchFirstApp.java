package com.ankit.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ankit.model.Student;

public class LaunchFirstApp {

	public static void main(String[] args) {
		
		//step 1 - generate configuration object
		Configuration config = new Configuration();
		
		/*step 2 - configure hibernate configuration file hibernate.cfg.xml
		 in configuration object */
		 config.configure();
		 
		 /* in case you have given other name then defualt name 
		  * you need to give file name also in parameter
		  * eg - config.configure("hib.configure.xml");
		  */
		 
		 //step 3 - create session factory object
		 SessionFactory sessionFactory = config.buildSessionFactory();
		 
		 //step 4 - get session object from session factory
		  Session session =sessionFactory.openSession();
		  
		  
		  //step 5 -  begin the transaction within the session
		  Transaction transaction = session.beginTransaction();
		  
		  
		  Student student = new Student();
		  student.setsId(1);
		  student.setsName("Ankit");
		  student.setCity("haldwani");
		  
		  
		  //step 6 - perform operation
		  session.save(student);
		  
		  //step 7 - performing transaction operation
		  transaction.commit(); 
		  
		  //step 8 - close session
		  session.close();
		  
		  
		

	}

}

package com.project.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.project.model.Answer;
import com.project.model.Question;

public class LaunchStandardApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		
		
		Session session = null;
		Transaction txn = null;

		boolean flag = false;
		
		
		session = factory.openSession();
		
//		Question q1 = new Question();
//		q1.setId(1);
//		q1.setQuestion("what is Hibernate");
//		
//		
//		Answer ans1 = new Answer();
//		ans1.setId(1);
//		ans1.setAnswer("ORM model");
//		
//		q1.setAnswer(ans1);
//		
//		
//		Question q2 = new Question();
//		q2.setId(2);
//		q2.setQuestion("what is Java");
//		
//		
//		Answer ans2 = new Answer();
//		ans2.setId(2);
//		ans2.setAnswer("Programming language");
//		
//		q2.setAnswer(ans2);
		
//		try {
//			txn = session.beginTransaction();
//			session.persist(q1);
//			session.persist(q2);
//			flag = true;
//		}
//		catch(HibernateException e) {
//			e.getStackTrace();
//		}
//		catch(Exception e) {
//			e.getStackTrace();
//		}
//		finally {
//			if(flag== true) {
//				txn.commit();
//			}
//			session.close();
//			factory.close();
//		}
		
		Question q = session.get(Question.class,1);
		System.out.println(q);
		
		session.close();
		factory.close();
		
		
	}

}

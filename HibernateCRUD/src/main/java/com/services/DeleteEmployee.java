package com.services;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

public class DeleteEmployee {
	
	Session session = null;
    Transaction txn = null;
	
	public void delete(Scanner sc , SessionFactory factory) {
		session = factory.openSession();

        System.out.println("enter employee id to delete");
        int id = sc.nextInt();

        try {

            txn = session.beginTransaction();

            MutationQuery query = session.createMutationQuery(
                    "DELETE FROM Employee WHERE id=:id");

            query.setParameter("id", id);

            int rows = query.executeUpdate();

            txn.commit();

            if (rows > 0)
                System.out.println("delete successful");
            else
                System.out.println("employee not found");

        } catch (Exception e) {

            if (txn != null)
                txn.rollback();

            e.printStackTrace();
        }

        session.close();
	}
}

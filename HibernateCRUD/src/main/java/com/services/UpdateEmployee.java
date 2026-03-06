package com.services;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

public class UpdateEmployee {

    Session session = null;
    Transaction txn = null;

    public void update(Scanner sc, SessionFactory factory) {

        session = factory.openSession();

        System.out.println("enter employee id to edit");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("enter name");
        String name = sc.nextLine();

        System.out.println("enter designation");
        String designation = sc.nextLine();

        try {

            txn = session.beginTransaction();

            MutationQuery query = session.createMutationQuery(
                    "UPDATE Employee SET name=:name , designation=:designation WHERE id=:id");

            query.setParameter("name", name);
            query.setParameter("designation", designation);
            query.setParameter("id", id);

            int rows = query.executeUpdate();

            txn.commit();

            if (rows > 0)
                System.out.println("update successful");
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
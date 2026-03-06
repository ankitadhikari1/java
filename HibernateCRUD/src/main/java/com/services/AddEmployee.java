package com.services;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Employee;

public class AddEmployee {

    Session session = null;
    Transaction txn = null;

    public void add(Scanner sc, SessionFactory factory) {

        session = factory.openSession();

        try {
            txn = session.beginTransaction();

            System.out.println("enter number of employee to insert");
            int num = sc.nextInt();

            while (num-- > 0) {

                System.out.println("enter id of employee");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("enter name of employee");
                String name = sc.nextLine();

                System.out.println("enter designation of employee");
                String designation = sc.nextLine();

                Employee employee = new Employee();
                employee.setId(id);
                employee.setName(name);
                employee.setDesignation(designation);

                session.persist(employee);
            }

            txn.commit();
        }

        catch (HibernateException e) {
            if (txn != null)
                txn.rollback();
            e.printStackTrace();
        }

        catch (Exception e) {
            if (txn != null)
                txn.rollback();
            e.printStackTrace();
        }

        finally {
            session.close();
        }
    }
}
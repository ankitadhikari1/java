package com.services;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.model.Employee;

public class ViewEmployee {

    Session session = null;

    public void view(Scanner sc, SessionFactory factory) {

        session = factory.openSession();

        System.out.println("select option to view employee");
        System.out.println("1 - view one employee");
        System.out.println("2 - view all employee");

        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.println("enter employee id");
            int id = sc.nextInt();

            Query<Employee> query = session.createQuery(
                    "FROM Employee WHERE id = :id", Employee.class);

            query.setParameter("id", id);

            Employee e = query.uniqueResult();

            if (e != null)
                System.out.println(e);
            else
                System.out.println("Employee not found");
        }

        else {

            Query<Employee> query = session.createQuery(
                    "FROM Employee", Employee.class);

            List<Employee> list = query.list();

            for (Employee e : list) {
                System.out.println(e);
            }
        }

        session.close();
    }
}
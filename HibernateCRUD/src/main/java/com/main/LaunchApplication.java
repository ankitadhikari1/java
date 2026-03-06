package com.main;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.services.AddEmployee;
import com.services.DeleteEmployee;
import com.services.UpdateEmployee;
import com.services.ViewEmployee;

public class LaunchApplication {

	public static void main(String[] args) {

		System.out.println("this is a application which do crud operation in hibernate..");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		while (true) {
			System.out.println("select a option...");
			System.out.println("1- add employee to database");
			System.out.println("2- view employee from database");
			System.out.println("3- update employee in database");
			System.out.println("4- delete employee in database");
			System.out.println("5- exit application");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			boolean flag = false;
			switch (choice) {
			case 1:
				new AddEmployee().add(sc, factory);
				break;
			case 2:
				new ViewEmployee().view(sc, factory);
				break;
			case 3:
				new UpdateEmployee().update(sc, factory);
				break;
			case 4:
				new DeleteEmployee().delete(sc, factory);
				break;
			case 5:
				flag = true;
				break;
			default:
				System.out.println("wrong choice ");

			}
			if (flag == true) {
				break;
			}
		}

	}

}

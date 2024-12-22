package com.example.CustomerServicedemo;
import java.util.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Customers.CustomerCare;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerServicedemoApplication {

	public static void main(String[] args) {

		/*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

			 Tasks:
		 *  1. Load the beans from ApplicationContext.xml
		 *  2. Display all the departments available and get the input from user.
		 *  3. Get the message from user and store it into the respective department.
		 *  
		 */
		Scanner scanner = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("Welcome to our Customer Care application");
		System.out.println("Please enter your name: ");
		String name = scanner.next();
		System.out.println("Thanks for reaching us "+name+"\n Please select a department to connect to:");
		while(true){
		System.out.println("Please select a department to connect to:\n1. Payment Department\n2. Query Department\n3. Sales Department \n0. Exit");
		int choice = scanner.nextInt();
		String customer ="";

		switch(choice){
			case 0:{
				System.out.println("Exiting...");
				return;
			}
			case 1 :{
				customer = "paymentDepartment";
				break;
				}
			case 2:{
				customer = "queryDepartment";
				break;

			}
			case 3:{
				customer = "salesDepartment";
				break;

			}
			default : {
				System.out.println("Invalid choice. Please try again.");
				continue;
			}


		}
		CustomerCare department = (CustomerCare) context.getBean(customer);
		department.setCustomerName(name);
		department.getService();
		
		String issue = scanner.next();
		department.setProblem(issue);
		department.getProblem();


	}



	}
}

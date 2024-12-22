package com.example.Cinemaxify;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

@SpringBootApplication
public class CinemaxifyApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Cinemaxify Application");
        
        while (true) {
            System.out.println("Please select the member you want the plan for:");
            System.out.println("1. Self\n2. Spouse\n3. Exit");
            String userType = "";
            int userChoice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character
            
            switch (userChoice) {
                case 1 -> userType = "self";
                case 2 -> userType = "spouse";
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice.");
                    continue; // Continue to the next iteration of the loop
                }
            }

            System.out.println("Please select your plan:\n1. Normal\n2. Premium");
            int planChoice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character
            String myPlan = "";
            switch (planChoice) {
                case 1 -> myPlan = "Normal";
                case 2 -> myPlan = "Premium";
                default -> {
                    System.out.println("Invalid choice");
                    continue; // Continue to the next iteration of the loop
                }
            }

            String finals = userType + myPlan;
            User user = (User) context.getBean(finals);

            System.out.println("Please enter your name:");
            String name = scanner.nextLine();
            System.out.println("Please enter your age:");
            int age = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character
            System.out.println("Please enter your contact:");
            long contact = scanner.nextLong();
            scanner.nextLine(); // Clear the newline character
            System.out.println("Please enter your address:");
            String address = scanner.nextLine();

            user.setUserDetails(name, age, contact, address);
            user.getUserDetails();

            System.out.println("Do you want to purchase a plan for someone else:\n1. Yes\n2. No");
            int input = scanner.nextInt();
            if (input == 2) break;
        }

        scanner.close(); // Close the scanner to prevent resource leak
        context.close(); // Close the application context
    }
}

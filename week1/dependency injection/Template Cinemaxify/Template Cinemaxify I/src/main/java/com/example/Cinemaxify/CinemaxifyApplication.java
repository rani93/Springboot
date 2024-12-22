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
        System.out.println("Please select the member you want the plan for:");
        System.out.println("1. Self\n2. Spouse\n3. Exit");

        String userType = "";
        int userChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        switch (userChoice) {
            case 1 -> {
                userType = "self";
            }
            case 2 -> {
                userType = "spouse";
            }
            case 3 -> {
                System.out.println("Exiting...");
                return;
            }
            default -> {
                System.out.println("Invalid choice.");
                return;
            }
        }

        // Pick the user bean using context.getBean().
        User user = (User) context.getBean(userType);

        // Take input for User details i.e. name, age, address etc.
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        System.out.println("Please enter your contact:");
        long contact = scanner.nextLong();
        scanner.nextLine(); // Consume the leftover newline character

        System.out.println("Please enter your address:");
        String address = scanner.nextLine();

        // Set the above fetched details into the user by using appropriate method.
        user.setUserDetails(name, age, contact, address);

        // Finally print the details by using appropriate method.
        user.getUserDetails();
    }
}

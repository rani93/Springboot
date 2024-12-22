package com.example.EventRegistration;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class EventRegistrationApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to the Graduation Ceremony Registration Application");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollegeEvent event = (CollegeEvent) context.getBean("event");

        event.printEventDetails();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to register for the ceremony\n1. Yes\n2. No");
            int input = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if (input == 1) {
                StudentAttendee studentAttendee = (StudentAttendee) context.getBean("student");
                System.out.println("Please enter your name");
                String name = scanner.nextLine();
                System.out.println("Please enter your department");
                String department = scanner.nextLine();
                System.out.println("In which year did you pass out?");
                int batch = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                studentAttendee.setAttendeeDetails(name, department, batch);
                event.registerStudent(studentAttendee);
                studentAttendee.printRegistrationConfirmation();
            } else if (input == 2) {
                break;
            } else {
                System.out.println("Invalid Choice");
                return;
            }
        }

        System.out.println("No. of attendees registered are: " + event.getAttendeeCount());
        System.out.println("The list of attendees are:");
        for (Attendee attendee : event.getAllAttendees()) {
            System.out.println(attendee);
        }
    }
}
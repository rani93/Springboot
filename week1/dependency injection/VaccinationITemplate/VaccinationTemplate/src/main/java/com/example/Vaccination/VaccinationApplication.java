package com.example.Vaccination;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class VaccinationApplication {

    public static void main(String[] args) {

        /*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

		 Tasks:
		1. Fetch context from ApplicationContext.xml and initiate Scanner.
		2. Fetch vaccine and User type choice.
		3. Get the required bean from context.
		4. Get the appointment details form user
		5. Display the appointment details
		6. Run the loop again to book for another user or else exit.
		 */

		 Scanner  s = new Scanner(System.in);
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		 System.out.println("Welcome to the Vaccination Application");
		 while(true){
			System.out.println("Please choose your vaccine preference:\n 1. Covid\n 2. Polio\n 3. Typhoid");
			int vacc = s.nextInt();
			s.nextLine();
			String vac = "";
			switch(vacc){
				case 1-> vac = "Covid";
				case 2-> vac = "Polio";
				case 3-> vac ="Typhoid";
				default ->{
					System.out.println("Please enter valid option");
					continue;
				}
			}
			System.out.println("Whom do you want to vaccinate \n 1. Father\n2. Mother \n 3. Self\n 4. Spouse\n 5. Exit ");
			int option = s.nextInt();
			s.nextLine();
			String person = s.nextLine();
			switch(option){
				case 1-> person = "Father";
				case 2-> person = "Mother";
				case 3-> person = "Self";
				case 4-> person = "Spouse";
				case 5-> {return;}
				default->{
					System.out.print("Enter valid option");
					continue;
				}

			}
			
			User user1 = (User) context.getBean(person+vac);
			if(!user1.IsVaccinated()){
			System.out.print("\nPlease enter "+person+" deatails:\nName:");
			String name = s.nextLine();
			System.out.print("Age:");
			int age = s.nextInt();
			s.nextLine();
			System.out.print("\nAppointment date (YYYY-MM-DD):");
			String date = s.nextLine();
			System.out.print("\nAppointment time (HH:MM AM/PM):");
			String time = s.nextLine();
			System.out.print("\nAppointment location:");
			String location = s.nextLine();
			TimeAndLocation timeAndLocation = new TimeAndLocation();
			// timeAndLocation.setDetails(time, location, date);
			timeAndLocation.setDate(date);
			timeAndLocation.setLocation(location);
			timeAndLocation.setTimeSlot(time);
			user1.setUserDetails(name, age, timeAndLocation);
			user1.setAppointment();

			}
			else{
				System.out.println("Userr is already Vaccinated");

			}
			System.out.println("Do you want to register for someone Else\n 1. Yes\n 2. No");
			option = s.nextInt();
			s.nextLine();
			if(option==2){
				return;
			}
	 }
 }
}
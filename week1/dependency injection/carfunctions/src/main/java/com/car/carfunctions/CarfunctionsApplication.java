package com.car.carfunctions;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;
@SpringBootApplication
public class CarfunctionsApplication {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		System.out.println("Hi , plese enter your name");
		String owner = S.next();
		System.out.println("please select your car of choice\n 1) family car\n 2) sports car\n3) Truck");
		int choice = S.nextInt();
		String Type ="";
		
		
		switch(choice){
			case 1-> Type = "familyCar";
			case 2-> Type = "sportCar";
			case 3-> Type = "Truck";
			default ->{ 
				System.out.println("please enter valid choice");
			}
		}	

	
		Car car = (Car) context.getBean(Type);
		car.setOwnerName(owner);
		car.getInfo();
		S.close();
		context.close();

	}


}

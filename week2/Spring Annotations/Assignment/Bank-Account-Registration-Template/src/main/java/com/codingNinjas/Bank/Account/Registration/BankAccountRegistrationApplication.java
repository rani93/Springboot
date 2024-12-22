package com.codingNinjas.Bank.Account.Registration;

// import java.util.Scanner;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BankAccountRegistrationApplication {

	public static void main(String[] args) {

		/*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.
		
		* 1. Fetch context from ApplicationContext.xml and initiate scanner.
		* 2. Get user details from console.
		* 3. Get account details from user and add them to the account list.
		* 4. Display the list of accounts with their reference ids.
		*/

		Scanner scanner = new Scanner(System.in);
		// ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ApplicationContext context = SpringApplication.run(BankAccountRegistrationApplication.class, args);
		//  SpringBootApplication.run(BankAccountRegistrationApplication.class, args)

		System.out.println("Please enter Your name?");
		String name = scanner.nextLine();
		User user = (User) context.getBean("myUser");
		user.setUserDetails(name);
		System.out.println("Do you want to add account\n1. Yes 2. No");
		int option  = scanner.nextInt();
		scanner.nextLine();
		if(option==1){
			while(true){

			System.out.println("Please select the account type\n1. Current \n2. Savings");
			int accountoption = scanner.nextInt();
			String accountType ="";
			scanner.nextLine();
			switch (accountoption) {
				case 1: accountType ="currentAccount";					
					break;
				case 2: accountType="savingsAccount";
				    break;
			
				default: System.out.println("Invalid option");

					
			}
			Account account = (Account) context.getBean(accountType);
			System.out.println("Enter the opening balance");
			double balance = scanner.nextInt();
			scanner.nextLine();
			account.addBalance(balance);
			user.addAccount(account);
			System.out.println("Do you want to add more accounts\n1. Yes \n2. No");
			int moreAccount = scanner.nextInt();
			scanner.nextLine();
			if(moreAccount==2){
				break;
			}

			System.out.println("Hi "+user.getName()+", here is the list of your accounts:");
			
			

		}
		List<Account> accountList = user.getAllAccounts();
			for(int i=0;i<accountList.size();i++){
				Account account1 = accountList.get(i);
				int userReferenceLength = account1.toString().length();
				System.out.println(account1.getAccountType()+" : opening balance - "+account1.getBalance() +" Reference Id: "+account1.toString().substring(userReferenceLength - 9, userReferenceLength));

			} 

	}
		scanner.close();
		


	} 

}

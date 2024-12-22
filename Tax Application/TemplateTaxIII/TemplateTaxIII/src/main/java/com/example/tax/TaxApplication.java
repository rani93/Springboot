package com.example.tax;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class TaxApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Tax Payment Application");
        
        while (true) {
            System.out.println("Please select which tax you want to pay: \n1. Income \n2. Property\n3. Exit");
            int userChoice = scanner.nextInt();
            String taxChoice = "";
            
            switch (userChoice) {
                case 1 -> taxChoice = "incomeTax";
                case 2 -> taxChoice = "propertyTax";
                case 3 -> {
                    System.out.println("Exiting...");
                    context.close(); // Close context before exiting
                    return;
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                    continue; // Continue to prompt again
                }
            }

            // Retrieve the relevant tax bean
            Tax tax = (Tax) context.getBean(taxChoice);
            boolean taxPaid = tax.isTaxPayed();
            
            if (taxPaid) {
                System.out.println("You have already paid " + tax.getTaxType() + " tax.");
                continue; // Prompt for tax type selection again
            } else {
                // Prompt user for taxable amount
//                System.out.print("Enter the taxable amount: ");
                System.out.println("Please enter your Income/Property value:");
                int taxableAmount = scanner.nextInt();
                tax.setTaxableAmount(taxableAmount);
                tax.calculateTaxAmount();
                
                // Display calculated tax amount
//                System.out.println("Calculated tax amount: " + tax.getTaxAmount());
                System.out.println("You have selected " + tax.getTaxType() + " tax and your tax amount is: " + tax.getTaxAmount());
                System.out.println("Do you want to pay the tax: \n1. Yes\n2. Exit");
                int ans = scanner.nextInt();
                
//                if (ans.equalsIgnoreCase("yes")) { // Use .equalsIgnoreCase() for case-insensitive comparison
//                    tax.payTax();
//                    System.out.println("Tax payment confirmed for " + tax.getTaxType() + " tax.");
//                } else {
//                    System.out.println("Tax payment not completed.");
//                }

                if(ans == 1){
                    tax.payTax();
                }
                else {
                    return;
                }
            }
        }
    }
}

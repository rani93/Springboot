package com.example.tax;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TaxApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tax type (IncomeTax/PropertyTax): ");
        String type = scanner.nextLine();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        if (type.equalsIgnoreCase("IncomeTax")) {
            Tax incomeTax = (Tax) context.getBean("incomeTax");
            System.out.print("Enter taxable amount: ");
            int taxable = scanner.nextInt();
            incomeTax.setTaxableAmount(taxable);
            incomeTax.calculateTaxAmount();
            System.out.println("Tax Amount: " + incomeTax.getTaxAmount());
        } else if (type.equalsIgnoreCase("PropertyTax")) {
            Tax propertyTax = (Tax) context.getBean("propertyTax");
            System.out.print("Enter property value: ");
            int taxable = scanner.nextInt();
            propertyTax.setTaxableAmount(taxable);
            propertyTax.calculateTaxAmount();
            System.out.println("Tax Amount: " + propertyTax.getTaxAmount());
        } else {
            System.out.println("Invalid tax type entered.");
        }

        scanner.close();
        context.close();
    }
}

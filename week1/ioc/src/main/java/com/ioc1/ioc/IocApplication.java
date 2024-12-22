package com.ioc1.ioc;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.*;

@SpringBootApplication
public class IocApplication {

	public static void main(String[] args) {
		// SpringApplication.run(IocApplication.class, args);
        System.out.println("welcome! please use a size table");
		Scanner scanner = new Scanner(System.in);
		String size = scanner.nextLine();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		Table longTable =(Table) context.getBean("longTable");
		Table shortTable =(Table) context.getBean("shortTable");

		// Table shorTable = new ShortTable();
		// Table longTable = new Longtable();
		if(size.equals("long")){
			System.out.print(longTable.showDetails());
		} else{
			System.out.println(shortTable.showDetails());
		}
		scanner.close();
		context.close();
	}

}

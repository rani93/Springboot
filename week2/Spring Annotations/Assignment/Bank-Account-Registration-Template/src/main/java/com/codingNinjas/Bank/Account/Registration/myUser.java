package com.codingNinjas.Bank.Account.Registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
  This class is an implementation of a User Interface based on the selection 
  done in the console for user information.You need to complete this class 
  based on the following tasks.

   a. Adding common attributes: 
       1. String name
       2. List<Account> accountList.
   b. Override the methods of User Interface.
   c. Build the logic for all the methods based on the description mentioned in the Account Interface.

**/
@Component("myUser")
public class myUser implements User{
  private String name;
  private List<Account> accountList = new ArrayList<>();
  // private Account account;
  

    @Override
  public void addAccount(Account account) {
    // this.account = account;
    accountList.add(account);

  }

  @PostConstruct
  public void init() {
    System.out.println("User bean has been instantiated and I'm the init() method");
  }

  @PreDestroy
  public void destroy(){
    System.out.println("User bean has been closed and I'm the destroy() method");
  }

  @Override
  public List<Account> getAllAccounts() {
    
    return this.accountList;
  }

  @Override
  public String getName() {
    
    return name;
  }

  @Override
  public void setUserDetails(String name) {
    this.name = name;
}

}

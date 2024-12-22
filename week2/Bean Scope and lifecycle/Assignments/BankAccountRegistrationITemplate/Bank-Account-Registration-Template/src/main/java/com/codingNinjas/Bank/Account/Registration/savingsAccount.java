package com.codingNinjas.Bank.Account.Registration;

/**
  This class is an implementation of a "Account" Interface based on the selection 
  done in the console for account type. You need to complete this class
  based on the following tasks.

     Tasks:
   a. Create attribute amount(double) 
   b. Override the methods of Account Interface.
   c. Build the logic for all the methods based on the description mentioned in the Account Interface.

**/

public class savingsAccount implements Account{
  private double balance;
  @Override
  public void addBalance(double balance) {
    this.balance+=balance;
    
  }

  @Override
  public String getAccountType() {
    return "savingAccount";
  }

  @Override
  public double getBalance() {
    return balance;
  }

}
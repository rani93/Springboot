package com.example.Customers;

/*
     This class is an implementation of a CustomerCare Interface based on the selection 
     in the console the department type is selected.You need to complete this class 
     based on the following tasks.

     Tasks:
       1. Override the methods of CustomerCare Interface:
       2. Build your logic for all the method based on the description given in CustomerCare Interface.
 */
public class PaymentDepartment implements CustomerCare {
	
    private String department= "Payment Department";
    private String customerName;
    private String issue; 
    private double refId;

    @Override
  public void setCustomerName(String name) {
      // TODO Auto-generated method stub
      this.customerName = name;
           
  }
  @Override
  public String getDepartment(){
    return this.department;

  }
  @Override
  public void getService(){
    System.out.println("Welcome " + customerName + ", you have reached the " + department + ". How may I assist you with your payment inquiry?");

  }
  @Override
  public void setProblem(String problem){
    issue = problem;


  }
  @Override
  public void getProblem(){
    System.out.println("Dear"+ customerName+ "your issue for payments. has been recorder, your reference is is:"+ refId);

  }


}

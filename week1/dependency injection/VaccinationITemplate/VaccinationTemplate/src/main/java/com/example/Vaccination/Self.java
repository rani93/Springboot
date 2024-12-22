package com.example.Vaccination;



/**
  This class is an implementation of a User Interface based on the selection 
  in the console the user type is selected.You need to complete this class 
  based on the following tasks.
    
   Tasks:
 a.Override the methods of User Interface.
 b.Adding common attributes:
    1. String name
    2. Integer age
    3. boolean isVaccinated
    4. TimeAndLocation(class), vaccine(interface), both are injected by the constructor method.
    5. The arguments of the constructor for all users should be like "public User(TimeAndLocation timeAndLocation, Vaccine vaccine)"
 c.Build the logic for all the methods based on the description mentioned in the User Interface.
 
**/
public class Self implements User {
  String name;
   int age;
  TimeAndLocation timeAndLocation;
  boolean isVaccinated=false;
  Vaccine vacc;
  // public Self(TimeAndLocation timeAndLocation, Vaccine vacc) {
  //     this.timeAndLocation = timeAndLocation;
  //     this.vacc = vacc;
  

  // }
  public void setTimeAndLocation(TimeAndLocation timeAndLocation){
    this.timeAndLocation = timeAndLocation;
  }
  public void setVaccine (Vaccine vacc){
    this.vacc =  vacc;

  }
  @Override
  public  Vaccine getVaccineDetails(){
    return vacc;

  }
  @Override 
  public void setUserDetails(String name, int age, TimeAndLocation timeAndLocation){
    this.name=name;
    this.age=age;
  this.timeAndLocation = timeAndLocation;

  }
  @Override
  public  void setAppointment(){
    System.out.println("Hello " + name+" your appointment has been fixed for" + vacc.getType()+" on "+ timeAndLocation.getDetails());
    isVaccinated =true;


  }
  @Override
  public  boolean IsVaccinated(){
    return isVaccinated;

  }


}

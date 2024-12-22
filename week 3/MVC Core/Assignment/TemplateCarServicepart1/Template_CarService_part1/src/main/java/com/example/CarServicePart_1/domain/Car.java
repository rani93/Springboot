package com.example.CarServicePart_1.domain;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

/**

 1. Domain Model is already created for you, just generate getter and setter.
 2. Also,Implement the interface Vehicle and Override the method saveVehicleDetails() and createVehicle() in car.
**/
    String RegisterationNumber;
    String CarName;
    String CarDetails;
    String CarWork;
    Integer CarId;
    public String getRegisterationNumber() {
        return this.RegisterationNumber;
    }
    public void setRegisterationNumber(String registerationNumber) {
        this.RegisterationNumber = registerationNumber;
    }
    public String getCarName() {
        return CarName;
    }
    public void setCarName(String carName) {
        this.CarName = carName;
    }
    public String getCarDetails() {
        return CarDetails;
    }
    public void setCarDetails(String carDetails) {
        this.CarDetails = carDetails;
    }
    public String getCarWork() {
        return CarWork;
    }
    public void setCarWork(String carWork) {
        this.CarWork = carWork;
    }
    public Integer getCarId() {
        return CarId;
    }
    public void setCarId(Integer carId) {
        this.CarId = carId;
    }
    @Override
    public void createVehicle(String registrationNumber, String CarName, String CarDetails, String WorkDone) {
        this.CarWork = WorkDone;
        this.RegisterationNumber = registrationNumber;
        this.CarName = CarName;
        this.CarDetails = CarDetails;
        
    }
    @Override
    public Boolean saveVehicleDetails() {
        System.out.println("Saving vehicle details:");
	    System.out.println("Registration Number: " + this.RegisterationNumber);
	    System.out.println("Car Name: " + this.CarName);
	    System.out.println("Car Details: " + this.CarDetails);
	    System.out.println("Work Done: " + this.CarWork);
        
        return true;
    }

}

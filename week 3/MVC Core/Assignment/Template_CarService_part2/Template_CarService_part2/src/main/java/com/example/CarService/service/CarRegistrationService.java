package com.example.CarService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CarService.domain.Vehicle;

/**

 1. Implement the interface Registration and Override the method registerCar() and getNewCar() in CarRegistrationService.
 2. Also,autowire car of type Vehicle and use it in method registerCar() and getNewCar().

**/

@Service
public class CarRegistrationService implements Registration{

	@Autowired
	Vehicle Car;
	String vehicleNo;
	String vehicleName;
	String CarDetails;
	 String CarWork;
	
	@Override
	public Boolean registerCar(String vehicleNo, String vehicleName, String CarDetails, String CarWork) {
		Car.createVehicle(vehicleNo,vehicleName,CarDetails,CarWork);
        return Car.saveVehicleDetails();
	}

	@Override
	public Vehicle getNewCar() {
		return Car;
	}

}

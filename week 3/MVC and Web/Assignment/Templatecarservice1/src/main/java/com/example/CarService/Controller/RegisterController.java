package com.example.CarService.Controller;

import com.example.CarService.domain.Car;
import com.example.CarService.domain.Vehicle;
import com.example.CarService.service.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    @Autowired
    Registration registration;

    @RequestMapping("/register")
    public String getRegistrationPage(Model carModel){
        Vehicle vehicle=registration.getNewCar();
        carModel.addAttribute("Vehicle",vehicle);
        return "carregister";
    }

    
    /** 
      1. You need to modify the logic for getResponsePage method, as registerCar return type is changed.
      2. If registerCar method returns -1 then getResponsePage method should return string "carregister" for 
        car register page. 
     **/
    @RequestMapping("/done")
    public String getResponsePage(@ModelAttribute("vehicle") Car car){
        if((registration.registerCar(car.getRegisterationNumber(),car.getCarName(),car.getCarDetails(), car.getCarWork()))==-1){
            return "success";
        }else{
            return "carregister";
        }
    }


    /** 
     1. The method getSuccessPage returns string "success" for success page.
     2. Also, the method accepts id of type string.(Use @RequestParam Annotation)
    **/
    @RequestMapping(value="/success")
    public String getSuccessPage() {
        return null;
    }
}

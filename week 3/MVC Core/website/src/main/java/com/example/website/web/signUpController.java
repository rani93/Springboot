package com.example.website.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.website.domain.StudentUser;
import com.example.website.domain.User;
import com.example.website.service.UserService;
@Controller
public class signUpController {
    @Autowired
    UserService userService;
    @RequestMapping("/signUp")
    public String getSignUp(Model uiModel){
        User user = userService.getUser();
        uiModel.addAttribute("user", user);
        return"signUp";
    }   
    @RequestMapping("/registerUser")
    public String createUser(@ModelAttribute( value ="user") StudentUser studentUser) {
        if(userService.signUp(studentUser.getName(),studentUser.getGender(), studentUser.getLocation(), studentUser.getCollege())){
            return "welcome";
        }
        return "signUp";
       
    }
    

}



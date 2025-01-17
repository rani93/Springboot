package com.example.TastyTrove;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("chinese")
public class Chinese implements Recipe {
    private String name = "Chinese";
    private String userName;
    private Ingredients ingredients;

    @Autowired
    @Qualifier("lentils")
    Ingredients lentils;
     
    @Autowired
    @Qualifier("rice")
    Ingredients rice;
    
    @Autowired
    @Qualifier("wheat")
    Ingredients wheat;

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public void setUserName(String name) {
        this.userName = name;
    }

    @Override
    public void getDetails() {
        this.ingredients.setIngredient(name);
//        this.ingredients.setIngredient(name);
        String dishName = this.ingredients.getDishDetail();
        List<String> ingredients = this.ingredients.getIngredientsDetail();
        System.out.println("Hello user " + this.userName + " we suggest you to make " + dishName + " you can use the following ingredients:");
        for(int i = 0; i < ingredients.size(); i++){
            System.out.println(i + 1 + ". " + ingredients.get(i));
        }
    }

    @Override
    public void setIngredients(String ingredients) {
       
        if(ingredients.equals("Lentils") ){
            this.ingredients = this.lentils;
        }
        if(ingredients.equals("Rice")){
            this.ingredients = this.rice;
        }
        else{
            this.ingredients = this.wheat;
        }
    }
}
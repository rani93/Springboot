package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
@Component("rice")
public class Rice implements Ingredients {
    private boolean isChinese;
    private boolean isNorthIndian;
    private boolean isSouthIndian;

    private List<String> chineseRiceRecipes = new ArrayList<String>();
    private List<String> northIndianRiceRecipes = new ArrayList<String>();
    private List<String> southIndianRiceRecipes = new ArrayList<String>();

    public Rice() {
        Collections.addAll(chineseRiceRecipes, "Steamed Rice", "Ginger", "Garlic", "Soy Sauce", "Vinegar");
        Collections.addAll(northIndianRiceRecipes, "Cooking Oil", "Rice", "Onions", "Tomatoes", "salt");
        Collections.addAll(southIndianRiceRecipes, "Rice", "Salt", "Black Gram");
    }

    @Override
    public void setIngredient(String ingredient) {
        if(ingredient.equals("Chinese")) this.isChinese = true;
        if(ingredient.equals("NorthIndian")) this.isNorthIndian = true;
        if(ingredient.equals("SouthIndian")) this.isSouthIndian = true;
    }

    @Override
    public String getDishDetail() {
        if(isNorthIndian) return "Biryani";
         if(isSouthIndian) return "Idli";
       if(isChinese) return "Chinese Fried Rice";
       return null;
    }

    @Override
    public List<String> getIngredientsDetail(){
        if(isNorthIndian) return northIndianRiceRecipes;
        else if(isSouthIndian) return southIndianRiceRecipes;
        else return chineseRiceRecipes;
    }
}

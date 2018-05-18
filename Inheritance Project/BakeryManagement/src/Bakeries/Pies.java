package Bakeries;

import Bakeries.BakingGoods;

//CLASS OF PIES THAT EXTENDS FROM BAKING GOODS 
//IT ADDS THE GENERAL INGREDIENTS 
public abstract class  Pies extends BakingGoods {
    public Pies(String type , String ingredient) {
        super(type + "Pie", 360, 20, 4.50); // THE TYPE, TEMPERATURE, QUANTITY, AND THE PRICE 
        
        //GENERAL INGREDIENTS FOR PIES 
        super.addIngredients(" ");
        super.addIngredients("2&2/3 cups of Sugar");
        super.addIngredients("6 tablespoons of Butter");
        super.addIngredients("1 tablespoon of Flour");
        super.addIngredients("3/4 teaspoon of Salt");
        super.addIngredients("1 large Egg");
 
        
        //SPECIAL INGREDIENT FOR KIND OF PIE 
        super.addIngredients(ingredient); //ALSO ADDS THE INGREDIENT SPECIFIED FOR EACH KIND OF PIE 
    }

    public Pies (BakingGoods bakingGoods) {
        super(bakingGoods);
    }
   
}



package Bakeries;

import Bakeries.BakingGoods;

//CLASS OF CAKES THAT EXTENDS FROM BAKING GOODS 
//IT ADDS THE GENERAL INGREDIENTS AND SPECIAL INGREDIENT
public abstract class  Cakes extends BakingGoods {
    public Cakes(String type , String ingredient) {
        super(type + "Cake(s)", 360, 20, 10); // THE TYPE, TEMPERATURE, QUANTITY, AND THE PRICE 
        
        //GENERAL INGREDIENTS 
        super.addIngredients(" ");
        super.addIngredients("6 eggs"); 
        super.addIngredients("3 cups of Flour");
        super.addIngredients("3/4 cup of Butter");
        super.addIngredients("2&2/3 cups of Sugar");
        super.addIngredients("2 Teaspoons of Vanilla");
        super.addIngredients("3/4 teaspoon of Salt");
        super.addIngredients("Icing"); 
       
        //SPECIAL INGREDIENT DEPENDING ON THE CAKE 
        super.addIngredients(ingredient);
    }

    public Cakes(BakingGoods bakingGoods) {
        super(bakingGoods);
    }
   
}
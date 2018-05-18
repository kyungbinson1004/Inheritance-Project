/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bakeries;

//CLASS FOR DOUGHNUTS THAT EXTENDS FROM BAKING GOODS 
//IT ADDS THE GENERAL INGREDIENTS AND SPECIAL INGREDIENT 

class Doughnuts extends BakingGoods {
    public Doughnuts(String type, String ingredient) {
        super(type + " Doughnut", 360, 20, 1);
        
        //GENERAL INGREDIENT FOR DOUGHNUTS
        super.addIngredients(" ");
        super.addIngredients("1&1/2 cups of Water");
        super.addIngredients("1&1/2 ounces of Sugar");
        super.addIngredients("1/2 ounce of Salt");
        super.addIngredients("3&1/2 cups of Bread Flour");
        super.addIngredients("2 quarts of water");
        super.addIngredients("1 egg white");
        
        //SPECIAL INGREDIENT FOR THE KIND OF DOUGHNUT
        super.addIngredients(ingredient);
    }

    public Doughnuts(Doughnuts doughnuts) {
        super(doughnuts);
    }
    
}

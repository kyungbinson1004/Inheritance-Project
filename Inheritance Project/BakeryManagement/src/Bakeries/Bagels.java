package Bakeries;

//CLASS FOR BAGELS THAT EXTENDS FROM BAKING GOODS 
//IT ADDS THE GENERAL INGREDIENTS AND THE SPECIAL INGREDIENT

public abstract class  Bagels extends BakingGoods {
    public Bagels(String type, String ingredient) {
        super(type + " Bagel", 360, 20, 1.25); // THE TYPE, TEMPERATURE, QUANTITY, AND THE PRICE 
        super.addIngredients(" ");
        
        //GENERAL INGREDIENTS FOR BAGELS 
        super.addIngredients("3&1/2 cups of Flour"); //ADDS FLOUR TO LIST
        super.addIngredients("1 Egg"); //ADDS OIL TO LIST 
        super.addIngredients("1/2 ounce of Salt");//ADDS SPRINKLE TO LIST 
        super.addIngredients("2 Quarts of Water");

        //SPECIAL INGREDIENT FOR TYPE OF BAGEL 
        super.addIngredients(ingredient);//ALSO ADDS THE INGREDIENT SPECIFIED FOR EACH KIND OF BAGEL 
    }

    public Bagels(Bagels bagel) {
        super(bagel);
    }
}

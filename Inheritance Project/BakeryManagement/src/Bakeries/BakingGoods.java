/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bakeries;

import java.util.ArrayList;

//MAIN CLASS CALLED BAKING GOODS 
public abstract class BakingGoods  {
    private String type; //TYPE OF PASTERY
    private int quantity; //QUANTITY 
    private final double price; //PRICE 
    private final Boolean baked = true; //IF IT IS BAKED OR NOT 
    private final int temperature; //TEMPERATURE 
    private final ArrayList<String> ingredientsList; //ARRAY LIST OF THE INGREDIENTS 

    //CONSTRUCTOR FOR BAKING GOODS 
    public BakingGoods (String type, int temp, int q , double p) {
        this.temperature = temp;
        this.quantity = q;
        this.price = p;
        this.type = type;
        this.ingredientsList = new ArrayList<>();
    }

    public BakingGoods(BakingGoods bakingGoods) {
        this(bakingGoods.type,  bakingGoods.getTemperature(), bakingGoods.getQuantity(), bakingGoods.getPrice());
    }
    
    //PRICE 
    public double getPrice() {
        return price;
    }
    
    //TEMP 
    public int getTemperature (){
        return temperature;
    }
    
    //QUANTITY
     public int getQuantity (){
         return quantity;
     }
     
     //ADDS INGREDIENTS IF IT DOES NOT CONTAIN IT TO BEGIN WITH 
     public void addIngredients(String ingredient) {
         if (!this.ingredientsList.contains(ingredient)) {
            this.ingredientsList.add(ingredient);
         }
     }
     
     public ArrayList<String> getIngredients() {
         return this.ingredientsList;
     }
     
     //DESCRIBING THE INGREDIENTS 
     public String describe() {
         
         //PRICE AND TYPE 
         String a = "The price of a(n) " + type + " is $"+ price + ". " + "Ingredients: ";
         
         
         //DESCRIBING THE INGREDIENTS 
         for (int i = 1; i < ingredientsList.size(); i++) {
             String c [] ;
              a += "\n" + i  + ") " + ingredientsList.get(i)  + " \n";
         }

         //RETURNS THE WHOLE STRING TO BE PRINTED IT OUT ON THE SCREEN FOR THE INGREDIENTS 
         return a;
     
       
         
         
        }
     }


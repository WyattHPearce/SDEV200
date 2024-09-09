// Wyatt H. Pearce
// Chapter04 M02 Exercise01-a p.156 - Sandwich.java

public class Sandwich {
    // Fields
    private String mainIngredient;
    private String breadType;
    private double price;

    // Constructor
    public Sandwich(String mainIngredient, String breadType, double price){
        this.mainIngredient = mainIngredient;
        this.breadType = breadType;
        this.price = price;
    }

    // Display
    public void display(){
        System.out.println("This sandwich is a " + mainIngredient + " sandwich.");
        System.out.println("It also has wonderful " + breadType + " bread.");
        System.out.printf("All this could be yours for the low price of $%.2f\n", price);
    }

    // Getters
    public String getMainIngredient(){
        return mainIngredient;
    }
    public String getBreadType(){
        return breadType;
    }
    public double getPrice(){
        return price;
    }
    
    // Setters
    public void setMainIngredient(String mainIngredient){
        this.mainIngredient = mainIngredient;
    }
    public void setBreadType(String breadType){
        this.breadType = breadType;
    }
    public void setPrice(double price){
        this.price = price;
    }
}

/* 
    Author: Wyatt H. Pearce
    Last edit: 10-12-2024
    IvyTech Class: SDEV200 
    Description:
    This class describes a Location object, intended to be utilized in instances of the Inventory class
*/

public class Item extends Entity{
    // Fields
    private int quantity;

    // Constructor
    public Item(String name, int quantity) {
        super(name);
        this.quantity = quantity;
    }

    // Mutator methods
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Overriding the object.toString() method
    @Override
    public String toString() {
        return(getName() + ", " + quantity);
    }
}
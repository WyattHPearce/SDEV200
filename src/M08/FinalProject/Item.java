/* 
    Author: Wyatt H. Pearce
    Last edit: 10-12-2024
    IvyTech Class: SDEV200 
    Description:
    This class describes a Location object, intended to be utilized in instances of the Inventory class
*/

public class Item {
    // Fields
    private String name;
    private int quantity;

    // Constructor
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Mutator methods
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }  

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Overriding the object.toString() method
    @Override
    public String toString() {
        return "Name: " + name + ", Quantity: " + quantity;
    }
}
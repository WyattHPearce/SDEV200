/* 
    Author: Wyatt H. Pearce
    Last edit: 10-12-2024
    IvyTech Class: SDEV200
    Description:
    This class describes a Location object, intended to be utilized in instances of the Inventory class
*/

import java.util.ArrayList;

public class Location {
    // Fields
    private String name;
    private ArrayList<Item> items;
    private int quantity; // Total quantity of items at this location

    // Constructor
    public Location(String name) {
        this.name = name;
        this.items = new ArrayList<>(); // Items at this location
    }

    // Mutator methods
    public String getName() {
        return name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getQuantity() {
        int totalQuantity = 0;
        for (Item item : items){
            totalQuantity += item.getQuantity();
        }
        return totalQuantity;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    // Method to search for items by name
    public String searchItems(String itemName) {
        StringBuilder result = new StringBuilder();
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                result
                    .append("   ")
                    .append(item.getName())
                    .append(", ")
                    .append(item.getQuantity())
                    .append(", ")
                    .append(name) // This is the location name
                    .append("\n"); // New line for the next item
            }
        }
        return result.toString().trim(); // Remove the last newline character
    }

    // Overriding the object.toString() method
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Item item : items) {
            result
                .append("   ")
                .append(item.getName())
                .append(", ")
                .append(item.getQuantity())
                .append(", ")
                .append(name) // This is the location name
                .append("\n"); // New line for the next item
        }
        return result.toString().trim(); // Remove the last newline character
    }
}
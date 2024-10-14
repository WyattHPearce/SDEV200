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

    public Item getItem(String itemName){
        for(Item item : items){
            if(item.getName().equalsIgnoreCase(itemName)){
                return item;
            }
        }
        return null;
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

    public void removeItem(String itemName, int quantity) {
        // Loop through items and find the one with the given name
        for (int i = 0; i < items.size(); i++) {
            // Check if the current item's name matches the input name
            if (items.get(i).getName().equalsIgnoreCase(itemName)) {
                Item currentItem = items.get(i);
                
                // If the item's quantity is less than or equal to the quantity to be removed, remove the item
                if (currentItem.getQuantity() <= quantity) {
                    items.remove(i);
                    System.out.println(itemName + " removed from " + name + " location.");
                    i--; // Adjust the index because the list size has decreased
                } else { 
                    // Otherwise, subtract the quantity and update the item
                    currentItem.setQuantity(currentItem.getQuantity() - quantity);
                    System.out.println(quantity + " units of " + itemName + " removed. Remaining: " + currentItem.getQuantity());
                }
                return; // Exit once the item is found and processed
            }
        }
        
        // If the item was not found in the list
        System.out.println(itemName + " not found in " + name + " location.");
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
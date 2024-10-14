/* 
    Author: Wyatt H. Pearce
    Last edit: 10-12-2024
    IvyTech Class: SDEV200
    Description:
    This class describes a Location object, intended to be utilized in instances of the Inventory class
*/

import java.util.ArrayList;

public class Location extends Entity{
    // Fields
    private ArrayList<Item> items;

    // Constructor
    public Location(String name) {
        super(name);
        this.items = new ArrayList<>(); // Items at this location
    }

    // Returns arrayList of all items
    public ArrayList<Item> getItems() {
        return items;
    }

    // Returns a specific item by name, if it exists
    public Item getItem(String itemName){
        for(Item item : items){
            if(item.getName().equalsIgnoreCase(itemName)){
                return item;
            }
        }
        return null;
    }

    // Adds item to list
    public void addItem(Item item) {
        Item preExistingItem = getItem(item.getName());
        if(preExistingItem != null){ // If item already exists
            // Add quantity to pre-existing item
            preExistingItem.setQuantity(preExistingItem.getQuantity() + item.getQuantity());
        } else {
            // Add new item
            items.add(item);
        }
    }

    // Removes a set number of items by name from list
    public void removeItem(String itemName, int quantity) {
        // Loop through items and find the one with the given name
        for (int i = 0; i < items.size(); i++) {
            // Check if the current item's name matches the input name
            if (items.get(i).getName().equalsIgnoreCase(itemName)) {
                Item currentItem = items.get(i);
                
                // If the item's quantity is less than or equal to the quantity to be removed, remove the item
                if (currentItem.getQuantity() <= quantity) {
                    items.remove(i);
                    System.out.println(itemName + " removed from " + getName() + " location.");
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
        System.out.println(itemName + " not found in " + getName() + " location.");
    }

    // Method to search for items by name
    public String searchItems(String itemName) {
        StringBuilder result = new StringBuilder();
        Item item = getItem(itemName);
        if(item != null){
            result
                .append("   " + item.toString())
                .append(", ")
                .append(getName()) // This is the location name
                .append("\n"); // New line for the next item
        }

        return result.toString().trim(); // Remove the last newline character
    }

    // Overriding the object.toString() method
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(getName() + " Items: \n");
        for (Item item : getItems()) {
            result.append("      " + item.toString() + "\n");
        }
        return result.toString().trim(); // Remove the last newline character
    }
}
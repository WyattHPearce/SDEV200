/* 
    Author: Wyatt H. Pearce
    Last edit: 10-12-2024
    IvyTech Class: SDEV200
    Description:
    This class will hold two ArrayLists: one for items and one for locations.
    It will have methods to add items and locations and generate reports.
    Instances of this class are intended to be utilized by the InventoryManagerGUI class.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Inventory {
    // Fields
    private ArrayList<Location> locations;

    // Constructor
    public Inventory() {
        this.locations = new ArrayList<>();
    }

    // Adds a location to array list of locations
    public void addLocation(Location location) {
        locations.add(location);
    }

    public void removeLocation(String locationName){
        // Loop through all locations
        for(int i = 0; i < getLocations().size(); i++){
            // If the name matches, remove it
            if(getLocations().get(i).getName().equalsIgnoreCase(locationName)){
                getLocations().remove(i);
                return;
            }
        }
    }

    // Adds item to a specific locations items
    public void addItem(Item item, String locationName) {
        // Loop through locations
        if (!locations.isEmpty()) { // Make sure it's not empty
            boolean locationFound = false; // Flag to track if location was found
    
            for (Location location : locations) {
                if (location.getName().equalsIgnoreCase(locationName)) {

                    // Add the item
                    location.addItem(item);

                    // Confirm the item was added
                    JOptionPane.showMessageDialog(
                        null, 
                        item.getQuantity() + " * '" + item.getName() + "' added to location '" + locationName + "'.", 
                        "Success", 
                        JOptionPane.INFORMATION_MESSAGE
                    );

                    locationFound = true; // Set flag to true if location is found
                    break; // Exit the loop as we've found the location
                }
            }
    
            if (!locationFound) {
                // Show an error message if the location name does not exist
                JOptionPane.showMessageDialog(null, "Error: Location '" + locationName + "' does not exist.", "Location Not Found", JOptionPane.ERROR_MESSAGE);
            }
    
        } else {
            // Show a message if there are no locations, prompting the user to add one
            JOptionPane.showMessageDialog(null, "No locations exist. Please add a location before adding items.", "No Locations", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Removes items from a specific locations items
    public void removeItem(String locationName, String itemName, int quantity){
        // Flags
        boolean foundItem = false;
        boolean locationFound = false;

        // Loop through locations
        if (!locations.isEmpty()) { // Make sure it's not empty
            for (Location location : locations) {
                if (location.getName().equalsIgnoreCase(locationName)) {
                    locationFound = true;

                    // Loop through locations items
                    if(!location.getItems().isEmpty()) { // Make sure its not empty
                        for(Item item : location.getItems()){
                            if(item.getName().equalsIgnoreCase(itemName)){

                                // Remove the item
                                location.removeItem(itemName, quantity); // Remove item

                                // Confirm the item was removed
                                JOptionPane.showMessageDialog(
                                    null, 
                                    quantity + " * '" + item.getName() + "' removed from location '" + locationName + "'.", 
                                    "Success", 
                                    JOptionPane.INFORMATION_MESSAGE
                                );
                                
                                // We found an item, break out of loop
                                foundItem = true;
                                break;
                            }
                        }

                        if(!foundItem){
                            // Show an error message if no items are found
                            JOptionPane.showMessageDialog(null, "Error: No items called + '" + itemName + "' found at location '" + locationName + "'", "Items Not Found", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    } else {
                        // Show an error message if no items exist at this location
                        JOptionPane.showMessageDialog(null, "Error: No items exist at location '" + locationName + "'", "Items Not Found", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    locationFound = true; // Set flag to true if location is found
                    break;
                }
            }

            if(!locationFound){
                // Show an error message if the location name does not exist
                JOptionPane.showMessageDialog(null, "Error: Location '" + locationName + "' does not exist.", "Location Not Found", JOptionPane.ERROR_MESSAGE);
                return;
            }
    
        } else {
            // Show a message if there are no locations, prompting the user to add one
            JOptionPane.showMessageDialog(null, "No locations exist. Please add a location before removing items.", "No Locations", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }

    // Moves an item from one location to another
    public void moveItem(String itemName, String locationName, String newLocationName){
        // Find the location containing the item
        Location originalLocation = getLocation(locationName);
        if(originalLocation != null){ // Make sure it exists
            Location newLocation = getLocation(newLocationName);
            if(newLocationName != null){ // Make sure it exists
                Item newItem = originalLocation.getItem(itemName); // Get the item from the original location
                if(newItem != null){ // Make sure item exists
                    // Add item to new location
                    newLocation.addItem(newItem);

                    // Remove item from original location
                    originalLocation.removeItem(newItem.getName(), newItem.getQuantity());
                }
            }
        }
    }

    // Returns array of locations
    public ArrayList<Location> getLocations() {
        return locations;
    }

    // Returns a specific location by name
    public Location getLocation(String locationName){
        for(Location location : getLocations()){
            if(location.getName().equalsIgnoreCase(locationName)){
                return location;
            }
        }
        Utility.sendErrorMessage("Location '" + locationName + "' does not exist");
        return null;
    }

    // Generates a report on this inventory object
    public String generateReport() {
        StringBuilder report = new StringBuilder("Inventory Report:\n");
        for (Location location : locations) {
            report
                .append("   " + location.getName() + " Items:\n")
                .append("   NAME, QTY, LOCATION\n")
                .append("   " + location.toString())
                .append("\n\n");
        }
        return report.toString();
    }

    // Search for items by name and reports their locations
    public String searchItem(String itemName) {
        StringBuilder report = new StringBuilder("Search Results for '" + itemName + "':\n");
        boolean itemFound = false;

        for (Location location : locations) {
            for (Item item : location.getItems()) {
                if (item.getName().equalsIgnoreCase(itemName)) {
                    report.append("   " + item.getName() + ", " + item.getQuantity() + ", " + location.getName() + "\n");
                    itemFound = true;
                }
            }
        }

        if (!itemFound) {
            report.append("   No items found with the name '" + itemName + "'.\n");
        }

        return report.toString();
    }

    // Search for location by name and reports all items in that location
    public String searchLocation(String locationName) {
        StringBuilder report = new StringBuilder("Search Results for '" + locationName + "':\n");
        boolean locationFound = false;

        // Loop through all location and find a match
        for (Location location : locations) {
            if (location.getName().equalsIgnoreCase(locationName)) {
                // Display that locations items
                report
                    .append("   ")
                    .append(locationName + " Items:\n")
                    .append("   NAME, QTY, LOCATION\n")
                    .append("   " + location.toString() + "\n");
                locationFound = true;
            }
        }

        if (!locationFound) {
            report.append("   No locations found with the name '" + locationName + "'.\n");
        }

        return report.toString();
    }

    // Export inventory data to a text file
    public void exportData(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Location location : locations) {
                writer.write("Location: " + location.getName() + "\n");
                for (Item item : location.getItems()) {
                    writer.write("   Item: " + item.getName() + ", Quantity: " + item.getQuantity() + "\n");
                }
                writer.write("\n");
            }
            JOptionPane.showMessageDialog(null, "Data exported successfully to " + filename, "Export Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error exporting data: " + e.getMessage(), "Export Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Import inventory data from a text file
    public void importData(String filename) {
        locations.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            Location currentLocation = null;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Location: ")) {
                    String locationName = line.substring(10).trim();
                    currentLocation = new Location(locationName);
                    addLocation(currentLocation); // Add new location to the inventory
                } else if (line.startsWith("   Item: ")) {
                    String[] parts = line.substring(9).trim().split(", Quantity: ");
                    if (parts.length == 2) {
                        String itemName = parts[0].trim();
                        int quantity = Integer.parseInt(parts[1].trim());
                        if (currentLocation != null) {
                            currentLocation.addItem(new Item(itemName, quantity)); // Add item to the current location
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Data imported successfully from " + filename, "Import Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error importing data: " + e.getMessage(), "Import Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error in data format: " + e.getMessage(), "Format Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
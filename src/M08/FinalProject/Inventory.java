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

    // Getters and "Setters" ("setters" are really just the "add" functions)
    public void addLocation(Location location) {
        locations.add(location);
    }
    
    public void addItem(Item item, String locationName) {
        // Loop through locations
        if (!locations.isEmpty()) { // Make sure it's not empty
            boolean locationFound = false; // Flag to track if location was found
    
            for (Location location : locations) {
                if (location.getName().toLowerCase().equals(locationName.toLowerCase())) { // Use .equals() for string comparison

                    // Add the item
                    location.addItem(item); // Add item to the found location

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

    public ArrayList<Location> getLocations() {
        return locations;
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
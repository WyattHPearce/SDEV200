/* 
    Author: Wyatt H. Pearce
    Last edit: 10-12-2024
    IvyTech class: SDEV200
    Description:
    This file is the entry point for the Final Project Inventory manager GUI program.
    This class primarily handles GUI elements.
*/

// java.lang imports
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class InventoryManager implements Constants{
    // Declare global variables
    private static Inventory inventory;
    private static JTextField itemField;
    private static JTextField locationField;
    private static JTextArea displayArea;

    // Declare buttons as class-level variables
    private static JButton addItemButton;
    private static JButton removeItemButton;
    private static JButton addLocationButton;
    private static JButton removeLocationButton;
    private static JButton editItemButton;
    private static JButton editLocationButton;
    private static JButton generateReportButton;
    private static JButton importButton;
    private static JButton exportButton;
    private static JButton searchButton;

    public static void main(String[] args) {
        // Default inventory
        inventory = new Inventory();

        // Creating a GUI window to add components to
        JFrame frame = new JFrame();
        frameSetup(frame);

        // Use a vertical BoxLayout to stack the panel (buttons) and text area
        frame.setLayout(new BorderLayout());

        // Create input fields and buttons
        itemField = new JTextField(15);      // Item name input
        locationField = new JTextField(15);  // Location input
        displayArea = new JTextArea(10, 40); // Area to display reports
        displayArea.setEditable(false);      // Make it non-editable
        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Create buttons
        addItemButton = new JButton("Add Item");
        removeItemButton = new JButton("Remove Item");
        addLocationButton = new JButton("Add Location");
        removeLocationButton = new JButton("Remove Location");
        editItemButton = new JButton("Edit Item");
        editLocationButton = new JButton("Edit Location");
        generateReportButton = new JButton("View Inventory");
        importButton = new JButton("Import");
        exportButton = new JButton("Export");
        searchButton = new JButton("Search");

        // Create a single ActionListener for all buttons
        ActionListener buttonListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == addItemButton) { 
                    addItem();
                } else if (e.getSource() == removeItemButton) { 
                    removeItem();
                } else if (e.getSource() == addLocationButton) { 
                    addLocation();
                } else if (e.getSource() == removeLocationButton) { 
                    removeLocation();
                } else if (e.getSource() == editItemButton) { 
                    editItem();
                } else if (e.getSource() == editLocationButton) { 
                    editLocation();
                } else if (e.getSource() == generateReportButton) { 
                    generateReport();
                } else if (e.getSource() == importButton) { 
                    importData();
                } else if (e.getSource() == exportButton) { 
                    exportData();
                } else if (e.getSource() == searchButton) { 
                    searchItem();
                }
            }
        };

        // Attach listeners to buttons
        addItemButton.addActionListener(buttonListener);
        removeItemButton.addActionListener(buttonListener);
        addLocationButton.addActionListener(buttonListener);
        removeLocationButton.addActionListener(buttonListener);
        editItemButton.addActionListener(buttonListener);
        editLocationButton.addActionListener(buttonListener);
        generateReportButton.addActionListener(buttonListener);
        importButton.addActionListener(buttonListener);
        exportButton.addActionListener(buttonListener);
        searchButton.addActionListener(buttonListener);

        // Create a panel to hold the input fields and buttons
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Item Search:"));
        inputPanel.add(itemField);
        inputPanel.add(new JLabel("Location Search:"));
        inputPanel.add(locationField);
        inputPanel.add(searchButton);

        // Create another panel to hold all the buttons in a flow layout
        JPanel buttonPanel = new JPanel(new GridLayout(0, 3, 3, 3));
        buttonPanel.add(addItemButton);
        buttonPanel.add(removeItemButton);
        buttonPanel.add(addLocationButton);
        buttonPanel.add(removeLocationButton);
        buttonPanel.add(editItemButton);
        buttonPanel.add(editLocationButton);
        buttonPanel.add(generateReportButton);
        buttonPanel.add(importButton);
        buttonPanel.add(exportButton);

        // Add input panel and button panel to the top
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
       
        topPanel.add(inputPanel);
        topPanel.add(buttonPanel);

        // Add everything to the main frame, buttons on top, text area below
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Final setup for the frame
        frame.setSize(WIDTH, HEIGHT);      // Set frame's width and height
        frame.setVisible(true);
    }

    public static void frameSetup(JFrame frame){
        // Setting the icon of the JFrame
        ImageIcon iconImage = new ImageIcon("Icon.png");
        frame.setIconImage(iconImage.getImage());

        // Initial configuration of the JFrame
        frame.setTitle(APPLICATION_TITLE);          // Frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close application when click X
        frame.setResizable(true);                            // Prevents frame from being resized
    }

    // Called when the add item button is pressed
    private static void addItem() {
        // Logic to add items will go here
        System.out.println("Add Item clicked");

        // Prompt the user for item name, quantity, and location name
        String itemName = Utility.promptForInfo("Enter item name");
        if(itemName != null){
            String itemQuantity = Utility.promptForInfo("Enter quantity of that item");
            if(itemQuantity != null){

                // Validate that itemQuantity is a valid integer
                int quantity;
                try {
                    quantity = Integer.parseInt(itemQuantity);
                    if (quantity <= 0) {
                        Utility.sendErrorMessage("Quantity must be a positive integer!");
                        return;
                    }
                } catch (NumberFormatException e) {
                    Utility.sendErrorMessage("Quantity must be a valid integer!");
                    return;
                }

                // Ask for location name
                String locationName = Utility.promptForInfo("Enter location to store item at");
                if(locationName != null){
                    // If the item exists at location, add it
                    inventory.getLocation(locationName).addItem(new Item(itemName, quantity));
                    Utility.sendInfoMessage("Item successfully added!");
                }
            }
        }
        
        refreshDisplay();
    }

    // Called when the remove item button is pressed
    private static void removeItem() {
        // Logic to remove items will go here
        System.out.println("Remove Item clicked");

        // Prompt the user for item name, quantity, and location name
        String itemName = Utility.promptForInfo("Enter name of item to be removed");
        if(itemName != null){
            String itemQuantity = Utility.promptForInfo("Enter how many to remove");
            if(itemQuantity != null){

                // Validate that itemQuantity is a valid integer
                int quantity;
                try {
                    quantity = Integer.parseInt(itemQuantity);
                    if (quantity <= 0) {
                        Utility.sendErrorMessage("Quantity must be a positive integer!");
                        return;
                    }
                } catch (NumberFormatException e) {
                    Utility.sendErrorMessage("Quantity must be a valid integer!");
                    return;
                }

                String locationName = Utility.promptForInfo("Enter location to remove item from");
                if(locationName != null){
                    inventory.removeItem(locationName, itemName, quantity);

                    // Confirm the item was removed
                    Utility.sendInfoMessage(quantity + " * '" + itemName + "' removed from location '" + locationName + "'");
                    System.out.println("Removing " + itemQuantity + " * " + itemName + " from location: '" + locationName + "'");
                }
            }
        }

        refreshDisplay();
    }

    // Called when the add location button is pressed
    private static void addLocation() {
        // Logic to add locations will go here
        System.out.println("Add Location clicked");

        // Prompt the user for location name
        String locationName = Utility.promptForInfo("Enter a new location name");
        if(locationName != null){
            // Create a new Location object
            Location location = new Location(locationName);
            inventory.addLocation(location);
            Utility.sendInfoMessage("Location successfully added!");
        }

        refreshDisplay();
    }

    // Called when the remove location button is pressed
    private static void removeLocation() {
        // Logic to remove locations will go here
        System.out.println("Remove Location clicked");

        // Remove location based on user input
        String locationName = Utility.promptForInfo("Enter name of location\n to be removed");
        if(locationName != null){
            inventory.removeLocation(locationName);
            Utility.sendInfoMessage("Location '" + locationName + "' removed!");
        }

        refreshDisplay();
    }

    // Called when the edit item button is pressed
    private static void editItem() {
        // Logic to edit items will go here
        System.out.println("Edit Item clicked");

        // Get the location item is at
        String locationName = Utility.promptForInfo("Enter the location containing the item you want to edit");
        if(locationName != null){
            Location location = inventory.getLocation(locationName);
            if (location != null) {
                String itemName = Utility.promptForInfo("Enter the name of the\n item you want to edit"); // Get the name of the item
                if(itemName != null){
                    String newItemName = Utility.promptForInfo("Enter the new name for '" + itemName + "'\n(Click Cancel to skip renaming)");
                    if(newItemName != null){ // If they renamed the item, move that new item to new location
                        location.getItem(itemName).setName(newItemName);

                        String newLocationName = Utility.promptForInfo("Enter the name of the location\nto move this item to\n(Click cancel to skip moving item)");
                        if(newLocationName != null){
                            inventory.moveItem(newItemName, locationName, newLocationName);
                        }
                    } else { // If they did NOT rename the item, move the original item name to new location
                        String newLocationName = Utility.promptForInfo("Enter the name of the location\nto move this item to\n(Click cancel to skip moving item)");
                        if(newLocationName != null){
                            inventory.moveItem(itemName, locationName, newLocationName);
                        }
                    }
                    
                }
            }
        }

        refreshDisplay();
    }

    // Called when the edit location button is pressed
    private static void editLocation() {
        // Logic to edit locations will go here
        System.out.println("Edit Location clicked");

        // Get location name to be edited
        String locationName = Utility.promptForInfo("Enter name of location\n you want to edit");
        if (locationName != null){
            Location location = inventory.getLocation(locationName);
            if (location != null) {
                // Get a new name
                String newLocationName = Utility.promptForInfo("What do you want to rename\n this location to?");
                if(newLocationName != null){
                    // Change that locations name
                    location.setName(newLocationName);
                    Utility.sendInfoMessage("Location '" + locationName + "' has been\n renamed to '" + newLocationName + "'");
                }
            }
        }

        refreshDisplay();
    }

    // Called when the View Inventory button is pressed
    private static void generateReport() {
        // Logic to generate report will go here
        System.out.println("Generate Report clicked");

        displayArea.setText(inventory.toString());
    }

    // Called when the Import button is pressed
    private static void importData() {
        // Logic to import data will go here
        System.out.println("Import Data clicked");

        // Prompt the user for name of file to import
        String fileInName = JOptionPane.showInputDialog(
            null, 
            "What is the name of the file\n" + " you want to import (don't add extension)", 
            "Add Item", 
            JOptionPane.QUESTION_MESSAGE
        );

        inventory.importData(fileInName);
        generateReport();
    }

    // Called when the Export button is pressed
    private static void exportData() {
        // Logic to export data will go here
        System.out.println("Export Data clicked");

        // Prompt the user for name of file to output
        String fileOutName = JOptionPane.showInputDialog(
            null, 
            "What do you want to name the\n" + " output file? (don't add extension)", 
            "Add Item", 
            JOptionPane.QUESTION_MESSAGE
        );

        inventory.exportData(fileOutName);
    }

    // Called when the search button is pressed
    public static void searchItem() {
        String itemText = itemField.getText().trim();
        String locationText = locationField.getText().trim();
    
        // Scenario when both fields are empty
        if (itemText.isEmpty() && locationText.isEmpty()) {
            Utility.sendErrorMessage("Please enter an item or\n location before searching");
            return;
        }
    
        // Scenario when only itemField has text
        if (!itemText.isEmpty() && locationText.isEmpty()) {
            String result = inventory.searchItem(itemText);
            displayArea.setText(result);
            return;
        }
    
        // Scenario when only locationField has text
        if (itemText.isEmpty() && !locationText.isEmpty()) {
            StringBuilder result = new StringBuilder("Search Results for '" + locationText + "':\n");
            Location location = inventory.getLocation(locationText);
            if(location != null){
                result.append("   " + location.toString());
            }
            
            displayArea.setText(result.toString());
            return;
        }
    
        // Scenario when both fields have text
        if (!itemText.isEmpty() && !locationText.isEmpty()) {
            StringBuilder result = new StringBuilder("Results for '" + itemText + "' at location '" + locationText + "':\n");

            // Get the location
            Location location = inventory.getLocation(locationText);
            if(location != null){
                Item item = location.getItem(itemText); // Get the item
                if(item != null){
                    // If they both exist, append to the result and display it
                    result.append("   " + item.toString() + "\n");
                    displayArea.setText(result.toString());
                } else {
                    Utility.sendErrorMessage("Item '" + itemText + "' doesn't exist\n at location '" + locationText + "'");
                }
            } else {
                Utility.sendErrorMessage("Location '" + locationText + "' doesn't exist");
            }
        }
    }

    // Called in various functions to refresh the display
    public static void refreshDisplay(){
        String itemText = itemField.getText().trim();
        String locationText = locationField.getText().trim();

        if (!itemText.isEmpty() || !locationText.isEmpty()) {
            searchItem();
        } else {
            generateReport();
        }
    }
}
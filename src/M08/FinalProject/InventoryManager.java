/* 
    Author: Wyatt H. Pearce
    Last edit: 10-12-2024
    Description: SDEV200 FinalProject entry point file
*/

// java.lang imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InventoryManager {
    // Declare global variables for the JTextFields and JTextArea
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
        generateReportButton = new JButton("Get Report");
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
        inputPanel.add(new JLabel("Item:"));
        inputPanel.add(itemField);
        inputPanel.add(new JLabel("Location:"));
        inputPanel.add(locationField);

        // Create another panel to hold all the buttons in a flow layout
        JPanel buttonPanel = new JPanel(new GridLayout(0, 5, 5, 5));
        buttonPanel.add(addItemButton);
        buttonPanel.add(removeItemButton);
        buttonPanel.add(addLocationButton);
        buttonPanel.add(removeLocationButton);
        buttonPanel.add(editItemButton);
        buttonPanel.add(editLocationButton);
        buttonPanel.add(generateReportButton);
        buttonPanel.add(importButton);
        buttonPanel.add(exportButton);
        buttonPanel.add(searchButton);

        // Add input panel and button panel to the top
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
       
        topPanel.add(inputPanel);
        topPanel.add(buttonPanel);

        // Add everything to the main frame, buttons on top, text area below
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Final setup for the frame
        frame.setSize(Constants.WIDTH,Constants.HEIGHT);      // Set frame's width and height
        frame.setVisible(true);
    }

    public static void frameSetup(JFrame frame){
        // Setting the icon of the JFrame
        ImageIcon iconImage = new ImageIcon("Icon.png");
        frame.setIconImage(iconImage.getImage());

        // Initial configuration of the JFrame
        frame.setTitle(Constants.APPLICATION_TITLE);          // Frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close application when click X
        frame.setResizable(true);                            // Prevents frame from being resized
    }

    // Empty methods for button actions
    private static void addItem() {
        // Logic to add items will go here
        System.out.println("Add Item clicked");
    }

    private static void removeItem() {
        // Logic to remove items will go here
        System.out.println("Remove Item clicked");
    }

    private static void addLocation() {
        // Logic to add locations will go here
        System.out.println("Add Location clicked");
    }

    private static void removeLocation() {
        // Logic to remove locations will go here
        System.out.println("Remove Location clicked");
    }

    private static void editItem() {
        // Logic to edit items will go here
        System.out.println("Edit Item clicked");
    }

    private static void editLocation() {
        // Logic to edit locations will go here
        System.out.println("Edit Location clicked");
    }

    private static void generateReport() {
        // Logic to generate report will go here
        System.out.println("Generate Report clicked");
    }

    private static void importData() {
        // Logic to import data will go here
        System.out.println("Import Data clicked");
    }

    private static void exportData() {
        // Logic to export data will go here
        System.out.println("Export Data clicked");
    }

    private static void searchItem() {
        // Logic to search for items based on input fields
        String item = itemField.getText().trim();
        String location = locationField.getText().trim();

        // Clear previous results
        displayArea.setText("");

        // Search logic will go here
        // For demonstration purposes, I have some dummy data
        String[] items = {"Item1, LocationA", "Item2, LocationB", "Item1, LocationC"};
        boolean found = false;

        if (!item.isEmpty() && location.isEmpty()) {
            // Search by item only
            for (String data : items) {
                if (data.toLowerCase().contains(item.toLowerCase())) {
                    displayArea.append(data + "\n");
                    found = true;
                }
            }
        } else if (item.isEmpty() && !location.isEmpty()) {
            // Search by location only
            for (String data : items) {
                if (data.toLowerCase().contains(location.toLowerCase())) {
                    displayArea.append(data + "\n");
                    found = true;
                }
            }
        } else if (!item.isEmpty() && !location.isEmpty()) {
            // Search by both item and location
            for (String data : items) {
                if (data.toLowerCase().contains(item.toLowerCase()) && data.toLowerCase().contains(location.toLowerCase())) {
                    displayArea.append(data + "\n");
                    found = true;
                }
            }
        }

        if (!found) {
            displayArea.append("No results found.\n");
        }
    }
}
/* 
    Author: Wyatt H. Pearce
    Last edit: 10-12-2024
    Description: SDEV200 FinalProject entry point file
*/

// java.lang imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// Third party imports
// Local imports

public class InventoryManager {
    // Declare global variables for the JTextFields and JTextArea
    private static JTextField itemField;
    private static JTextField locationField;
    private static JTextArea displayArea;

    public static void main(String[] args) {
        // Creating a GUI window to add components to
        JFrame frame = new JFrame();
        frameSetup(frame);

        // Set layout for the frame
        frame.setLayout(new FlowLayout());

        // Create input fields
        itemField = new JTextField(15);     // Item name input
        locationField = new JTextField(15); // Location input
        displayArea = new JTextArea(10, 30); // Area to display reports
        displayArea.setEditable(false);                // Make it non-editable

        // Create buttons
        JButton addButton = new JButton("Add Item");
        JButton removeButton = new JButton("Remove Item");
        JButton editButton = new JButton("Edit Item");
        JButton generateReportButton = new JButton("Generate Report");
        JButton importButton = new JButton("Import");
        JButton exportButton = new JButton("Export");
        JButton searchButton = new JButton("Search"); // New search button

        // Add action listeners for buttons
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addItem();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeItem();
            }
        });

        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editItem();
            }
        });

        generateReportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateReport();
            }
        });

        importButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                importData();
            }
        });

        exportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exportData();
            }
        });
        
        // Add action listener for search button
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchItem();
            }
        });

        // Add components to the frame
        frame.add(new JLabel("Item:"));
        frame.add(itemField);
        frame.add(new JLabel("Location:"));
        frame.add(locationField);
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(editButton);
        frame.add(generateReportButton);
        frame.add(importButton);
        frame.add(exportButton);
        frame.add(searchButton); // Add search button to the frame
        frame.add(new JScrollPane(displayArea)); // Add scroll pane for the text area

        frame.setVisible(true); // Make frame visible
    }

    public static void frameSetup(JFrame frame){
        // Setting the icon of the JFrame
        ImageIcon iconImage = new ImageIcon("Icon.png");
        frame.setIconImage(iconImage.getImage());
        
        // Initial configuration of the JFrame
        frame.setTitle(Constants.APPLICATION_TITLE);          // Frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close application when click X
        frame.setResizable(false);                            // Prevents frame from being resized
        frame.setSize(Constants.WIDTH,Constants.HEIGHT);      // Set frame's width and height
    }

    // Empty methods for button actions
    private static void addItem() {
        // Logic to add item will go here
        System.out.println("Add Item clicked");
    }

    private static void removeItem() {
        // Logic to remove item will go here
        System.out.println("Remove Item clicked");
    }

    private static void editItem() {
        // Logic to edit item will go here
        System.out.println("Edit Item clicked");
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
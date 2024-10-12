/* 
    Author: Wyatt H. Pearce
    Last edit: 10-12-2024
    Description: SDEV200 FinalProject entry point file
*/

// java.lang imports
import javax.swing.ImageIcon;
import javax.swing.JFrame;
// Third party imports
// Local imports

public class InventoryManager {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to
        JFrame frame = new JFrame();
        frame.setTitle("Inventory Management System: " + Constants.VERSION); // Frame title
        
        ImageIcon iconImage = new ImageIcon("Icon.png");
        frame.setIconImage(iconImage.getImage()); // Set icon of frame
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close application when click X
        frame.setResizable(false); // Prevents frame from being resized
        frame.setSize(Constants.WIDTH,Constants.HEIGHT); // Set frame's width and height
        frame.setVisible(true); // Make frame visible

        
    }
}
/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter09 M05 p.355
    YouDoIt: "Instantiating Objects from Subclasses"
*/

import javax.swing.*;

public class DemoVehicles {
    public static void main(String[] args) {
        // Instantiating objects
        Sailboat aBoat = new Sailboat();
        Bicycle aBike = new Bicycle();

        // Displaying objects
        JOptionPane.showMessageDialog(
            null,
            "\nVehicle descriptions:\n" +
            aBoat.toString() +
            "\n" +
            aBike.toString()
        );
    }
}

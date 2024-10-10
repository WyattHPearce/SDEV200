/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter09 M05 p.362
    YouDoIt: "Using Object References"
*/

import javax.swing.*;

public class VehicleDatabase {
    public static void main(String[] args) {
        // Create array
        Vehicle[] vehicles = new Vehicle[5];
        
        // Loop through array length
        for(int i = 0; i < vehicles.length; i++){
            String userEntry;
            int vehicleType;

            // User input
            userEntry = JOptionPane.showInputDialog(
                null,
                "Please select the type of\n" +
                "vehicle you want to enter : \n1 - Sailboat\n" +
                "2 - Bicycles"
            );
            vehicleType = Integer.parseInt(userEntry);

            // Instantiate objects into the array based on user's choice
            if(vehicleType == 1){
                vehicles[i] = new Sailboat();
            } else{
                vehicles[i] = new Bicycle();
            }
        }

        // Displaying the array contents
        StringBuffer outString = new StringBuffer();
        for(int i = 0; i < vehicles.length; i++){
            outString.append("\n#" + (i + 1) + " ");
            outString.append(vehicles[i].toString());
        }

        JOptionPane.showMessageDialog(
            null,
            "Our available Vehicles include:\n" + outString
        );
    }
}

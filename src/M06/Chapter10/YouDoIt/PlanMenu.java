/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.424
    YouDoIt: "Creating an Application That Can Catch Exceptions"
*/

import javax.swing.*;

public class PlanMenu {
    public static void main(String[] args){
        // Instantiate and declare
        Menu briefMenu = new Menu();
        PickMenu entree = null;
        String guestChoice = new String();

        // Make selection
        try{
            PickMenu selection = new PickMenu(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        } catch(Exception error){
            guestChoice = "an invalid selection";
        }

        // Display
        JOptionPane.showMessageDialog(
            null,
            "You chose " + guestChoice
        );
    }
}

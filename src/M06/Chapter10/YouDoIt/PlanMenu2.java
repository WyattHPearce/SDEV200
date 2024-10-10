/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.424
    YouDoIt: "Using an Exception You Created"
*/

import javax.swing.*;

public class PlanMenu2 {
    public static void main(String[] args){
        // Instantiate and declare
        Menu2 briefMenu = new Menu2();
        PickMenu2 entree = null;
        String guestChoice = new String();

        // Make selection
        try{
            PickMenu2 selection = new PickMenu2(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        } catch(MenuException exception){
            System.out.println(exception);
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

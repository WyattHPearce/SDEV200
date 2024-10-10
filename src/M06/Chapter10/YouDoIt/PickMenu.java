/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.424
    YouDoIt: "Creating a Class That Passes on an Exception Object"
*/

import javax.swing.*;

public class PickMenu {
    private Menu briefMenu;
    private String guestChoice = new String();

    public PickMenu(Menu theMenu){
        briefMenu = theMenu;
        setGuestChoice();
    }

    public void setGuestChoice(){
        JOptionPane.showMessageDialog(
            null,
            "Choose from the following menu:"
        );
        guestChoice = briefMenu.displayMenu();
    }

    public String getGuestChoice(){
        return(guestChoice);
    }
}

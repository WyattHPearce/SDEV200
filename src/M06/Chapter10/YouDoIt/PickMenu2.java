/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.424
    YouDoIt: "Using an Exception You Created"
*/

import javax.swing.*;

public class PickMenu2 {
    private Menu2 briefMenu;
    private String guestChoice = new String();

    public PickMenu2(Menu2 theMenu) throws MenuException{
        briefMenu = theMenu;
        setGuestChoice();
    }

    public void setGuestChoice() throws MenuException{
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

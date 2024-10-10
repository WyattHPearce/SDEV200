/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.424
    YouDoIt: "Using an Exception You Created"
*/

import javax.swing.*;

public class Menu2 {
    // Class data fields
    protected String[] entreeChoices = {
        "Rosemary Chicken",
        "Beef Wellington",
        "Maine Lobster"
    };
    private String menu = "";
    private int choice;
    protected char initials[] = new char[entreeChoices.length];

    public String displayMenu() throws MenuException{
        // Loop through entreeChoices, build menu and get initials
        for(int i = 0; i < entreeChoices.length; i++){
            menu = menu + "\n" + (i + 1) + " for " + entreeChoices[i];
            initials[i] = entreeChoices[i].charAt(0);
        }

        // Get user selection
        String input = JOptionPane.showInputDialog(
            null,
            "Type your selection, then press Enter." + menu
        );
        choice = Integer.parseInt(input);

        // Exception
        for(int i = 0; i < entreeChoices.length; i++){
            if(input.charAt(0) == initials[i]){
                throw (new MenuException(entreeChoices[i]));
            }
        }

        return(entreeChoices[choice - 1]);
    }
}

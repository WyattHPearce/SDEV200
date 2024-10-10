/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.424
    YouDoIt: "Creating a Class That Automatically Throws Exceptions"
*/

import javax.swing.*;

public class Menu {
    protected String[] entreeChoices = {
        "Rosemary Chicken",
        "Beef Wellington",
        "Maine Lobster"
    };

    private String menu = "";
    private int choice;

    public String displayMenu(){
        for(int i = 0; i < entreeChoices.length; i++){
            menu = menu + "\n" + (i + 1) + " for " + entreeChoices[i];
        }

        String input = JOptionPane.showInputDialog(
            null,
            "Type your selection, then press Enter." + menu
        );

        choice = Integer.parseInt(input);
        return(entreeChoices[choice - 1]);
    }
}

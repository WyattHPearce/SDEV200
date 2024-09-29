/* 
    Author: Wyatt H. Pearce
    Last edit: 9-25-2024
    Program: SDEV200 Chapter08 M04 p.310 - MenuSearch.java
*/

import java.util.*;
import javax.swing.*;


public class MenuSearch {
    public static void main(String[] args) {
        String[] menuChoices = new String[10];
        String entry = "";
        String menuString = "";
        int x = 0;
        int numEntered;
        int highestSubscript = menuChoices.length - 1;

        Arrays.fill(menuChoices, "zzzzzzz");

        menuChoices[x] = JOptionPane.showInputDialog(null, "Enter an item for today's menu, or zzz to quit");

        while(!menuChoices[x].equals("zzz") && x < highestSubscript){
            menuString = menuString + menuChoices[x] + "\n";
            ++x;
            if(x < highestSubscript){
                menuChoices[x] = JOptionPane.showInputDialog(null, "Enter an item for today's menu, or zzz to quit");
            }
        }
        numEntered = x;

        entry = JOptionPane.showInputDialog(null, "Today's menu is:\n" + menuString + "Please make a selection");
    
        // Sort the array prior to binarySearch()
        Arrays.sort(menuChoices, 0, numEntered);

        x = Arrays.binarySearch(menuChoices, entry);

        if(x >= 0 && x < numEntered){
            JOptionPane.showMessageDialog(null, "Exellent choice");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry - That item is not on tonight's menu");
        }


    }
}

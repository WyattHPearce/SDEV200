/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter09 M05 p.355
    YouDoIt: "Extending an Abstract Class with a Second Subclass"
*/

import javax.swing.*;

public class Bicycle extends Vehicle{
    public Bicycle(){
        super("a person", 2);
    }

    @Override
    public void setPrice(){
        String entry;
        final int MAX = 4000;
        entry = JOptionPane.showInputDialog(
            null,
            "Enter bicycle price"
        );
        price = Integer.parseInt(entry);
        if(price > MAX){
            price = MAX;
        }
    }

    @Override
    public String toString(){
        return(
            "The bicycle is powered by " +
            getPowerSource() +
            "; it has " +
            getWheels() +
            " wheels and costs $" +
            getPrice()
        );
    }
}

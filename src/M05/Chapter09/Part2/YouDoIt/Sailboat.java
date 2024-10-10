/* 
    Author: Wyatt H. Pearce
    Last edit: 10-2-2024
    Program: SDEV200 Chapter09 M05 p.355
    YouDoIt: "Creating an Abstract Class"
*/

import javax.swing.*;

public class Sailboat extends Vehicle{
    // Fields
    private int length;

    // Constructor
    public Sailboat(){
        super("wind", 0);
        setLength();
    }

    // Getters and Setters
    public void setLength(){
        String entry;
        entry = JOptionPane.showInputDialog(
            null, 
            "Enter sailboat length in feet"
        );
        length = Integer.parseInt(entry);
    }
    public int getLength(){
        return length;
    }

    @Override
    public void setPrice(){
        String entry;
        final int MAX = 100000;
        entry = JOptionPane.showInputDialog(
            null, 
            "Enter sailboat price"
        );
        price = Integer.parseInt(entry);
        if(price > MAX){
            price = MAX;
        }
    }

    @Override
    public String toString(){
        return(
            "The " +
            getLength() +
            " foot sailboat is powered by " + 
            getPowerSource() +
            "; it has " +
            getWheels() +
            " wheels and costs $" +
            getPrice()
        );
    }
}

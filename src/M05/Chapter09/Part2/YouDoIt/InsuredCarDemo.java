/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter09 M05 p.375
    YouDoIt: "Using an Interface"
*/

import javax.swing.*;

public class InsuredCarDemo {
    public static void main(String[] args) {
        InsuredCar myCar = new InsuredCar();
        JOptionPane.showMessageDialog(
            null,
            myCar.toString()
        );
    }
}

/* 
    Author: Wyatt H. Pearce
    Last edit: 9-18-2024
    Program: SDEV200 Chapter07 M04 p.251 - NumberInput.java
*/

import javax.swing.*;

public class NumberInput {
    public static void main(String[] args) {
        // Declare variables
        String inputString;
        int inputNumber;
        int result;
        // Constants
        final int FACTOR = 10;

        // Get user input
        inputString = JOptionPane.showInputDialog(null, "Enter a number");

        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * FACTOR;
        JOptionPane.showMessageDialog(null, inputNumber + " * " + FACTOR + " = " + result);
    }
}

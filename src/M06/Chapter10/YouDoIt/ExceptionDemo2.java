/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.407
    YouDoIt: "Using Multiple catch Blocks"
*/

import javax.swing.*;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        // Declare variables
        int numerator = 0;
        int denominator = 0;
        int result;
        String inputString;

        // Get user input and calculate the result
        try{
            inputString = JOptionPane.showInputDialog(
                null,
                "Enter a number to be divided"
            );
            numerator = Integer.parseInt(inputString);

            inputString = JOptionPane.showInputDialog(
                null,
                "Enter a number to divide into the first number"
            );
            denominator = Integer.parseInt(inputString);

            result = numerator / denominator;
        } catch(ArithmeticException exception){
            JOptionPane.showMessageDialog(
                null,
                exception.getMessage()
            );
            result = 0;
        } catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(
                null,
                "This application only accepts digits!"
            );
            numerator = 999;
            denominator = 999;
            result = 1;
        }

        // Display result
        JOptionPane.showMessageDialog(
            null,
            numerator +
            " / " +
            denominator +
            "\nResult is " +
            result
        );
    }
}

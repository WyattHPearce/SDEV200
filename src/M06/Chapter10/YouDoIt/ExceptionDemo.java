/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.403
    YouDoIt: "Throwing and Catching an Exception"
*/

import javax.swing.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        int numerator = 0;
        int denominator = 0;
        int result;
        String inputString;

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

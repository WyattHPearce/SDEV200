/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.431
    YouDoIt: "Displaying the Windows Calculator"
*/

import java.util.Scanner;
import java.io.IOException;

public class CalculatorDemo {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        Process proc = Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\calc.exe");

        // Declaring arithmetic values
        double num1 = 279.6;
        double num2 = 872.8;
        double answer = num1 + num2;
        double userAnswer;

        System.out.print(
            "What is the sum of " +
            num1 +
            " and " +
            num2 +
            "? >> "
        );
        userAnswer = input.nextDouble();

        if(userAnswer == answer){
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry - the answer is " + answer);
        }

        input.close();
    }
}

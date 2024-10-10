/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.404
    Figure: 10-18
*/

import java.util.*;

public class DivisionMistakeCaught3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerator;
        int denominator;
        int result;

        try{
            System.out.print("Enter numerator >> ");
            numerator = input.nextInt();
    
            System.out.print("Enter denominator >> ");
            denominator = input.nextInt();

            result = numerator / denominator;

            System.out.println(numerator + " / " + denominator + " = " + result);
        } catch(ArithmeticException mistake){
            System.out.println(mistake.getMessage());
        } catch(InputMismatchException mistake){
            System.out.println("Wrong data type: \n" + mistake.getMessage());
        }
        System.out.println("End of program");

        input.close();
    }
}

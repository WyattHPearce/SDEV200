/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.399
    Figure: 10-9
*/

import java.util.Scanner;

public class DivisionMistakeCaught2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerator;
        int denominator;
        int result;

        System.out.print("Enter numerator >> ");
        numerator = input.nextInt();

        System.out.print("Enter denominator >> ");
        denominator = input.nextInt();

        try{
            result = numerator / denominator;
            System.out.println(numerator + " / " + denominator + " = " + result);
        } catch(ArithmeticException mistake){
            System.out.println(mistake.getMessage());
        }
        System.out.println("End of program");

        input.close();
    }
}

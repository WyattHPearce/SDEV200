import java.util.Scanner;

public class ArithmaticDemo
{
    public static void main(String[] args)
    {
        // Declaration
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        int average;

        // User input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an integer >> ");
        firstNumber = input.nextInt();
        System.out.print("Please enter another integer >> ");
        secondNumber = input.nextInt();

        // Calculations
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2;

        // Output
        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);

        input.close();
    }
}
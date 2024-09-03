import java.util.Scanner;

public class ArithmaticDemo2
{
    public static void main(String[] args)
    {
        // Declaration
        double firstNumber;
        double secondNumber;
        double sum;
        double difference;
        double average;

        // User input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an double >> ");
        firstNumber = input.nextDouble();
        System.out.print("Please enter another double >> ");
        secondNumber = input.nextDouble();

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
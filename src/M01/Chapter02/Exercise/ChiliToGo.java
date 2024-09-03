// Filename ChiliToGo.java
// Written by Wyatt H. Pearce
// Written on 8-27-2024
import java.util.Scanner;

public class ChiliToGo 
{
    /* This class completes Exercise 8a from chapter 2 in the book */

    public static void main(String[] args)
    {
        // Meal price declarations
        final double ADULT_MEAL_PRICE = 7.0;
        final double CHILDRENS_MEAL_PRICE = 4.0;
        int numberOfAdults;
        int numberOfChildren;
        double total;

        // User prompts
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of adult meals you would like to order (Integer) >> ");
        numberOfAdults = input.nextInt();
        System.out.println("Enter the number of children's meals you would like to order (Integer) >> ");
        numberOfChildren = input.nextInt();

        // Calculations
        total = numberOfAdults * ADULT_MEAL_PRICE + numberOfChildren * CHILDRENS_MEAL_PRICE;

        // Output
        System.out.printf("Your total is: $%.2f\n", total);

        input.close();
    }
}

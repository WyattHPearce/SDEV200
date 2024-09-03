// Filename ChiliToGoProfit.java
// Written by Wyatt H. Pearce
// Written on 8-27-2024
import java.util.Scanner;

public class ChiliToGoProfit 
{
    /* This class completes Exercise 8a from chapter 2 in the book */

    public static void main(String[] args)
    {
        // Meal price declarations
        final double ADULT_MEAL_PRICE = 7;
        final double CHILDRENS_MEAL_PRICE = 4;
        final double ADULT_PRODUCTION_COST = 4.35;
        final double CHILDRENS_PRODUCTION_COST = 3.10;
        int numberOfAdults;
        int numberOfChildren;
        double total_price;
        double adult_profit;
        double childrens_profit;
        double total_profit;

        // User prompts
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of adult meals you would like to order (Integer) >> ");
        numberOfAdults = input.nextInt();
        System.out.println("Enter the number of children's meals you would like to order (Integer) >> ");
        numberOfChildren = input.nextInt();

        // Calculations
        total_price = numberOfAdults * ADULT_MEAL_PRICE + numberOfChildren * CHILDRENS_MEAL_PRICE;
        adult_profit = (ADULT_MEAL_PRICE - ADULT_PRODUCTION_COST) * numberOfAdults;
        childrens_profit = (CHILDRENS_MEAL_PRICE - CHILDRENS_PRODUCTION_COST) * numberOfChildren;
        total_profit = adult_profit + childrens_profit;

        // Output
        System.out.printf("Total price: $%.2f\n", total_price);
        System.out.printf("Total profit for adult meals: $%.2f\n", adult_profit);
        System.out.printf("Total profit for children's meals: $%.2f\n", childrens_profit);
        System.out.printf("Total profit: $%.2f\n", total_profit);
        input.close();
    }
}

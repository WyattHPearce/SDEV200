// Wyatt H. Pearce
// Chapter04 M02 Exercise01-b p.156 - TestSandwich.java

import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        // Declarations of variables
        String mainIngredient;
        String breadType;
        double price;
        Scanner keyboard = new Scanner(System.in);
        Sandwich sandwich1;

        // User input
        System.out.println("Please enter the main ingredient of the sandwich >> ");
        mainIngredient = keyboard.nextLine();
        System.out.println("Please enter the breadType you would like >> ");
        breadType = keyboard.nextLine();
        System.out.println("Please enter the price you will set for the sandwich >> ");
        price = keyboard.nextDouble();

        sandwich1 = new Sandwich(mainIngredient, breadType, price);
        sandwich1.display();

        // Close keyboard input
        keyboard.close();
    }
}

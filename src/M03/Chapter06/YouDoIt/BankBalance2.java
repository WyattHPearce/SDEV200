// Wyatt H. Pearce
// Chapter06 M03 p.218 - BankBalance2.java

import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        // Declarations
        double balance;
        int response;
        int year = 1;
        final double INT_RATE = 0.03;
        // User input object
        Scanner keyboard = new Scanner(System.in);

        // User prompt
        System.out.println("Enter initial bank balance >> ");
        balance = keyboard.nextDouble();
        keyboard.nextLine();

        // Loop
        do {
            balance = balance + balance * INT_RATE;
            System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is $" + balance);
            year = year + 1;

            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            response = keyboard.nextInt();
        } while(response == 1);
    }
}

// Wyatt H. Pearce
// Chapter05 M03 p.173 - AssignVolunteer3.java

import java.util.Scanner;

public class AssignVolunteer3 {
    public static void main(String[] args) {
        // Constatns
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        final String NO_PRICER = "Invalid";
        // Variables
        int donationType;
        String volunteer;
        String message;
        
        // User input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else >> ");
        donationType = keyboard.nextInt();

        // Decide pricer
        if(donationType == CLOTHING_CODE){
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
        } else {
            if (donationType == OTHER_CODE){
                volunteer = OTHER_PRICER;
                message = "a non-clothing donation";
            } else {
                volunteer = NO_PRICER;
                message = "an invalid donation type.";
            }
        }

        // Display choice
        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);
        
    }
}
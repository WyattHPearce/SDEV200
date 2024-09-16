// Wyatt H. Pearce
// Chapter05 M03 p.171 - AssignVolunteer2.java

import java.util.Scanner;

public class AssignVolunteer2 {
    public static void main(String[] args) {
        // Constatns
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
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
            volunteer = OTHER_PRICER;
            message = "a non-clothing donation";
        }

        // Display choice
        System.out.println("You entered " + donationType);
        System.out.println("This is a " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);
        
    }
}
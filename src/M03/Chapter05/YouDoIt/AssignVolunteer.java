// Wyatt H. Pearce
// Chapter05 M03 p.167 - AssignVolunteer.java

import java.util.Scanner;

public class AssignVolunteer {
    public static void main(String[] args) {
        // Constatns
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        // Variables
        int donationType;
        String volunteer;
        
        // User input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else >> ");
        donationType = keyboard.nextInt();

        // Decide pricer
        if(donationType == CLOTHING_CODE){
            volunteer = CLOTHING_PRICER;
        } else {
            volunteer = OTHER_PRICER;
        }

        // Display choice
        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
        
    }
}
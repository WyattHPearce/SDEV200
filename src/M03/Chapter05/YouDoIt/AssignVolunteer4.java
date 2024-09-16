// Wyatt H. Pearce
// Chapter05 M03 p.184 - AssignVolunteer4.java

import java.util.Scanner;

public class AssignVolunteer4 {
    public static void main(String[] args) {
        // Constatns
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;
        // Names
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        final String NO_PRICER = "Invalid";
        final String FURNITURE_PRICER = "Wei";
        final String ELECTRONICS_PRICER = "Lydia";
        // Variables
        int donationType;
        String volunteer;
        String message;
        
        // User input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("Enter an integer between 1 and 4 >> ");
        donationType = keyboard.nextInt();

        // Decide pricer with switch case
        switch(donationType){
            case(CLOTHING_CODE):
            {
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
                break;
            }
            case(FURNITURE_CODE):
            {
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation";
                break;
            }
            case(ELECTRONICS_CODE):
            {
                volunteer = ELECTRONICS_PRICER;
                message = "an electronics donation";
                break;
            }
            case(OTHER_CODE):
            {
                volunteer = OTHER_PRICER;
                message = "another donation type";
                break;
            }
            default:
            {
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
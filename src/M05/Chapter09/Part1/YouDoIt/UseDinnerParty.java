/* 
    Author: Wyatt H. Pearce
    Last edit: 10-2-2024
    Program: SDEV200 Chapter09 M05 p.333 - YouDoIt Demonstrating Inheritance
*/

import java.util.*;

public class UseDinnerParty {
    public static void main(String[] args) {
        int guests;
        Party aParty = new Party();
        DinnerParty aDinnerParty = new DinnerParty();

        // User input for party
        Scanner keyboard = new Scanner(System.in);
        int choice;
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        aParty.setGuests(guests);

        // Display party
        System.out.println("The party has " + aParty.getGuests() + " guests.");  
        aParty.displayInvitation();

        // User input for dinnerParty
        System.out.print("Enter number of guests for the dinner party >> ");
        guests = keyboard.nextInt();
        aDinnerParty.setGuests(guests);
        // Dinner choice
        System.out.print("Enter the menu option -- 1 for chicken or 2 for beef >> ");
        choice = keyboard.nextInt();
        aDinnerParty.setDinnerChoice(choice);
        System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests");
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served.");

        aDinnerParty.displayInvitation();
    }
}

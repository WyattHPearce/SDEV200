/* 
    Author: Wyatt H. Pearce
    Last edit: 9-30-2024
    Program: SDEV200 Chapter09 M05 p.333 - YouDoIt Demonstrating Inheritance
*/

import java.util.*;

public class UseParty {
    public static void main(String[] args) {
        int guests;
        Party aParty = new Party();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        aParty.setGuests(guests);
        System.out.println("The party has " + aParty.getGuests() + " guests.");
    
        aParty.displayInvitation();
    }
}

/* 
    Author: Wyatt H. Pearce
    Last edit: 9-30-2024
    Program: SDEV200 Chapter09 M05 p.341
    YouDoIt: "Understanding the Role of Constructors in Inheritance"
*/

public class PartyWithConstructor {
    // Fields
    private int guests;

    public PartyWithConstructor(){
        System.out.println("Creating a Party");
    }

    // Getters and Setters
    public int getGuests(){
        return guests;
    }
    public void setGuests(int guests){
        this.guests = guests;
    }

    // Invitation Displayer
    public void displayInvitation(){
        System.out.println("Please come to my party!");
    }
}

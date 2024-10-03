/* 
    Author: Wyatt H. Pearce
    Last edit: 10-2-2024
    Program: SDEV200 Chapter09 M05 p.341
    YouDoIt: "Understanding the Role of Constructors in Inheritance"
*/

public class PartyWithConstructor2 {
    // Fields
    private int guests;

    public PartyWithConstructor2(int numberOfGuests){
        guests = numberOfGuests;
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

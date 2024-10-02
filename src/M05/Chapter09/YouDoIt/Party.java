package YouDoIt;
/* 
    Author: Wyatt H. Pearce
    Last edit: 9-30-2024
    Program: SDEV200 Chapter09 M05 p.333 - YouDoIt Demonstrating Inheritance
*/

public class Party {
    // Fields
    private int guests;

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

/* 
    Author: Wyatt H. Pearce
    Last edit: 10-2-2024
    Program: SDEV200 Chapter09 M05 p.341
    YouDoIt: "Understanding the Role of Constructors in Inheritance"
*/

public class DinnerPartyWithConstructor2 extends PartyWithConstructor2{
    private int dinnerChoice;

    public DinnerPartyWithConstructor2(int numberOfGuests){
        super(numberOfGuests);
    }

    public int getDinnerChoice(){
        return dinnerChoice;
    }
    public void setDinnerChoice(int dinnerChoice){
        this.dinnerChoice = dinnerChoice;
    }

    @Override
    public void displayInvitation(){
        System.out.println("Please come to my dinner party!");
    }
}

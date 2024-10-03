/* 
    Author: Wyatt H. Pearce
    Last edit: 9-30-2024
    Program: SDEV200 Chapter09 M05 p.338 - YouDoIt "Overriding a Superclass Method"
*/

public class DinnerParty2 extends Party{
    private int dinnerChoice;

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

/* 
    Author: Wyatt H. Pearce
    Last edit: 9-30-2024
    Program: SDEV200 Chapter09 M05 p.333 - YouDoIt Demonstrating Inheritance
*/

public class DinnerParty extends Party{
    private int dinnerChoice;

    public int getDinnerChoice(){
        return dinnerChoice;
    }
    public void setDinnerChoice(int dinnerChoice){
        this.dinnerChoice = dinnerChoice;
    }
}

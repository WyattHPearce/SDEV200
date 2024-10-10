/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter09 M05 p.353
    Figure: 9-29
*/

public abstract class Animal{
    // Fields
    private String name;
    public abstract void speak();

    // Mutator methods
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
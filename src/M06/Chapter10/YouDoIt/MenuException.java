/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.424
    YouDoIt: "Creating an Exception Class"
*/

public class MenuException extends Exception{
    public MenuException(String choice){
        super(choice);
    }
}

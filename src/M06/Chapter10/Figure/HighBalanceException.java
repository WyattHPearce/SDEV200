/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.419
    Figure: 10-37
*/

public class HighBalanceException extends Exception{
    public HighBalanceException(){
        super("Customer balance is high");
    }
}

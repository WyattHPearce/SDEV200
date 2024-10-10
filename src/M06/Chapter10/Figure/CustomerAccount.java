/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.419
    Figure: 10-38
*/

public class CustomerAccount {
    private int accountNumber;
    private double balance;
    public static double HIGH_CREDIT_LIMIT = 20000.00;

    public CustomerAccount(int num, double bal) throws HighBalanceException{
        accountNumber = num;
        balance = bal;

        if(balance > HIGH_CREDIT_LIMIT){
            throw(new HighBalanceException());
        }
    }
}

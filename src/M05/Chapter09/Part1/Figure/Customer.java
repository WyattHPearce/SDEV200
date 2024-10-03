/* 
    Author: Wyatt H. Pearce
    Last edit: 10-2-2024
    Program: SDEV200 Chapter09 M05 p.344
    Figure: 9-10 "Customer"
*/

public class Customer {
    private int idNumber;
    private double balanceOwed;
    public Customer(int id, double bal){
        idNumber = id;
        balanceOwed = bal;
    }
    public void display(){
        System.out.println("Customer #" + idNumber + " Balance $" + balanceOwed);
    }
}

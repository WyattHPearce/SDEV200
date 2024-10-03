/* 
    Author: Wyatt H. Pearce
    Last edit: 10-2-2024
    Program: SDEV200 Chapter09 M05 p.344
    Figure: 9-11 "PerferredCustomer"
*/

public class PerferredCustomer extends Customer{
    double discountRate;
    public PerferredCustomer(int id, double bal, double rate){
        super(id, bal);
        discountRate = rate;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(" Discount rate is " + discountRate);
    }
}

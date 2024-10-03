/* 
    Author: Wyatt H. Pearce
    Last edit: 10-2-2024
    Program: SDEV200 Chapter09 M05 p.344
    Figure: 9-12 "TestCustomers"
*/

public class TestCustomers {
    public static void main(String[] args) {
        Customer oneCust = new Customer(124, 123.45);
        PerferredCustomer onePCust = new PerferredCustomer(125, 3456.78, 0.15);
        oneCust.display();
        onePCust.display();
    }
}

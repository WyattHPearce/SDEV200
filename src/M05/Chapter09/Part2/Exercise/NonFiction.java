/* 
    Author: Wyatt H. Pearce
    Last edit: 10-7-2024
    Program: SDEV200 Chapter09 M05 p.387
    Exercise: 8b
*/

public class NonFiction extends Book {

    // Constructor
    public NonFiction(String title) {
        super(title);
        setPrice();  // Call setPrice method
    }

    // Implementation of super method
    @Override
    public void setPrice() {
        this.price = 37.99;  // set price to $37.99 for non-Fiction
    }
}
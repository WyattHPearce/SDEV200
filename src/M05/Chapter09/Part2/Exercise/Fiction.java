/* 
    Author: Wyatt H. Pearce
    Last edit: 10-7-2024
    Program: SDEV200 Chapter09 M05 p.387
    Exercise: 8b
*/

public class Fiction extends Book {

    // Constructor
    public Fiction(String title) {
        super(title);
        setPrice();  // Call setPrice() method
    }

    // Implementation of super method
    @Override
    public void setPrice() {
        this.price = 24.99;  // set price to $24.99 for fiction
    }
}
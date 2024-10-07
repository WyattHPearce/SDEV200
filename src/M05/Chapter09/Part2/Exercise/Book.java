/* 
    Author: Wyatt H. Pearce
    Last edit: 10-7-2024
    Program: SDEV200 Chapter09 M05 p.387
    Exercise: 8a
*/

public abstract class Book {
    protected String title;
    protected double price;

    // Constructor
    public Book(String title) {
        this.title = title;
        setPrice();
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Abstract method to set price, to be implemented in subclasses
    public abstract void setPrice();
}
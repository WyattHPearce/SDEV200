/* 
    Author: Wyatt H. Pearce
    Last edit: 10-7-2024
    Program: SDEV200 Chapter09 M05 p.387
    Exercise: 8c
*/

import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        int numberOfBooks = 3;
        Book[] books = generateBooks(numberOfBooks); // Create the books

        displayBooks(books); // Display the books
    }

    // Takes a number of books and returns an array (of book) of that size
    public static Book[] generateBooks(int numberOfBooks){
        // Array to be returned
        Book[] books = new Book[numberOfBooks];

        // Start user input
        Scanner scanner = new Scanner(System.in);

        // Looping through array of books
        for (int i = 0; i < books.length; i++) {

            // Get user input for title
            System.out.println("Enter the title of book " + (i + 1) + ": ");
            String title = scanner.nextLine();

            // Get user input for book type
            char type;
            while(true) {
                System.out.println("Is the book Fiction (F) or NonFiction (N)?");
                type = scanner.nextLine().toUpperCase().charAt(0); // Make validation easier and select first character

                // Input validation
                if (type == 'F' || type == 'N') {
                    break;  // Valid input, break out of the loop
                } else {
                    System.out.println("Invalid choice. Please enter 'F' for Fiction, or 'N' for NonFiction.");
                }
            }

            // Set title
            if(type == 'F') {
                books[i] = new Fiction(title + " (Fiction)");  // Create Fiction book
            } else {
                books[i] = new NonFiction(title + " (Non-Fiction)");  // Create NonFiction book
            }
        }

        // End user input
        scanner.close();

        // Return array of books
        return books;
    }

    public static void displayBooks(Book[] books){
        // Display details of all books in an array of books
        System.out.println("\nDetails of all books:");
        for (Book book : books) { // "For every book, call it book in books"
            System.out.println("Title: " + book.getTitle() + ", Price: " + book.getPrice());
        }
    }
}
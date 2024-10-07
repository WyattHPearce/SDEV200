/* 
    Author: Wyatt H. Pearce
    Last edit: 10-7-2024
    Program: SDEV200 Chapter09 M05 p.387
    Exercise: 8c
*/

import java.util.Scanner;

public class UseBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input holders
        String fictionTitle;
        String nonFictionTitle;

        // Books
        Fiction fictionBook;
        NonFiction nonFictionBook;


        
        // User input for fiction
        System.out.print("Enter a fiction book title >> ");
        fictionTitle = input.nextLine();
        fictionBook = new Fiction(fictionTitle);
        // Display
        System.out.println("Fiction Book Details:");
        System.out.println("Title: " + fictionBook.getTitle());
        System.out.println("Price: $" + fictionBook.getPrice());



        // User input for non-fiction
        System.out.print("\nEnter a non-fiction book title: ");
        nonFictionTitle = input.nextLine();
        nonFictionBook = new NonFiction(nonFictionTitle);
        // Display
        System.out.println("Non-Fiction Book Details:");
        System.out.println("Title: " + nonFictionBook.getTitle());
        System.out.println("Price: $" + nonFictionBook.getPrice());

        input.close();
    }
}
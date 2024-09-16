// Wyatt H. Pearce
// Chapter06 M03 p.209 - CustomerSurvey.java

import java.util.*;

public class CustomerSurvey {
    public static void main(String[] args) {
        // Variables
        int rating;
        final int MIN = 1;
        final int MAX = 5;
        Scanner input = new Scanner(System.in);

        // User prompt
        System.out.println("Please enter a value that");
        System.out.println("represents your satisfaction with");
        System.out.println("our service.");
        System.out.println("Enter a value between " + MIN);
        System.out.println("and " + MAX);
        System.out.println("with " + MAX + " meaning highly");
        System.out.println("satisfied and");
        System.out.println(MIN + " meaning not at all satisfied.");
        System.out.print("Enter your rating >> ");
        // Getting user input
        rating = input.nextInt();

        // Validation loop
        while(rating < MIN || rating > MAX){
            System.out.println("You must enter a value");
            System.out.println("between " + MIN + " and " + MAX);
            System.out.print("Please try again >> ");
            rating = input.nextInt();
        }

        // Closing prompt
        System.out.println("Thank you.");
    }
}

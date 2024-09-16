// Wyatt H. Pearce
// Chapter06 M03 p.222 - DivideEvenly2.java

public class DivideEvenly2 {
    public static void main(String[] args) {
        // Declaration
        final int LIMIT = 100;
        int variable;
        int number;

        // Displaying program purpose
        System.out.println("All numbers that go evenly into every number");
        System.out.println("up to and including " + LIMIT + ":");

        // Output loop
        for(number = 1; number <= LIMIT; ++number){
            System.out.print(number + " is evenly divisible by: ");
            for(variable = 1; variable <= number; ++variable){
                if(number % variable == 0){
                    System.out.print(variable + " ");
                }
            }
            System.out.println();
        }
    }
}

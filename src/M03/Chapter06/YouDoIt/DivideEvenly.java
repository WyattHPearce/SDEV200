// Wyatt H. Pearce
// Chapter06 M03 p.216 - DivideEvenly.java

public class DivideEvenly {
    public static void main(String[] args) {
        // Declaration
        final int LIMIT = 100;
        int variable;

        // Displaying program purpose
        System.out.print(LIMIT + " is evenly divisible by ");

        // Output loop
        for (variable = 1; variable <= LIMIT; ++variable){
            if(LIMIT % variable == 0){
                System.out.print(variable + " ");
            }
        }

        System.out.println();
    }
}

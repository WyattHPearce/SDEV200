/* 
    Author: Wyatt H. Pearce
    Last edit: 9-18-2024
    Program: SDEV200 Chapter07 M04 p.256 - StringBuilderMethods.java
*/

public class StringBuilderMethods {
    public static void main(String[] args) {
        // Declaring a string builder
        StringBuilder str = new StringBuilder("singing");
        System.out.println(str);

        // Appending to string builder
        str.append(" in the dead of ");
        System.out.println(str);

        // Inserting to string builder
        str.insert(0, "Black");
        System.out.println(str);
        str.insert(5, "bird ");
        System.out.println(str);

        // Final append
        str.append("night");
        System.out.println(str);
    }
}

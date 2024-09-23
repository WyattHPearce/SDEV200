/* 
    Author: Wyatt H. Pearce
    Last edit: 9-18-2024
    Program: SDEV200 Chapter08 M04 p.270 - DemoArray.java
*/

public class DemoArray {
    public static void main(String[] args) {
        // Create array
        double[] salaries = new double[4];

        // Manually populate the array
        salaries[0] = 16.25;
        salaries[1] = 17.55;
        salaries[2] = 18.25;
        salaries[3] = 19.86;

        // Display the array
        System.out.println("Salaries one by one are:");
        System.out.println(salaries[0]);
        System.out.println(salaries[1]);
        System.out.println(salaries[2]);
        System.out.println(salaries[3]);
    }
}

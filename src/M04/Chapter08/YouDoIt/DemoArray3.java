/* 
    Author: Wyatt H. Pearce
    Last edit: 9-18-2024
    Program: SDEV200 Chapter08 M04 p.277 - DemoArray3.java
*/

public class DemoArray3 {
    public static void main(String[] args) {
        // Create array
        double[] salaries = {16.25, 17.55, 18.25, 19.86};

        // Display the array with for loop
        System.out.println("Salaries one by one are:");
        for(int i = 0; i < salaries.length; ++i){
            System.out.println(salaries[i]);
        }
    }
}

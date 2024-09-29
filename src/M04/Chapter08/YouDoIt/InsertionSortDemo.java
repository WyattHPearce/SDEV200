/* 
    Author: Wyatt H. Pearce
    Last edit: 9-23-2024
    Program: SDEV200 Chapter08 M04 p.299 - InsertionSortDemo.java
*/

import java.util.*;

class InsertionSortDemo {
    public static void main(String[] args) {
        int[] someNums = new int[5];
        Scanner keyboard = new Scanner(System.in);
        int a;
        int b;
        int temp;

        // User input for array elements
        for(a = 0; a < someNums.length; ++a){
            System.out.print("Enter number " + (a+1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }

        display(someNums, 0);

        // Performing the insertion sort
        a = 1;
        while(a < someNums.length){
            temp = someNums[a];
            b = a - 1;
            while(b >= 0 && someNums[b] > temp){
                someNums[b + 1] = someNums[b];
                --b;
            }
            someNums[b + 1] = temp;
            display(someNums, a);
            ++a;
        }
    }

    public static void display(int someNums[], int a){
        // Display iteration
        System.out.print("Iteration " + a + ": ");

        // Display array
        for(int x = 0; x < someNums.length; ++x){
            System.out.print(someNums[x] + " ");
        }
        System.out.println();
    }
}

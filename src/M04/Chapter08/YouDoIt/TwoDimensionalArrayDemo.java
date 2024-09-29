/* 
    Author: Wyatt H. Pearce
    Last edit: 9-25-2024
    Program: SDEV200 Chapter08 M04 p.305 - TwoDimensionalArrayDemo.java
*/

import java.util.Scanner;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args){
        int[][] count = new int[3][3];

        Scanner input = new Scanner(System.in);
        int row;
        int column;
        final int QUIT = 99;

        // Initial prompt
        System.out.print("Enter a row or " + QUIT + " to quit > ");
        row = input.nextInt();

        while(row != QUIT){
            System.out.print("Enter a column > ");
            column = input.nextInt();

            if(row < count.length && column < count[row].length){
                count[row][column]++;

                // Display the array
                for(int r = 0; r < count.length; ++r){
                    for(int c = 0; c < count[r].length; ++c){
                        System.out.print(count[r][c] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Invalid position selected");
            }

            // New prompt
            System.out.print("Enter a row or " + QUIT + " to quit > ");
            row = input.nextInt();
        }
    }
}

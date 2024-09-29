/* 
    Author: Wyatt H. Pearce
    Last edit: 9-29-2024
    Program: SDEV200 Chapter08 M04 p.287 - Figure8-13
*/

import javax.swing.*;

public class FindDiscount {
    public static void main(String[] args) {
        final int NUM_RANGES = 5;
        int[] discountRangeLimits = {
            1, 13, 50, 100, 200
        };
        double[] discountRates = {
            0.00, 0.10, 0.14, 0.18, 0.20
        };
        double customerDiscount;
        String stringNumberOrdered;
        int numberOrdered;
        int sub = NUM_RANGES - 1;

        stringNumberOrdered = JOptionPane.showInputDialog(null, "How many items are ordered?");

        numberOrdered = Integer.parseInt(stringNumberOrdered);

        while(sub >= 0 && numberOrdered < discountRangeLimits[sub]){
            --sub;
        }

        customerDiscount = discountRates[sub];
        JOptionPane.showMessageDialog(null, "Discount rate for " + numberOrdered + " items is " + customerDiscount);
    }
}

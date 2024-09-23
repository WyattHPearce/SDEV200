/* 
    Author: Wyatt H. Pearce
    Last edit: 9-18-2024
    Program: SDEV200 Chapter08 M04 p.280 - BowlingTeamDemo.java
*/

import java.util.Scanner;

public class BowlingTeamDemo {
    public static void main(String[] args) {
        // Declaration of variables
        String name;
        BowlingTeam bowlTeam = new BowlingTeam();
        final int NUM_TEAM_MEMBERS = 4;

        // Getting user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter team name >> ");
        name = input.nextLine();
        bowlTeam.setTeamName(name);

        for(int i = 0; i < NUM_TEAM_MEMBERS; ++i){
            System.out.print("Enter team member #" + (i+1) + "'s name >> ");
            name = input.nextLine();
            bowlTeam.setMember(i, name);
        }

        System.out.println("\nMembers of team " + bowlTeam.getTeamName() + ": ");
        for(int i = 0; i < NUM_TEAM_MEMBERS; ++i){
            System.out.print(bowlTeam.getMember(i) + " ");
        }
        System.out.println();

    }
}

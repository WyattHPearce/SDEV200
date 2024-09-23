/* 
    Author: Wyatt H. Pearce
    Last edit: 9-18-2024
    Program: SDEV200 Chapter08 M04 p.281 - BowlingTeamDemo2.java
*/

import java.util.Scanner;

public class BowlingTeamDemo2 {
    public static void main(String[] args) {
        // Declaration of variables
        String name;
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        BowlingTeam bowlTeam = new BowlingTeam();
        final int NUM_TEAM_MEMBERS = 4;

        // Setting up teams and their members with user input
        for(int i = 0; i < NUM_TEAMS; ++i){
            // Initializing teams
            teams[i] = new BowlingTeam();

            // Getting user input
            Scanner input = new Scanner(System.in);
            System.out.print("Enter team #" + (i+1) + "'s name >> ");
            name = input.nextLine();
            teams[i].setTeamName(name);
            for(int j = 0; j < NUM_TEAM_MEMBERS; ++j){
                System.out.print("Enter team member #" + (j+1) + "'s name >> ");
                name = input.nextLine();
                teams[i].setMember(j, name);
            }
        }

        // Displaying the teams
        for(int i = 0; i < NUM_TEAMS; ++i){
            System.out.println("\nMembers of team " + teams[i].getTeamName() + ":");
            for(int j = 0; j < NUM_TEAM_MEMBERS; ++j){
                System.out.print(teams[i].getMember(j) + " ");
            }
            System.out.println();
        }
    }
}

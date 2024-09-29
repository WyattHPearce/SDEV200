/* 
    Author: Wyatt H. Pearce
    Last edit: 9-23-2024
    Program: SDEV200 Chapter08 M04 p.291 - BowlingTeamDemo4.java
*/

import java.util.Scanner;

public class BowlingTeamDemo4 {
    public static void main(String[] args) {
        // Declaration of variables
        Scanner input = new Scanner(System.in);
        String name;
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        BowlingTeam bowlTeam = new BowlingTeam();
        final int NUM_TEAM_MEMBERS = 4;

        getTeamData(teams);

        // Displaying the teams
        for(int i = 0; i < NUM_TEAMS; ++i){
            System.out.println("\nMembers of team " + teams[i].getTeamName() + ":");
            for(int j = 0; j < NUM_TEAM_MEMBERS; ++j){
                System.out.print(teams[i].getMember(j) + " ");
            }
            System.out.println();
        }

        System.out.print("\nEnter a team name to see it's roster >> ");
        name = input.nextLine();

        for(int i = 0; i < teams.length; ++i){
            if(name.equals(teams[i].getTeamName())){
                for(int j = 0; j < NUM_TEAM_MEMBERS; ++j){
                    System.out.print(teams[i].getMember(j) + " ");
                }
            }
        }

    }

    public static void getTeamData(BowlingTeam[] teams){
        // Declarations
        String name;
        final int NUM_TEAMS = 4;
        int x;
        int y;
        final int NUM_TEAM_MEMBERS = 4;
        Scanner input = new Scanner(System.in);

        // Setting up teams and their members with user input
        for(int i = 0; i < NUM_TEAMS; ++i){
            // Initializing teams
            teams[i] = new BowlingTeam();

            // Getting user input
            System.out.print("Enter team #" + (i+1) + "'s name >> ");
            name = input.nextLine();
            teams[i].setTeamName(name);
            for(int j = 0; j < NUM_TEAM_MEMBERS; ++j){
                System.out.print("Enter team member #" + (j+1) + "'s name >> ");
                name = input.nextLine();
                teams[i].setMember(j, name);
            }
        }
    }
}

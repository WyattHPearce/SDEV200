/* 
    Author: Wyatt H. Pearce
    Last edit: 9-23-2024
    Program: SDEV200 Chapter04 p.157 - Exercise 5b
*/

import java.util.Scanner;

public class TestTeam {
    public static void main(String[] args) {
        // User input
        Scanner keyboard = new Scanner(System.in);

        // Declare team objects
        final int NUMBER_OF_TEAMS = 3;
        Team teams[] = new Team[NUMBER_OF_TEAMS];

        // For each team object, initialize using setTeamData()
        for (int i = 0; i < teams.length; i++){
            System.out.println("Team #" + (i+1) + ": ");
            teams[i] = setTeamData(keyboard);
        }

        // Display the team data for each object
        System.out.println("OVERVIEW OF TEAMS:");
        for (int i = 0; i < teams.length; i++){
            teams[i].display();
        }
    }

    public static Team setTeamData(Scanner keyboard){
        // Get user input
        System.out.print("Enter the teams highschool >> ");
        String highschoolName = keyboard.nextLine();

        System.out.print("Enter the teams name >> ");
        String teamName = keyboard.nextLine();

        System.out.print("Enter the teams sport >> ");
        String sport = keyboard.nextLine();

        // Return temporary, anonymous object
        return new Team(highschoolName, teamName, sport);
    }
}
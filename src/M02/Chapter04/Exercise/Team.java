/* 
    Author: Wyatt H. Pearce
    Last edit: 9-23-2024
    Program: SDEV200 Chapter04 p.157 - Exercise 5a
*/

public class Team {
    // Team properties
    private String highschoolName;
    private String teamName;
    private String sport;
    public final static String MOTTO = "Sportsmanship";

    // Constructor
    public Team(String highschoolName, String teamName, String sport){
        this.highschoolName = highschoolName;
        this.teamName = teamName;
        this.sport = sport;
    }

    // Getters
    public String getHighschoolName(){
        return highschoolName;
    }

    public String getTeamName(){
        return teamName;
    }

    public String getSport(){
        return sport;
    }

    // Method to display team information
    public void display() {
        System.out.println("Team Name: " + teamName);
        System.out.println("High School: " + highschoolName);
        System.out.println("Sport: " + sport);
        System.out.println("Motto: " + MOTTO);
        System.out.println();
    }
}

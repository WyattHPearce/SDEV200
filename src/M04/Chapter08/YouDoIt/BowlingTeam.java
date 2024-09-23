/* 
    Author: Wyatt H. Pearce
    Last edit: 9-18-2024
    Program: SDEV200 Chapter08 M04 p.280 - BowlingTeam.java
*/

public class BowlingTeam {
    private String teamName;
    private String[] members = new String[4];

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public String getTeamName(){
        return teamName;
    }

    public void setMember(int number, String name){
        members[number] = name;
    }

    public String getMember(int number){
        return members[number];
    }
}

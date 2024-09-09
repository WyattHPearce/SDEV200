// Wyatt H. Pearce
// Chapter04 M02 - DogTriathlonParticipant.java

public class DogTriathlonParticipant {
    private final int NUM_EVENTS;
    private static int totalCumulativeScore = 0;

    private String name;
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;

    public DogTriathlonParticipant(String name, int numEvents, int score1, int score2, int score3){
        this.name = name;
        NUM_EVENTS = numEvents;
        obedienceScore = score1;
        conformationScore = score2;
        agilityScore = score3;
        
        // Calculate scores
        total = obedienceScore + conformationScore + agilityScore;
        avg = (double) total / NUM_EVENTS;
        totalCumulativeScore = totalCumulativeScore + total;
    }

    public void display(){
        System.out.println("--------------------");
        System.out.println("NAME: " + name);
        System.out.println("EVENTS PARTICIPATED IN: " + NUM_EVENTS);
        System.out.println("AVERAGE SCORE: " + avg);
        System.out.println("TOTAL SCORE: " + total);
        System.out.println("TOTAL CUMULATIVE SCORE: " + totalCumulativeScore);
        System.out.println("--------------------");
    }
}

// Wyatt H. Pearce
// Chapter06 M03 p.226 - TestFusedLoopTime.java

import java.time.*;

public class TestFusedLoopTime {
    public static void main(String[] args) {
        // Declaration
        int startTime;
        int endTime;
        int x;
        final int REPEAT = 5_000_000; // Underscore for ease of reading
        final int FACTOR = 1_000_000; // Underscore may be omitted

        // Getting now
        LocalDateTime now;
        now = LocalDateTime.now();
        startTime = now.getNano();

        // Un-optimized Loop test
        for(x = 0; x < REPEAT; ++x){
            method1();
        }
        for(x = 0; x < REPEAT; ++x){
            method2();
        }

        // Display time un-optimized loop took to execute
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops executed separately:");
        System.out.println(((endTime - startTime) / FACTOR) + " milliseconds");

        // Optimized loop test
        now = LocalDateTime.now();
        startTime = now.getNano();
        for(x = 0; x < REPEAT; ++x){
            method1();
            method2();
        }

        // Display time optimized loop took to execute
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops executed in a block:");
        System.out.println(((endTime - startTime) / FACTOR) + " milliseconds");
    }

    // Stub methods
    public static void method1(){
    }
    public static void method2(){
    }
}

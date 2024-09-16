// Wyatt H. Pearce
// Chapter05 M03 p.177 - ShortCircuitTestOr.java

public class ShortCircuitTestOr {
    public static void main(String[] args) {
        
        if(trueMethod() || falseMethod()){
            System.out.println("At least one is true");
        } else {
            System.out.println("Both are false");
        }

    }

    public static boolean trueMethod(){
        System.out.println("Within trueMethod()");
        return true;
    }

    public static boolean falseMethod(){
        System.out.println("Within falseMethod()");
        return false;
    }
}

// Wyatt H. Pearce
// Chapter05 M03 p.177 - ShortCircuitTestAnd.java

public class ShortCircuitTestAnd {
    public static void main(String[] args) {
        
        if(falseMethod() && trueMethod()){
            System.out.println("Both are true");
        } else {
            System.out.println("At least one is false");
        }

    }

    public static boolean trueMethod(){
        System.out.println("Within trueMethod()");
        return true;
    }

    public static boolean falseMethod(){
        System.out.println("Within falseMethod");
        return false;
    }
}

// Wyatt H. Pearce
// Chapter06 M03 p.213 - DemoIncrement2.java

public class DemoIncrement2 {
    public static void main(String[] args) {
        // First declaration
        int v = 4;
        int plusPlusV = ++v;
        v = 4;
        int vPlusPlus = v++;
        // First display
        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);

        // Second declaration
        int w = 17;
        int x = 17;
        int y = 18;
        boolean compare1 = (++w == y);
        boolean compare2 = (x++ == y);
        // Second display
        System.out.println("First comapre is " + compare1);
        System.out.println("Second compare is " + compare2);
    }
}

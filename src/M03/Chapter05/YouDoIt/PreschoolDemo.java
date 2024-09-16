// Wyatt H. Pearce
// Chapter05 M03 p.192 - PreschoolDemo.java

public class PreschoolDemo {
    public static void main(String[] args) {
        PreschoolStudent ps1 = new PreschoolStudent(2345, 5);
        PreschoolStudent ps2 = new PreschoolStudent(67890, 8);

        // Display
        display(ps1);
        display(ps2);
        // Mutate and re-display
        ps1.setAge(6);
        display(ps1);
        ps1.setAge(7);
        display(ps1);   
    }

    public static void display(PreschoolStudent ps){
        System.out.print("Student ID: " + ps.getIdNumber());
        System.out.println("  |  Student age: " + ps.getAge());
        System.out.println();
    }
}

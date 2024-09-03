import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        String name;
        double gpa;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name >> ");
        name = input.nextLine();
        System.out.print("Enter your grade point average >> ");
        gpa = input.nextDouble();

        displayMessage(name, gpa);

        input.close();
    }

    public static void displayMessage(String name, double gpa){
        double credit = gpa * 10;

        System.out.printf("Congradulations " + name + "! Your GPA of " + gpa + " has earned you a credit of $%.2f\n", credit);
    }
}

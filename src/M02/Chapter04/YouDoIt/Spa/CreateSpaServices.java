// Wyatt H. Pearce
// Chapter 4 page 127 - CreateSpaServices.java
import java.util.Scanner;

public class CreateSpaServices {
    public static void main(String[] args) {
        // Fields
        String service;
        double price;

        // Objects
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner keyboard = new Scanner(System.in);

        // User input for firstService
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();

        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        // User input for secondService
        keyboard.nextLine();
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();

        secondService.setServiceDescription(service);
        secondService.setPrice(price);

        // Display details for firstService
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

        // Display details for secondService
        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

        // Closing the scanner
        keyboard.close();
    }
}

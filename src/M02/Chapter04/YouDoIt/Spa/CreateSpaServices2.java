// Wyatt H. Pearce
// Chapter 4 page 130 - CreateSpaServices2.java refactoring
import java.util.Scanner;

public class CreateSpaServices2 {
    public static void main(String[] args) {

        // Objects
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner keyboard = new Scanner(System.in);

        firstService = getData(firstService, keyboard);
        secondService = getData(secondService, keyboard);

        // Display details for firstService
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

        // Display details for secondService
        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

        // Closing the scanner
        keyboard.close();
    }

    public static SpaService getData(SpaService service, Scanner input) {
        String serviceDescription;
        double price;

        System.out.print("Enter service >> ");
        serviceDescription = input.nextLine();
        System.out.print("Enter price >> ");
        price = input.nextDouble();
        input.nextLine();

        service.setServiceDescription(serviceDescription);
        service.setPrice(price);

        return service;
    }
}

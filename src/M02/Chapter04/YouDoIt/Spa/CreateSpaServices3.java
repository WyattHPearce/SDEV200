// Wyatt H. Pearce
// Chapter 4 page 133 - CreateSpaServices3.java refactoring
import java.util.Scanner;

public class CreateSpaServices3 {
    public static void main(String[] args) {

        // Objects
        SpaService2 firstService = new SpaService2();
        SpaService2 secondService = new SpaService2();
        SpaService2 thirdService = new SpaService2("facial", 22.99);
        Scanner keyboard = new Scanner(System.in);

        firstService = getData(firstService, keyboard);
        //secondService = getData(secondService, keyboard);

        // Display details for firstService
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

        // Display details for secondService
        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

        // Display third service
        System.out.println("Third service details: ");
        System.out.println(thirdService.getServiceDescription() + " $" + thirdService.getPrice());

        // Closing the scanner
        keyboard.close();
    }

    public static SpaService2 getData(SpaService2 service, Scanner input) {
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

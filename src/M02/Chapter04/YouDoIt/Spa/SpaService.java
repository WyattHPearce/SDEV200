// Wyatt H. Pearce
// Chapter 4 page 123 - SpaService.java

public class SpaService {
    private String serviceDescription;
    private double price;

    // Setters
    public void setServiceDescription(String description) {
        serviceDescription = description;
    }

    public void setPrice(double servicePrice) {
        price = servicePrice;
    }

    // Getters
    public String getServiceDescription(){
        return serviceDescription;
    }

    public double getPrice(){
        return price;
    }
}

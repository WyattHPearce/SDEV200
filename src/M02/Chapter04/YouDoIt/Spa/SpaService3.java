// Wyatt H. Pearce
// Chapter 4 page 138 - SpaService3.java

public class SpaService3 {
    private String serviceDescription;
    private double price;

    // Primary constructor
    public SpaService3(String desc, double pr) {
        serviceDescription = desc;
        price = pr;
    }
    // Setting Defaults Constructor
    public SpaService3() {
        this("XXX", 0);
    }

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

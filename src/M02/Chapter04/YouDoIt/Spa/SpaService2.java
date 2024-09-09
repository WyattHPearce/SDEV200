// Wyatt H. Pearce
// Chapter 4 page 133 - SpaService2.java

public class SpaService2 {
    private String serviceDescription;
    private double price;

    // Constructor - setting defaults
    public SpaService2() {
        serviceDescription = "XXX";
        price = 0;
    }
    // Overloaded constructor - user set
    public SpaService2(String desc, double pr) {
        serviceDescription = desc;
        price = pr;
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

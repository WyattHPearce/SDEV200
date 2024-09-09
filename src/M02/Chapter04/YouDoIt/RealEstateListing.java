// Wyatt H. Pearce
// Chapter04 M02 - RealEstateListing.java

public class RealEstateListing {
    // Fields
    private int listingNumber;
    private double price;
    private HouseData houseData;

    // Constructor
    public RealEstateListing(int listingNumber, double price, String address, int squareFootage){
        this.listingNumber = listingNumber;
        this.price = price;
        houseData = new HouseData(address, squareFootage);
    }

    // Display method
    public void display(){
        System.out.println("Listing number: #" + listingNumber);
        System.out.println("Selling for: $" + price);
        System.out.println("Address: " + houseData.streetAddress);
        System.out.println("Square Footage: " + houseData.squareFootage);
    }

    // Inner class
    private class HouseData {
        private String streetAddress;
        private int squareFootage;

        public HouseData(String address, int sqft){
            this.streetAddress = address;
            this.squareFootage = sqft;
        }
    }
}

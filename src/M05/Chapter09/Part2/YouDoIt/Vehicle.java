/* 
    Author: Wyatt H. Pearce
    Last edit: 10-2-2024
    Program: SDEV200 Chapter09 M05 p.355
    YouDoIt: "Creating an Abstract Class"
*/

public abstract class Vehicle{
    // Fields
    private String powerSource;
    private int wheels;
    protected int price;

    // Constructor
    public Vehicle(String powerSource, int wheels){
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }

    // Getters
    public String getPowerSource(){
        return powerSource;
    }
    public int getWheels(){
        return wheels;
    }
    public int getPrice(){
        return price;
    }

    // Setters
    public void setPowerSource(String source){
        powerSource = source;
    }
    public void setWheels(int numWeheels){
        wheels = numWeheels;
    }
    public abstract void setPrice();
}
public class Car {
    // Fields
    private int year;
    private Model model;
    private Color color;

    // Constructor
    public Car(int year, Model model, Color color){
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public void display(){
        System.out.println("Car is a " + year + " " + color + " " + model);
    }
}

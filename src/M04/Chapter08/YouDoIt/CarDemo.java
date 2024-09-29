/* 
    Author: Wyatt H. Pearce
    Last edit: 9-29-2024
    Program: SDEV200 Chapter08 M04 p.315 - CarDemo.java
*/

public class CarDemo {
    public static void main(String[] args) {
        Car firstCar = new Car(2021, Model.MINIVAN, Color.BLUE);
        Car secondCar = new Car(2024, Model.CONVERTIBLE, Color.RED);
        firstCar.display();
        secondCar.display();
    }
}

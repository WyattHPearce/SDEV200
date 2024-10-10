/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter09 M05 p.353
    Figure: 9-33
*/

public class UseAnimals{
    public static void main(String[] args) {
        // Instantiate objects
        Dog myDog = new Dog();
        Cow myCow = new Cow();
        Snake mySnake = new Snake();

        // Mutate objects
        myDog.setName("My dog Murphy");
        myCow.setName("My cow Elsie");
        mySnake.setName("My snake Sammy");

        // Display object information
        System.out.print(myDog.getName() + " says ");
        myDog.speak();
        System.out.print(myCow.getName() + " says ");
        myCow.speak();
        System.out.print(mySnake.getName() + " says ");
        mySnake.speak();
    }
}

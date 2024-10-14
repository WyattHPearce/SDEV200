/* 
    Author: Wyatt H. Pearce
    Last edit: 10-12-2024
    IvyTech Class: SDEV200 
    Description:
    This is the parent class for entities within the system with a name.
*/

public class Entity {
    // Field
    private String name;

    // Constructor
    public Entity(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}
/* 
    Author: Wyatt H. Pearce
    Last edit: 10-9-2024
    Program: SDEV200 Chapter10 M06 p.424
    YouDoIt: "Extending a Class That Throws Exceptions"
*/

public class VegetarianMenu extends Menu{
    String[] vegEntreeChoices = {
        "Spinach Lasagna",
        "Cheese Enchiladas",
        "Fruit Plate"
    };

    public VegetarianMenu(){
        super();
        for(int i = 0; i < vegEntreeChoices.length; i++){
            entreeChoices[i] = vegEntreeChoices[i];
        }
    }
}

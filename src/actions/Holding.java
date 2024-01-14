package actions;

import childclasses.Person;
import parentclasses.Action;
import parentclasses.UObject;

public class Holding extends Action {

    UObject heldUObject;

    public Holding(String actionName) {
        super(actionName);
    }

    public void holding(Person person, UObject UObject){
        if(person.getInventory().contains(UObject)){
            person.addDoing(this);
            heldUObject = UObject;
        } else {
            System.out.println("nothing to hold!");
        }
    }

    @Override
    public String toString(){
        return super.toString() + " " + heldUObject.getName();
    }

}

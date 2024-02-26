package actions;

import childclasses.Person;
import exceptions.ItemNotInPlaceException;
import parentclasses.Action;
import parentclasses.UObject;

public class Holding extends Action {

    UObject heldUObject;

    public Holding(String actionName) {
        super(actionName);
    }

    public void holding(Person person, UObject UObject) throws ItemNotInPlaceException{
        if(person.getInventory().contains(UObject)){
            person.addDoing(this);
            heldUObject = UObject;
        } else {
            throw new ItemNotInPlaceException(person, UObject);
        }
    }

    @Override
    public String toString(){
        return super.toString() + " " + heldUObject.getName();
    }

}

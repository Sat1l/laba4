package actions;

import childclasses.Person;
import exceptions.ItemNotInPlaceException;
import parentclasses.Action;
import parentclasses.Location;
import parentclasses.UObject;

public class Bring extends Action {

    public Bring(String actionName) {
        super(actionName);
    }

    public void bring(Person person, UObject uObject, Location location) throws ItemNotInPlaceException{
        if (person.getInventory().contains(uObject)){
            person.addDoing(this);
            person.removeInventory(uObject);
            person.removeDoing(this);
            location.addInventory(uObject);
            person.setLocation(location);
            System.out.println(person.getName() + " brought " + uObject.getName() + " to " + location.getLocname());
        } else {
            throw new ItemNotInPlaceException(person, uObject);
        }
    }
}

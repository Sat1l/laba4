package actions;

import childclasses.Person;
import exceptions.ItemNotInPlaceException;
import parentclasses.Action;
import parentclasses.Location;
import parentclasses.UObject;

import java.util.Random;

public class Bring extends Action {

    public Bring(String actionName) {
        super(actionName);
    }

    public Boolean bring(Person person, UObject uObject, Location location) throws ItemNotInPlaceException{
        if (person.getInventory().contains(uObject)){
            person.addDoing(this);
            person.removeInventory(uObject);
            person.removeDoing(this);
            location.addObject(uObject);
            person.setLocation(location);
            System.out.println(person.getName() + " brought " + uObject.getName() + " to " + location.getLocname());
            return Boolean.TRUE;
        } else {
            throw new ItemNotInPlaceException(person, uObject);
        }
    }
}

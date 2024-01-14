package actions;

import childclasses.Person;
import parentclasses.Action;
import parentclasses.Location;
import parentclasses.UObject;

import java.util.Random;

public class Bring extends Action {

    public Bring(String actionName) {
        super(actionName);
    }

    public void bring(Person person, UObject UObject, Location location){
        if (person.getInventory().contains(UObject)){
            person.addDoing(this);
            Random random = new Random();
            float f = random.nextFloat();
            if (f > 0.1f){
                person.removeInventory(UObject);
                person.removeDoing(this);
                location.addObject(UObject);
                person.setLocation(location);
                System.out.println(person.getName() + " brought " + UObject.getName() + " to " + location.getLocname());
            } else {
                person.removeInventory(UObject);
                person.removeDoing(this);
                person.setLocation(location);
                System.out.println(person.getName() + " lost " + UObject.getName() + " on its way to the " + location.getLocname());
            }
        } else {
            System.out.println(person.getName() + " does not have this thing to bring it");
        }
    }
}

package actions;

import childclasses.Furniture;
import childclasses.Person;
import exceptions.LocationMissmatchException;
import parentclasses.Action;

public class Sit extends Action {

    Furniture sittingOn;

    public Sit(String actionName) {
        super(actionName);
    }

    public void sit(Person person, Furniture toSit) throws LocationMissmatchException{
        toSit.addSitting(person);
        if (person.getLocation() == toSit.getLocation()) {
            sittingOn = toSit;
        } else {
            throw new LocationMissmatchException(person, toSit);
        }
        person.addDoing(this);
    }

    @Override
    public String toString(){
        return super.getActionName() + sittingOn.toString();
    }

}

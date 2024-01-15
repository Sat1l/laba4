package actions;

import childclasses.Furniture;
import childclasses.Person;
import parentclasses.Action;

public class Sit extends Action {

    Furniture sittingOn;

    public Sit(String actionName) {
        super(actionName);
    }

    public void sit(Person person, Furniture toSit){
        toSit.addSitting(person);
        if (person.getLocation() == toSit.getLocation()) {
            sittingOn = toSit;
        }
        person.addDoing(this);
    }

    @Override
    public String toString(){
        return super.getActionName() + sittingOn.toString();
    }

}

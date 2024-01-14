package actions;

import childclasses.Person;
import interfaces.Sittable;
import parentclasses.Action;

public class Sit extends Action {

    Sittable sittingOn;

    public Sit(String actionName) {
        super(actionName);
    }

    public void sit(Person person, Sittable toSit){
        toSit.addSitting(person);
        sittingOn = toSit;
        person.addDoing(this);
    }

    @Override
    public String toString(){
        return super.getActionName() + sittingOn.toString();
    }

}

package actions;

import childclasses.Person;
import interfaces.Sittable;
import parentclasses.Action;

public class Sit extends Action {

    public Sit(String actionName) {
        super(actionName);
    }

    public void sit(Person person, Sittable toSit){
        toSit.addSitting(person);
        person.addDoing(this);
    }

}

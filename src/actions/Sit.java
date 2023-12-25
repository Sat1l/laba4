package actions;

import ChildClasses.Person;
import Interfaces.Sittable;
import ParentClasses.Action;

public class Sit extends Action {

    public void sit(Person person, Sittable toSit){
        toSit.addSitting(person);
        person.addDoing(this);
    }

}

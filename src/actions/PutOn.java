package actions;

import ChildClasses.Clothing;
import ChildClasses.Person;
import ParentClasses.Action;

public class PutOn extends Action {

    public PutOn(String actionName) {
        super(actionName);
    }

    public void putOn(Person person, Clothing clothing){
        person.addDoing(this);
        person.addWears(clothing);
        System.out.println(person.getName() + " put on " + clothing.getName());
        person.removeDoing(this);
    }
}

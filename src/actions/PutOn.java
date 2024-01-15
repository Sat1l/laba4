package actions;

import childclasses.Clothing;
import childclasses.Person;
import parentclasses.Action;

public class PutOn extends Action {

    public PutOn(String actionName) {
        super(actionName);
    }

    public void putOn(Person person, Clothing clothing){
        person.addDoing(this);
        if (person.getLocation() == clothing.getLocation()) {
            person.addWears(clothing);
            System.out.println(person.getName() + " put on " + clothing.getName());
        }
        person.removeDoing(this);
    }
}

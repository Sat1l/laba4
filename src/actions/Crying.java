package actions;

import childclasses.Person;
import parentclasses.Action;

public class Crying extends Action {

    public Crying(String actionName) {
        super(actionName);
    }

    public void crying(Person person){
        person.addDoing(this);
    }

}

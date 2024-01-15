package actions;

import childclasses.Person;
import enums.Interest;
import parentclasses.Action;
import parentclasses.UObject;

public class FlipPages extends Action {
    public FlipPages(String actionName) {
        super(actionName);
    }

    public void flipPages(Person person, UObject journal, Interest interest){
        person.addDoing(this);
    }

}

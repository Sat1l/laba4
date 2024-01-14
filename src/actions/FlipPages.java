package actions;

import childclasses.Journal;
import childclasses.Person;
import enums.INTEREST;
import parentclasses.Action;

public class FlipPages extends Action {
    public FlipPages(String actionName) {
        super(actionName);
    }

    public void flipPages(Person person, Journal journal, INTEREST interest){
        person.addDoing(this);
    }

}

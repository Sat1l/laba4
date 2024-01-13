package actions;

import ChildClasses.Journal;
import ChildClasses.Person;
import Enums.INTEREST;
import ParentClasses.Action;

public class FlipPages extends Action {
    public FlipPages(String actionName) {
        super(actionName);
    }

    public void flipPages(Person person, Journal journal, INTEREST interest){
        person.addDoing(this);
    }

}

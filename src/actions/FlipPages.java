package actions;

import childclasses.Person;
import enums.Interest;
import parentclasses.Action;
import parentclasses.UObject;

public class FlipPages extends Action {

    UObject journal;

    Interest interest;
    public FlipPages(String actionName) {
        super(actionName);
    }

    public void flipPages(Person person, UObject journal, Interest interest){
        person.addDoing(this);
        this.journal = journal;
        this.interest = interest;
    }

    @Override
    public String toString(){
        return "flips through " + journal.getName() + " with " + interest.toString() + " interest ";
    }

}

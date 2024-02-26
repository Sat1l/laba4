package actions;

import childclasses.Person;
import parentclasses.Action;

public class ThinkAbout extends Action {

    Object thinkingOf;

    public ThinkAbout(String actionName) {
        super(actionName);
    }

    public void thinkAbout(Person person, Object toThinkOf){
        thinkingOf = toThinkOf;
        person.addDoing(this);
    }
}

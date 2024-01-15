package actions;

import childclasses.Person;
import childclasses.TV;
import parentclasses.Action;

public class WatchTV extends Action {

    TV watchedTV;

    public WatchTV(String actionName) {
        super(actionName);
    }

    public void watchTV(Person viewer, TV tv) {
        if (viewer.getLocation() == tv.getLocation()) {
            viewer.addDoing(this);
        }
        watchedTV = tv;
    }

    @Override
    public String toString() {
        return super.toString() + " " + watchedTV.getName();
    }
}

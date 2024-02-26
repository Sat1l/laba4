package actions;

import childclasses.Person;
import childclasses.TV;
import exceptions.LocationMissmatchException;
import interfaces.HasName;
import parentclasses.Action;

public class WatchAt extends Action {

    HasName watchedO;

    public WatchAt(String actionName) {
        super(actionName);
    }

    public void watchAt(Person viewer, HasName o) {
        viewer.addDoing(this);
        watchedO = o;
    }

    @Override
    public String toString() {
        return super.toString() + " " + watchedO.getName();
    }
}

package actions;

import ChildClasses.Person;
import ChildClasses.TV;
import ParentClasses.Action;

public class WatchTV extends Action {

    String actionName;

    TV watchedTV;

    public WatchTV(String actionName) {
        super(actionName);
    }

    public void watchTV(Person viewer, TV tv){
        viewer.addDoing(this);
        watchedTV = tv;
    }

    @Override
    public String toString(){
        return this.actionName + " " + this.watchedTV;
    }
}

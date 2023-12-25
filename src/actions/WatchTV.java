package actions;

import ChildClasses.Person;
import ChildClasses.TV;
import ParentClasses.Action;

public class WatchTV extends Action {

    public void watchTV(Person viewer, TV tv){
        viewer.addDoing(this);
    }

}

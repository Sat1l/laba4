package actions;

import ChildClasses.Person;
import ParentClasses.Action;
import ParentClasses.Object;

public class Receive extends Action {

    public void receive(Person receiver, Object object){
        receiver.addDoing(this);
        receiver.addInventory(object);
        receiver.removeDoing(this);
    }

}

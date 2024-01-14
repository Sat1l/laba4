package actions;

import childclasses.Person;
import parentclasses.Action;
import parentclasses.UObject;

public class Receive extends Action {

    public Receive(String actionName) {
        super(actionName);
    }

    public void receive(Person receiver, UObject UObject){
        receiver.addDoing(this);
        receiver.addInventory(UObject);
        receiver.removeDoing(this);
    }

}

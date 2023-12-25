package actions;

import ChildClasses.Person;
import ParentClasses.Action;
import ParentClasses.Object;

public class Give extends Action {

    public void give(Person giver, Person receiver, Object object){
        if (giver.getInventory().contains(object)) {
            giver.addDoing(this);
            giver.removeInventory(object);
            Receive receive = new Receive();
            receive.receive(receiver, object);
            giver.removeDoing(this);
        }
    }

}

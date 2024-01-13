package actions;

import ChildClasses.Person;
import ParentClasses.Action;
import ParentClasses.Object;

public class Give extends Action {

    public Give(String actionName) {
        super(actionName);
    }

    public void give(Person giver, Person receiver, Object object){
        if (giver.getInventory().contains(object)) {
            giver.addDoing(this);
            giver.removeInventory(object);
            Receive receive = new Receive("Receiving");
            receive.receive(receiver, object);
            giver.removeDoing(this);
            System.out.println(giver.getName() + " gave " + receiver.getName() + " " + object);
        } else {
            System.out.println(giver.getName() + " wanted to give " + receiver.getName() + " " + object + " but they didnt have it");
        }
    }

}

package actions;

import childclasses.Person;
import exceptions.ItemNotInPlaceException;
import parentclasses.Action;
import parentclasses.UObject;

public class Give extends Action{

    public Give(String actionName) {
        super(actionName);
    }

    public void give(Person giver, Person receiver, UObject UObject) throws ItemNotInPlaceException{
        if (giver.getInventory().contains(UObject)) {
            giver.addDoing(this);
            giver.removeInventory(UObject);
            Receive receive = new Receive("Receiving");
            receive.receive(receiver, UObject);
            giver.removeDoing(this);
            System.out.println(giver.getName() + " gave " + receiver.getName() + " " + UObject.getName());
        } else {
            throw new ItemNotInPlaceException(giver, UObject);
        }
    }

}

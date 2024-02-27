package actions;

import childclasses.Person;
import exceptions.ItemNotInPlaceException;
import parentclasses.*;

public class BringTogether extends Action {

    public BringTogether(String actionName) {
        super(actionName);
    }

    public void bringTogether(Couple couple, UObject uObject, Location location) throws ItemNotInPlaceException{
        if (couple.getInventory().contains(uObject)){
            ItemMover itemMover = new ItemMover();
            Person husband = couple.getHusband();
            Person wife = couple.getWife();
            husband.addDoing(this);
            wife.addDoing(this);
            itemMover.moveUObjectToLoc(uObject, location);
            husband.removeDoing(this);
            husband.setLocation(location);
            wife.setLocation(location);
            System.out.println(couple.getName() + " brought " + uObject.getName() + " to " + location.getLocname());
        } else {
            throw new ItemNotInPlaceException(couple, uObject);
        }
    }

}

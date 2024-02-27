package actions;

import childclasses.Person;
import exceptions.ItemNotInPlaceException;
import parentclasses.Action;
import parentclasses.Couple;
import parentclasses.Location;
import parentclasses.UObject;

public class BringTogether extends Action {

    public BringTogether(String actionName) {
        super(actionName);
    }

    public void bringTogether(Couple couple, UObject uObject, Location location) throws ItemNotInPlaceException{
        if (couple.getInventory().contains(uObject)){
            Person husband = couple.getHusband();
            Person wife = couple.getWife();
            husband.addDoing(this);
            wife.addDoing(this);
            husband.removeInventory(uObject);
            husband.removeDoing(this);
            location.addInventory(uObject);
            husband.setLocation(location);
            wife.setLocation(location);
            System.out.println(couple.getName() + " brought " + uObject.getName() + " to " + location.getLocname());
        } else {
            throw new ItemNotInPlaceException(couple, uObject);
        }
    }

}

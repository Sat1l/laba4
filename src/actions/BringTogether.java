package actions;

import childclasses.Person;
import parentclasses.Action;
import parentclasses.Couple;
import parentclasses.Location;
import parentclasses.UObject;

import java.util.Random;

public class BringTogether extends Action {

    public BringTogether(String actionName) {
        super(actionName);
    }

    public void bringTogether(Couple couple, UObject UObject, Location location){
        if (couple.getHusband().getInventory().contains(UObject)){ //yes they bring thing as a couple but actually the man carries the thing
            Person husband = couple.getHusband();
            Person wife = couple.getWife();
            husband.addDoing(this);
            wife.addDoing(this);
            Random random = new Random();
            float f = random.nextFloat();
            if (f > 0.1f){
                husband.removeInventory(UObject);
                husband.removeDoing(this);
                location.addObject(UObject);
                husband.setLocation(location);
                wife.setLocation(location);
                System.out.println(couple.getName() + " brought " + UObject.getName() + " to " + location.getLocname());
            } else {
                husband.removeInventory(UObject);
                husband.removeDoing(this);
                wife.removeDoing(this);
                husband.setLocation(location);
                wife.setLocation(location);
                System.out.println(couple.getName() + " lost " + UObject.getName() + " on their way to the " + location.getLocname());
            }
        } else {
            System.out.println(couple.getName() + " dont have this thing to bring it");
        }
    }

}

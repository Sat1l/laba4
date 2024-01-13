package actions;

import ChildClasses.Person;
import ParentClasses.Action;
import ParentClasses.Couple;
import ParentClasses.Location;
import ParentClasses.Object;

import java.util.Random;

public class BringTogether extends Action {

    public BringTogether(String actionName) {
        super(actionName);
    }

    public void bringTogether(Couple couple, Object object, Location location){
        if (couple.getHusband().getInventory().contains(object)){ //yes they bring thing as a couple but actually the man carries the thing
            Person husband = couple.getHusband();
            Person wife = couple.getWife();
            husband.addDoing(this);
            wife.addDoing(this);
            Random random = new Random();
            float f = random.nextFloat();
            if (f > 0.9){
                husband.removeInventory(object);
                husband.removeDoing(this);
                location.addObject(object);
                husband.setLocation(location);
                wife.setLocation(location);
                System.out.println(couple.getName() + " brought " + object.getName() + " to " + location.getLocname());
            } else {
                husband.removeInventory(object);
                husband.removeDoing(this);
                wife.removeDoing(this);
                husband.setLocation(location);
                wife.setLocation(location);
                System.out.println(couple.getName() + " lost " + object.getName() + " on their way to the " + location.getLocname());
            }
        }
    }

}

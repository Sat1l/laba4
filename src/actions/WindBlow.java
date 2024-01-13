package actions;

import Enums.DIRECTION;
import Enums.STRENGTH;
import ParentClasses.Action;
import ParentClasses.Conditions;

public class WindBlow extends Action {

    public WindBlow(String actionName) {
        super(actionName);
    }

    public void windBlow(Conditions conditions, DIRECTION direction, STRENGTH strength){
        conditions.setWindDirection(direction);
        conditions.setWindStrength(strength);
        System.out.println("The " + strength.toString() + " window blew from " + direction);
    }

}

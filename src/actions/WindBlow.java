package actions;

import enums.Direction;
import enums.Strength;
import parentclasses.Action;
import parentclasses.Conditions;

public class WindBlow extends Action {

    public WindBlow(String actionName) {
        super(actionName);
    }

    public void windBlow(Conditions conditions, Direction direction, Strength strength){
        conditions.setWindDirection(direction);
        conditions.setWindStrength(strength);
        System.out.println("The " + strength.toString() + " window blew from " + direction);
    }

}

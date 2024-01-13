package actions;

import Enums.AMOUNT;
import ParentClasses.Action;
import ParentClasses.Conditions;

public class NewTuchi extends Action {

    public NewTuchi(String actionName) {
        super(actionName);
    }

    public void newTuchi(Conditions conditions){
        int curclouds = conditions.getCloudsAmount().toInt();
        if(curclouds < 3){
            conditions.setCloudsAmount(AMOUNT.fromInt(curclouds++));
            System.out.println("New clouds came up and now there is " + conditions.getCloudsAmount().toString() + " of them");
        } else {
            System.out.println("New clouds came up but there is already A LOT of them");
        }
    }
}

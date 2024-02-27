package actions;

import enums.Amount;
import parentclasses.Action;
import parentclasses.Conditions;

public class NewTuchi extends Action {

    public NewTuchi(String actionName) {
        super(actionName);
    }

    public void newTuchi(Conditions conditions){
        int curclouds = conditions.getCloudsAmount().toInt();
        if(curclouds < 2){
            conditions.setCloudsAmount(Amount.PLENTY);
            System.out.println("New tuchu came up and now there is " + conditions.getCloudsAmount().toString() + " of them");
        } else {
            System.out.println("New tuchi came up but there is already A LOT of them");
        }
    }
}

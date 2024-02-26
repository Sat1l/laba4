package actions;

import interfaces.HasInventory;
import interfaces.HasLocation;
import parentclasses.Action;
import parentclasses.UObject;

public class Buy extends Action {
    public Buy(String actionName){
        super(actionName);
    }

    public void buy(HasInventory buyer, Class<?> item, HasInventory seller){
        if (seller.getAmountOfInInventory(item) > 0){

        }
    }


}

package actions;

import childclasses.Person;
import childclasses.Shop;
import interfaces.HasPrice;
import parentclasses.Action;

import java.util.LinkedList;

public class Sell extends Action {

    public Sell(String actionName){
        super(actionName);
    }

    public void sell(Shop seller, LinkedList<HasPrice> cart, Person buyer){
        for(HasPrice item:cart){
            seller.getSelling().remove(item);
        }
    }

}

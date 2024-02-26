package actions;

import childclasses.Person;
import parentclasses.Action;

public class Call extends Action {

    Person party1;

    Person party2;

    public Call(String actionName){
        super(actionName);
    }

    public void call(Person caller, Person contact){
        this.party1 = caller;
        this.party2 = contact;
        caller.addDoing(this);
        contact.addDoing(this);
    }

    public  void hangUp(Person hanger, Person hangedOn){
        if ((party1 != null) && (party2 != null) && (hanger == party1 || hanger == party2) && (hangedOn == party1 || hangedOn == party2)){
            hanger.removeDoing(this);
            hangedOn.removeDoing(this);
            party1 = null;
            party2 = null;
        }
    }

}

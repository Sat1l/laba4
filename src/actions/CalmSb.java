package actions;

import childclasses.Person;
import enums.Condition;
import exceptions.LocationMissmatchException;
import parentclasses.Action;

import java.util.Random;

public class CalmSb extends Action{

    public CalmSb(String actionName){
        super(actionName);
    }

    public void calmSb(Person calmer, Person toCalm) {
        try {
            if(calmer.getLocation() != toCalm.getLocation()){
                throw new LocationMissmatchException(calmer, toCalm);
            }
            calmer.addDoing(this);
            Random random = new Random();
            float f = random.nextFloat();
            System.out.println(calmer.getName() + " is trying to calm " + toCalm.getName());
            if (f > 0.1f){
                toCalm.setCondition(Condition.CALM);
                System.out.println(toCalm.getName() + " is now calm");
            } else {
                toCalm.setCondition(Condition.BUYANIT);
                System.out.println(toCalm.getName() + " is now buyanit");
            }
            toCalm.setCondition(Condition.CALM);
            calmer.removeDoing(this);
        } catch (LocationMissmatchException e) {
            throw new RuntimeException(e);
        }
    }
}

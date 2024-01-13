package actions;

import ChildClasses.Person;
import Enums.CONDITION;
import ParentClasses.Action;
import ParentClasses.Object;

import java.util.Random;

public class EatSedative extends Action {

    public EatSedative(String actionName) {
        super(actionName);
    }

    public void eatSedative(Person person) {
        Object res = hasSedative(person);
        if(res != null){
            person.addDoing(this);
            Random random = new Random();
            float f = random.nextFloat();
            person.removeInventory(res);
            if (f > 0.8f){
                person.setCondition(CONDITION.CALM);
            } else {
                person.setCondition(CONDITION.BUYANIT);
            }
        }
    }
    private Object hasSedative(Person person){
        Object toret = null;
        for (Object item : person.getInventory()) {
            if (item.toString().equals("Sedative")) {
                toret = item;
                break;
            }
        }
        return toret;
    }
}

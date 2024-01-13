package actions;

import ChildClasses.Person;
import ParentClasses.Action;
import ParentClasses.Object;

public class Holding extends Action {

    String actionName;
    Object heldObject;

    public Holding(String actionName) {
        super(actionName);
    }

    public void holding(Person person, Object object){
        if(person.getInventory().contains(object)){
            person.addDoing(this);
            heldObject = object;
        } else {
            System.out.println("nothing to hold!");
        }
    }

    @Override
    public String toString(){
        return this.actionName + " " + this.heldObject;
    }

}

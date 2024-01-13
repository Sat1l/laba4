package actions;

import ChildClasses.Person;
import ParentClasses.Action;

import java.util.Random;

public class ThinkToDo extends Action {

    public ThinkToDo(String actionName) {
        super(actionName);
    }

    public boolean thinkToDo(Person person, Action action){
        Random random = new Random();
        person.addDoing(this);
        int count = 0;
        float f = 0f;
        while (true){
            f = random.nextFloat();
            if (f > 0.5f){
                System.out.println(person.getName() + " decided to " + action.toString());
                person.removeDoing(action);
                return true;
            } else {
                count++;
                if (count >= 2) {
                    System.out.println(person.getName() + " decided not to " + action.toString());
                    person.removeDoing(action);
                    return false;
                }
            }
        }

    }

}

package actions;

import childclasses.Person;
import parentclasses.Action;

import java.util.Random;

public class ThinkToDo extends Action {

    public ThinkToDo(String actionName) {
        super(actionName);
    }

    public void thinkToDo(Person person, Action action){
        Random random = new Random();
        person.addDoing(this);
        int count = 0;
        float f;
        while (true){
            f = random.nextFloat();
            if (f > 0.5f){
                System.out.println(person.getName() + " decided to " + action.toString());
                person.removeDoing(action);
                person.addDoing(action);
                return;
            } else {
                count++;
                if (count >= 2) {
                    System.out.println(person.getName() + " decided not to " + action.toString());
                    person.removeDoing(action);
                    return;
                }
            }
        }
    }
}

package actions;

import ChildClasses.Person;
import ParentClasses.Action;

public class Say extends Action {

    public Say(String actionName) {
        super(actionName);
    }

    public void say(Person person, String phrase){

        person.addDoing(this);
        System.out.println(person.getName() + " says:");
        String[] words = phrase.split(" ");
        for (String word : words) {
            System.out.print(" " + word);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        person.removeDoing(this);
    }
}

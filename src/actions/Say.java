package actions;

import childclasses.Person;
import parentclasses.Action;

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
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e); //autocompleted code not me though
            }
        }
        person.removeDoing(this);
    }
}

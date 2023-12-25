package actions;

import ChildClasses.Person;
import ParentClasses.Action;

public class Say extends Action {

    public void say(Person person, String phrase){

        person.addDoing(this);
        System.out.println(person.getName() + " said:" + phrase);
        person.removeDoing(this);

    }
}

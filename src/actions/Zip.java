package actions;

import ChildClasses.Jacket;
import ChildClasses.Person;
import Enums.ZIPPERSTAT;
import ParentClasses.Action;

import java.util.Random;

public class Zip extends Action {

    public void zip(Person person, Jacket jacket) {
        if (person.getWears().contains(jacket)) {
            Random random = new Random();
            person.addDoing(this);
            ZIPPERSTAT zipperstat = jacket.getZipperstat();
            if (!jacket.getIsZipepd() && (zipperstat == ZIPPERSTAT.NORMAL)) {
                float f = random.nextFloat();
                if (f <= 0.1) {
                    jacket.setIsZipped(true);
                    jacket.setZipperstat(ZIPPERSTAT.STUCK);
                    person.removeDoing(this);

                    System.out.println("The " + jacket.getName() + " zip got stuck!");
                } else {
                    System.out.println(person.getName() + " zipped the " + jacket.getName());
                }
            } else {
                System.out.println(person.getName() + " tried to zip " + jacket.getName() + " but it was either already zipped or stuck");
            }
        } else {
            System.out.println("oopsie no jacket");
        }
    }
}

package actions;

import childclasses.Jacket;
import childclasses.Person;
import enums.ZIPPERSTAT;
import parentclasses.Action;

import java.util.Random;

public class Zip extends Action {

    public Zip(String actionName) {
        super(actionName);
    }

    public void zip(Person person, Jacket jacket) {
        if (person.getWears().contains(jacket)) {
            Random random = new Random();
            person.addDoing(this);
            ZIPPERSTAT zipperstat = jacket.getZipperstat();
            if (!jacket.getIsZipepd() && (zipperstat == ZIPPERSTAT.NORMAL)) {
                float f = random.nextFloat();
                if (f <= 0.1f) {
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

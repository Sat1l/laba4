package actions;

import childclasses.Jacket;
import childclasses.Person;
import enums.ZIPPERSTAT;
import parentclasses.Action;

import java.util.Random;

public class Unzip extends Action {

    public Unzip(String actionName) {
        super(actionName);
    }

    public void unzip(Person person, Jacket jacket) {
        if (person.getWears().contains(jacket)) {
            Random random = new Random();
            person.addDoing(this);
            ZIPPERSTAT zipperstat = jacket.getZipperstat();
            if (jacket.getIsZipepd() && (zipperstat == ZIPPERSTAT.NORMAL)) {
                float f = random.nextFloat();
                if (f <= 0.1f) {
                    jacket.setIsZipped(false);
                    jacket.setZipperstat(ZIPPERSTAT.OFFRAILS);
                    person.removeDoing(this);

                    System.out.println("The " + jacket.getName() + " zip got off the rails!");
                } else {
                    System.out.println(person.getName() + " unzipped the " + jacket.getName());
                }
            } else {
                System.out.println(person.getName() + " tried to unzip " + jacket.getName() + " but it was either already unzipped or off the rails");
            }
        } else {
            System.out.println("oopsie no jacket");
        }
    }
}

package actions;

import childclasses.Jacket;
import childclasses.Person;
import enums.ZipperStat;
import exceptions.ItemNotInPlaceException;
import parentclasses.Action;

import java.util.Random;

public class Unzip extends Action {

    public Unzip(String actionName) {
        super(actionName);
    }

    public void unzip(Person person, Jacket jacket) throws ItemNotInPlaceException {
        if (person.getWears().contains(jacket)) {
            Random random = new Random();
            person.addDoing(this);
            ZipperStat zipperstat = jacket.getZipperstat();
            if (jacket.getIsZipepd() && (zipperstat == ZipperStat.NORMAL)) {
                float f = random.nextFloat();
                if (f <= 0.1f) {
                    jacket.setIsZipped(false);
                    jacket.setZipperstat(ZipperStat.OFFRAILS);
                    person.removeDoing(this);

                    System.out.println("The " + jacket.getName() + " zip got off the rails!");
                } else {
                    System.out.println(person.getName() + " unzipped the " + jacket.getName());
                }
            } else {
                System.out.println(person.getName() + " tried to unzip " + jacket.getName() + " but it was either already unzipped or off the rails");
            }
        } else {
            throw new ItemNotInPlaceException(person, jacket);
        }
    }
}

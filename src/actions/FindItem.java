package actions;

import childclasses.Person;
import childclasses.Shelve;
import parentclasses.Action;
import parentclasses.UObject;

import java.util.Random;

public class FindItem extends Action {

    public FindItem(String actionName) {
        super(actionName);
    }

    public void findItem(Person person, Shelve somethingWithInventory, UObject UObjectToFind) {
        if (person.getLocation() == somethingWithInventory.getLocation()) {
            Random random = new Random();
            person.addDoing(this);
            int count = 0;
            float f;
            while (true) {
                f = random.nextFloat();
                if (f < 0.8f) {
                    if (somethingWithInventory.getInventory().contains(UObjectToFind) && (count < 3)) {
                        somethingWithInventory.removeInventory(UObjectToFind);
                        person.addInventory(UObjectToFind);
                        System.out.println(person.getName() + " found " + UObjectToFind.getName() + " on/in a " + somethingWithInventory.getName());
                        break;
                    } else {
                        person.removeDoing(this);
                        System.out.println("Either person gave up or the item is not there");
                        break;
                    }

                } else {
                    System.out.println(person.getName() + " searches for " + UObjectToFind.getName() + " on/in a " + somethingWithInventory.getName());
                    count += 1;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e); //autocompleted code not me though
                    }
                }
            }
        }
    }

}

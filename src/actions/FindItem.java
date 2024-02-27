package actions;

import childclasses.Person;
import childclasses.Storage;
import exceptions.ItemNotInPlaceException;
import exceptions.LocationMissmatchException;
import parentclasses.Action;
import parentclasses.UObject;

import java.util.Random;

public class FindItem extends Action {

    public FindItem(String actionName) {
        super(actionName);
    }

    public void findItem(Person person, Storage somethingWithInventory, UObject UObjectToFind) throws ItemNotInPlaceException, LocationMissmatchException {
        if (person.getLocation() != somethingWithInventory.getLocation()) {
            throw new LocationMissmatchException(person, somethingWithInventory);
        }
        Random random = new Random();
        person.addDoing(this);
        int count = 0;
        float f;
        while (count < 3) {
            f = random.nextFloat();
            if (f > 0.8f) {
                if (somethingWithInventory.getInventory().contains(UObjectToFind)) {
                    somethingWithInventory.removeInventory(UObjectToFind);
                    person.addInventory(UObjectToFind);
                    System.out.println(person.getName() + " found " + UObjectToFind.getName() + " on/in a " + somethingWithInventory.getName());
                    break;
                } else {
                    person.removeDoing(this);
                    throw new ItemNotInPlaceException(person, UObjectToFind);
                }
            } else {
                System.out.println(person.getName() + " searches for " + UObjectToFind.getName() + " on/in a " + somethingWithInventory.getName());
                count += 1;
                System.out.println(count);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e); //autocompleted code not me though
                }
            }
        }
            System.out.println(person.getName() + "gave up on finding the thing");
    }

}

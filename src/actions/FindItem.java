package actions;

import ChildClasses.Person;
import Interfaces.HasInventory;
import ParentClasses.Action;
import ParentClasses.Object;

import java.util.Random;

public class FindItem extends Action {

    public FindItem(String actionName) {
        super(actionName);
    }

    public void findItem(Person person, HasInventory somethingWithInventory, Object objectToFind){
        Random random = new Random();
        person.addDoing(this);
        int count = 0;
        float f;
        while (true) {
            f = random.nextFloat();
            if (f > 0.5f) {
               if (somethingWithInventory.getInventory().contains(objectToFind) && (count < 3)){
                   somethingWithInventory.removeInventory(objectToFind);
                   person.addInventory(objectToFind);
                   break;
               } else {
                   person.removeDoing(this);
                   System.out.println("Either person gave up or the item is not there");
                   break;
               }

            } else {
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

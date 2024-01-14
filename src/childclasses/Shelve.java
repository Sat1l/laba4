package childclasses;

import interfaces.HasInventory;
import parentclasses.Location;
import parentclasses.UObject;

import java.util.LinkedList;

public class Shelve extends UObject implements HasInventory {

    private LinkedList<UObject> inventory;

    public Shelve(String name, Location location){
        super(name, location);
        this.inventory = new LinkedList<UObject>();
    }

    @Override
    public LinkedList<UObject> getInventory() {
        return inventory;
    }

    @Override
    public void addInventory(UObject toAdd) {
        this.inventory.add(toAdd);
    }

    @Override
    public void removeInventory(UObject toRemove) {
        this.inventory.remove(toRemove);
    }
}

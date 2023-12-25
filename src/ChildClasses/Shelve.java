package ChildClasses;

import Interfaces.HasInventory;
import ParentClasses.Location;
import ParentClasses.Object;

import java.util.LinkedList;

public class Shelve extends Object implements HasInventory {

    private LinkedList<Object> inventory;

    public Shelve(String name, LinkedList<Object> inventory, Location location){
        super(name, location);
        this.inventory = inventory;
    }

    @Override
    public LinkedList<Object> getInventory() {
        return inventory;
    }

    @Override
    public void addInventory(Object toAdd) {
        this.inventory.add(toAdd);
    }

    @Override
    public void removeInventory(Object toRemove) {
        this.inventory.remove(toRemove);
    }
}

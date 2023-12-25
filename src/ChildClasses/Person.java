package ChildClasses;

import Interfaces.CanWear;
import Interfaces.HasInventory;
import ParentClasses.Alive;
import ParentClasses.Object;
import ParentClasses.Location;

import java.util.LinkedList;

public class Person extends Alive implements CanWear, HasInventory {

    private LinkedList<Clothing> wears;

    private LinkedList<Object> inventory;

    private Person partner;
    public Person(String name, Location location, Person partner) {
        super(name, location);
        this.wears = new LinkedList<Clothing>();
        this.inventory = new LinkedList<Object>();
        this.partner = partner;
    }

    @Override
    public LinkedList<Clothing> getWears() {
        return wears;
    }

    @Override
    public void addWears(Clothing toAdd) {
        this.wears.add(toAdd);
    }

    @Override
    public void removeWears(Clothing toRemove) {
        this.wears.remove(toRemove); // add logic to throw errors
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

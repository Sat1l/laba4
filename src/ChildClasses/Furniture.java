package ChildClasses;

import Interfaces.Sittable;
import ParentClasses.Location;
import ParentClasses.Object;

import java.util.LinkedList;

public class Furniture extends Object implements Sittable {

    private LinkedList<Person> sitting;

    public Furniture(String name, Location location){
        super(name, location);
        this.sitting = new LinkedList<Person>();
    }

    @Override
    public LinkedList<Person> getSitting() {
        return sitting;
    }

    @Override
    public void addSitting(Person toAdd) {
        this.sitting.add(toAdd);
    }

    @Override
    public void removeSitting(Person toRemove) {
        this.sitting.remove(toRemove);
    }
}

package ChildClasses;

import Interfaces.Sittable;
import ParentClasses.Alive;
import ParentClasses.Location;
import ParentClasses.Object;

import java.util.LinkedList;

public class Furniture extends Object implements Sittable {

    private LinkedList<Alive> sitting;

    public Furniture(String name, Location location){
        super(name, location);
        this.sitting = new LinkedList<Alive>();
    }

    @Override
    public LinkedList<Alive> getSitting() {
        return sitting;
    }

    @Override
    public void addSitting(Alive toAdd) {
        this.sitting.add(toAdd);
    }

    @Override
    public void removeSitting(Alive toRemove) {
        this.sitting.remove(toRemove);
    }
}

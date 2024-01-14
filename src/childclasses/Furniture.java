package childclasses;

import interfaces.Sittable;
import parentclasses.Alive;
import parentclasses.Location;
import parentclasses.UObject;

import java.util.LinkedList;

public class Furniture extends UObject implements Sittable {

    private final LinkedList<Alive> sitting;

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

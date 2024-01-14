package childclasses;

import interfaces.CanWear;
import interfaces.HasInventory;
import parentclasses.Alive;
import parentclasses.UObject;
import parentclasses.Location;

import java.util.LinkedList;

public class Person extends Alive implements CanWear, HasInventory {

    private final LinkedList<Clothing> wears;

    private final LinkedList<UObject> inventory;

    private Person partner;
    public Person(String name, Location location) {
        super(name, location);
        this.wears = new LinkedList<>();
        this.inventory = new LinkedList<>();
    }

    public Person getPartner(){
        return partner;
    }

    public void setPartner(Person newPartner){
        this.partner = newPartner;
    }

    @Override
    public void setLocation(Location newLocation){
        this.location = newLocation;
        for(UObject item : this.inventory){
            item.setLocation(newLocation);
        }
        for (Clothing clothing : this.wears){
            clothing.setLocation(newLocation);
        }
    }

    @Override
    public LinkedList<Clothing> getWears() {
        return wears;
    }

    @Override
    public void addWears(Clothing toAdd) {
        this.wears.add(toAdd);
        toAdd.setLocation(this.location);
    }

    @Override
    public void removeWears(Clothing toRemove) {
        this.wears.remove(toRemove); // add logic to throw errors
    }

    @Override
    public LinkedList<UObject> getInventory() {
        return inventory;
    }

    @Override
    public void addInventory(UObject toAdd) {
        this.inventory.add(toAdd);
        toAdd.setLocation(this.location);
    }

    @Override
    public void removeInventory(UObject toRemove) {
        this.inventory.remove(toRemove);
    }

}

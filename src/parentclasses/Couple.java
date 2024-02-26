package parentclasses;

import childclasses.Person;
import interfaces.HasInventory;

import java.util.LinkedList;

public class Couple implements HasInventory {

    private String name;

    private final Person husband;

    private final Person wife;

    private LinkedList<UObject> inventory;

    public Couple(String name, Person husband, Person wife){
        this.name = name;
        this.husband = husband;
        this.wife = wife;
        this.inventory = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getHusband(){
        return husband;
    }

    public Person getWife(){
        return wife;
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

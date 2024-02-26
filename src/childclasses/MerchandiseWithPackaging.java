package childclasses;

import interfaces.HasInventory;
import interfaces.HasPrice;
import parentclasses.Location;
import parentclasses.UObject;

import java.util.LinkedList;

public class MerchandiseWithPackaging extends UObject implements HasPrice, HasInventory {

    private LinkedList<UObject> contains;

    private int price;

    public MerchandiseWithPackaging(String name, int price, Location location){
        super(name, location);
        this.price = price;
    }
    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public LinkedList<UObject> getInventory() {
        return contains;
    }

    @Override
    public void addInventory(UObject toAdd) {
        this.contains.add(toAdd);
        toAdd.setLocation(this.location);
    }

    @Override
    public void removeInventory(UObject toRemove) {
        this.contains.remove(toRemove);
    }

    @Override
    public int getAmountOfInInventory(Class<?> objectType) {
        int counter = 0;
        for (UObject item:contains){
            if (objectType.isInstance(objectType)){
                counter += 1;
            }
        }
        return counter;
    }
}

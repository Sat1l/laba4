package interfaces;

import parentclasses.UObject;

import java.util.LinkedList;

public interface HasInventory {

    LinkedList<UObject> getInventory();

    void addInventory(UObject toAdd);

    void removeInventory(UObject toRemove);

}

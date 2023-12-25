package Interfaces;

import ParentClasses.Object;

import java.util.LinkedList;

public interface HasInventory {

    LinkedList<Object> getInventory();

    void addInventory(Object toAdd);

    void removeInventory(Object toRemove);

}

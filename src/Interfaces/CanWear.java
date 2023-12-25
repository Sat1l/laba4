package Interfaces;

import ChildClasses.Clothing;

import java.util.LinkedList;

public interface CanWear {
    LinkedList<Clothing> getWears();

    void addWears(Clothing toAdd);

    void removeWears(Clothing toRemove);
}

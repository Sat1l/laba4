package Interfaces;

import ChildClasses.Person;

import java.util.LinkedList;

public interface Sittable {

    LinkedList<Person> getSitting();

    void addSitting(Person toAdd);

    void removeSitting(Person toRemove);

}

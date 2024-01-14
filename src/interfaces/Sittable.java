package interfaces;

import parentclasses.Alive;
import java.util.LinkedList;

public interface Sittable {

    LinkedList<Alive> getSitting();

    void addSitting(Alive toAdd);

    void removeSitting(Alive toRemove);

}

package interfaces;

import childclasses.Beverage;
import enums.Amount;

import java.util.LinkedList;

public interface HasAlcohol {

    LinkedList<Beverage> getAlcohol();

    void addAlcohol(Beverage beverageToAdd);

    void removeAlcohol(Beverage beverageToRemove);

    int countAlcohol();

}

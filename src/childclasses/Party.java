package childclasses;

import enums.Amount;
import interfaces.HasAlcohol;
import parentclasses.Location;

import java.util.LinkedList;

public class Party extends LocWithAlco {

    private LinkedList<Beverage> beverages;

    public Party(String locname) {
        super(locname);
    }

    @Override
    public LinkedList<Beverage> getAlcohol(){
        return beverages;
    }

    @Override
    public void addAlcohol(Beverage beverageToAdd) {
        this.beverages.add(beverageToAdd);
    }

    @Override
    public void removeAlcohol(Beverage beverageToRemove) {
        this.beverages.remove(beverageToRemove);
    }

}

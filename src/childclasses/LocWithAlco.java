package childclasses;

import enums.Amount;
import interfaces.HasAlcohol;
import parentclasses.Location;

import java.util.LinkedList;

public class LocWithAlco extends Location implements HasAlcohol {

    private LinkedList<Beverage> alcohol;

    public LocWithAlco(String locname){
        super(locname);
        this.alcohol = new LinkedList<>();
    }

    @Override
    public LinkedList<Beverage> getAlcohol() {
        return alcohol;
    }

    @Override
    public void addAlcohol(Beverage beverageToAdd) {
        this.alcohol.add(beverageToAdd);
    }

    @Override
    public void removeAlcohol(Beverage beverageToRemove) {
        this.alcohol.remove(beverageToRemove);
    }

    @Override
    public int countAlcohol() {
        int res = 0;
        for (Beverage beverage : alcohol){
            res += beverage.getAmount().toInt();
        }
        return res;
    }
}

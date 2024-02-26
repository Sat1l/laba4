package childclasses;

import enums.Amount;
import parentclasses.Location;
import parentclasses.UObject;

public class PackOfBeverage extends UObject {

    Beverage beverage;

    Amount beverageAmount;

    public PackOfBeverage(String name, Beverage beverage, Location location) {
        super(name, location);
        this.beverage = beverage;
        this.beverageAmount = amount;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public Amount getBeverageAmount() {
        return beverageAmount;
    }

    public void setBeverageAmount(Amount beverageAmount) {
        this.beverageAmount = beverageAmount;
    }
}

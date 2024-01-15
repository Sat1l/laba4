package childclasses;

import enums.Amount;
import parentclasses.Location;
import parentclasses.UObject;

public class Beverage extends UObject {

    private String tare;

    private Amount amount;

    public Beverage(String name, String tare, Amount amount, Location location){
        super(name, location);
        this.tare = tare;
        this.amount = amount;
    }

    public String getTare(){
        return this.tare;
    }

    public void setTare(String newTare){
        this.tare = newTare;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}

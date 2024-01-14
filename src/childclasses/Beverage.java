package childclasses;

import parentclasses.Location;
import parentclasses.UObject;

public class Beverage extends UObject {

    private String tare;


    public Beverage(String name, String tare, Boolean isAlco, Location location){
        super(name, location);
        this.tare = tare;
    }

    public String getTare(){
        return this.tare;
    }

    public void setTare(String newTare){
        this.tare = newTare;
    }

}

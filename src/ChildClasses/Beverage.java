package ChildClasses;

import ParentClasses.Location;
import ParentClasses.Object;

public class Beverage extends Object {

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

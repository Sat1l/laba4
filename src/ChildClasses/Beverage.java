package ChildClasses;

import ParentClasses.Item;

public class Beverage extends Item {

    private String tare;

    public Beverage(String name, String tare){
        super(name);
        this.tare = tare;
    }

    public String getTare(){
        return this.tare;
    }

    public void setTare(String newTare){
        this.tare = newTare;
    }

}

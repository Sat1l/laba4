package ChildClasses;

import ParentClasses.Location;
import ParentClasses.Object;

import java.util.Random;

public class Journal extends Object {

    private int pages;

    private int currentPage;

    public Journal(String name, Location location){
        super(name, location);
        Random random = new Random();
        float f = random.nextFloat();
        this.pages = Math.round(2 + f*498);
        this.currentPage = 1;
    }

}

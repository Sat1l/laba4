package ChildClasses;

import ParentClasses.Location;
import ParentClasses.Object;

public class Photo extends Object {

    String shows;

    public Photo(String name, String shows, Location location){
        super(name, location);
        this.shows = shows;
    }
}

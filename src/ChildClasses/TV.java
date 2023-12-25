package ChildClasses;

import ParentClasses.Location;
import ParentClasses.Object;

public class TV extends Object {

    protected String shows;

    public TV(String name, String shows, Location location){
        super(name, location);
        this.shows = shows;
    }

    public String getShows(){
        return this.shows;
    }

    public void setShows(String toShow){
        this.shows = toShow;
        System.out.println("Телевизор теперь показывает " + toShow);
    }

}

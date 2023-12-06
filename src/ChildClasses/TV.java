package ChildClasses;

import ParentClasses.Item;

public class TV extends Item {

    protected String shows;

    public TV(String name, String shows){
        super(name);
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

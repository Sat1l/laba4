package childclasses;

import parentclasses.Location;
import parentclasses.UObject;

public class TV extends UObject {

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
        System.out.println("Now the tv is showing " + toShow);
    }

}

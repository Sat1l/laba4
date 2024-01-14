package childclasses;

import parentclasses.Location;
import parentclasses.UObject;

public class Photo extends UObject {

    String shows;

    public Photo(String name, String shows, Location location){
        super(name, location);
        this.shows = shows;
    }
}

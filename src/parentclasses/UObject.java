package parentclasses;

public class UObject {

    protected String name;

    protected Location location;

    public UObject(String name, Location location){
        this.name = name;
        this.location = location;
    }

    public String getName(){
        return this.name;
    }

    public Location getLocation(){
        return location;
    }

    public void setLocation(Location newLocation){
        this.location = newLocation;
    }

}

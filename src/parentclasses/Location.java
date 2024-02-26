package parentclasses;

import interfaces.HasInventory;

import java.util.LinkedList;
import java.util.Objects;

public class Location implements HasInventory {

    protected String locname;

    protected LinkedList<UObject> UObjects;

    public Location(String locname){
        this.locname = locname;
        this.UObjects = new LinkedList<>();
    }

    public String getLocname(){
        return locname;
    }

    public LinkedList<UObject> getInventory(){
        return UObjects;
    }

    @Override
    public void addInventory(UObject toAdd) {
        this.UObjects.add(toAdd);
        toAdd.setLocation(this);
    }

    @Override
    public void removeInventory(UObject toRemove) {
        this.UObjects.remove(toRemove);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        // Check for null and compare locName field
        if (Objects.equals(locname, location.getLocname())) return false;

        // Check for null and compare objects field
        return Objects.equals(UObjects, location.UObjects);
    }

    @Override
    public int hashCode(){
        int result = 3;
        result = 31 * result + (locname != null ? locname.hashCode() : 0);
        return result;
    }

}

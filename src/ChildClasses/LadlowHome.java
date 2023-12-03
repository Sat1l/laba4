package ChildClasses;

import ParentClasses.Location;

public class LadlowHome extends Location {
    private String occasion;

    public LadlowHome(String loc, String occasion){
        super(loc);
        this.occasion = occasion;
    }

    public String getOccasion(){
        return this.occasion;
    }
}

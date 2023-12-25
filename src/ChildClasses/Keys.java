package ChildClasses;

import ParentClasses.Location;
import ParentClasses.Object;

public class Keys extends Object {
    private String whatFor;

    public Keys(String name, String whatFor, Location location){
        super(name, location);
        this.whatFor = whatFor;
    }

    public String getWhatFor() {
        return this.whatFor;
    }

}

package ChildClasses;

import Interfaces.hasOccasion;
import ParentClasses.Location;

public class LadlowHome extends Location  implements hasOccasion {
    private String occasion;

    public LadlowHome(String loc, String occasion){
        super(loc);
        this.occasion = occasion;
    }

    @Override
    public String getOccasion() {
        return this.occasion;
    }

}

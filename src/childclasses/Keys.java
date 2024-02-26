package childclasses;

import parentclasses.Location;
import parentclasses.UObject;

public class Keys extends UObject {
    private final String whatFor;

    public Keys(String name, String whatFor, Location location){
        super(name, location);
        this.whatFor = whatFor;
    }


}

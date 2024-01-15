package childclasses;

import interfaces.HasOccasion;

public class LadlowHome extends LocWithAlco  implements HasOccasion {
    private final String occasion;

    public LadlowHome(String locname, String occasion){
        super(locname);
        this.occasion = occasion;
    }

    @Override
    public String getOccasion() {
        return occasion;
    }

}

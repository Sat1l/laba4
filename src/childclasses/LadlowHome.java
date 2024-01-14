package childclasses;

import enums.AMOUNT;
import interfaces.hasOccasion;

public class LadlowHome extends LocWithAlco  implements hasOccasion {
    private final String occasion;

    public LadlowHome(String locname, String occasion, AMOUNT alcoholAmount){
        super(locname, alcoholAmount);
        this.occasion = occasion;
    }

    @Override
    public String getOccasion() {
        return occasion;
    }

}

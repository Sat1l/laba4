package ParentClasses;

import Enums.AMOUNT;
import Enums.DIRECTION;
import Enums.STRENGTH;

public class Conditions {
    private AMOUNT cloudsAmount;
    private STRENGTH windStrength;
    private DIRECTION windDirection;

    public Conditions(AMOUNT cloudsAmount, STRENGTH windStrength, DIRECTION windDirection){
        this.cloudsAmount = cloudsAmount;
        this.windStrength = windStrength;
        this.windDirection = windDirection;
    }
}

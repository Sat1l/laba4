package parentclasses;

import enums.Amount;
import enums.Direction;
import enums.Strength;

public class Conditions {

    private Amount cloudsAmount;

    private Strength windStrength;

    private Direction windDirection;

    public Conditions(Amount cloudsAmount, Strength windStrength, Direction windDirection){
        this.cloudsAmount = cloudsAmount;
        this.windStrength = windStrength;
        this.windDirection = windDirection;
    }

    public Amount getCloudsAmount() {
        return cloudsAmount;
    }

    public void setCloudsAmount(Amount cloudsAmount) {
        this.cloudsAmount = cloudsAmount;
    }

    public Strength getWindStrength() {
        return windStrength;
    }

    public void setWindStrength(Strength windStrength) {
        this.windStrength = windStrength;
    }

    //public Direction getWindDirection() {
    //    return windDirection;
    //}

    public void setWindDirection(Direction windDirection) {
        this.windDirection = windDirection;
    }

}

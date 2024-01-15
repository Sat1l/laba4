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

    public void newTuchi(){
        if (this.cloudsAmount.toInt() + 1 > Amount.ALOT.toInt()){
            System.out.println("налетели ещё тучи, но их так много, что новые даже не заметны");
        } else {
            System.out.println("налетели новые тучи");
            this.setCloudsAmount(Amount.fromInt(this.getCloudsAmount().toInt()+1));
        }
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

    public Direction getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Direction windDirection) {
        this.windDirection = windDirection;
    }

}

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

    public void newTuchi(){
        if (this.cloudsAmount.toInt() + 1 > AMOUNT.ALOT.toInt()){
            System.out.println("налетели ещё тучи, но их так много, что новые даже не заметны");
        } else {
            System.out.println("налетели новые тучи");
            this.setCloudsAmount(AMOUNT.fromInt(this.getCloudsAmount().toInt()+1));
        }
    }

    public AMOUNT getCloudsAmount() {
        return cloudsAmount;
    }

    public void setCloudsAmount(AMOUNT cloudsAmount) {
        this.cloudsAmount = cloudsAmount;
    }

    public STRENGTH getWindStrength() {
        return windStrength;
    }

    public void setWindStrength(STRENGTH windStrength) {
        this.windStrength = windStrength;
    }

    public DIRECTION getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(DIRECTION windDirection) {
        this.windDirection = windDirection;
    }

}

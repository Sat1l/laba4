package ChildClasses;

import Enums.AMOUNT;
import Interfaces.hasAlcohol;
import Interfaces.hasOccasion;
import ParentClasses.Location;

public class OuterPlace extends Location implements  hasOccasion, hasAlcohol {
    protected String occasion;
    protected AMOUNT alcoholAmount;
    public OuterPlace(String locname, String occasion, AMOUNT alcoholAmount){
        super(locname);
        this.occasion = occasion;
        this.alcoholAmount = alcoholAmount;
    }

    @Override
    public String getWhatToToastTo(String reason) {
        return this.occasion;
    }
    @Override
    public AMOUNT getAlcoholAmount(){
        return this.alcoholAmount;
    }

    @Override
    public void setAlcoholAmount(AMOUNT newamount){
        this.alcoholAmount = newamount;
        System.out.println("Теперь в " + this.locname + " осталось " + newamount + " выпивки ");
    }
}

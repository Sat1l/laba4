package ChildClasses;

import Enums.AMOUNT;
import Interfaces.hasAlcohol;
import ParentClasses.Location;

public class Party extends Location implements hasAlcohol {

    AMOUNT alcoholAmount;

    public Party(String locname, AMOUNT alcoholAmount) {
        super(locname);
        this.alcoholAmount = alcoholAmount;
    }

    @Override
    public AMOUNT getAlcoholAmount(){
        return alcoholAmount;
    }

    @Override
    public void setAlcoholAmount(AMOUNT newAmount){
        this.alcoholAmount = newAmount;
    }

}

package actions;

import childclasses.Beverage;
import childclasses.LocWithAlco;
import childclasses.Person;
import enums.AMOUNT;
import enums.CONDITION;
import interfaces.hasAlcohol;
import parentclasses.Action;

public class DrinkAlco extends Action {
    public DrinkAlco(String actionName) {
        super(actionName);
    }

    public void drinkAlco(Person person, Beverage beverage, AMOUNT amount){
        person.addDoing(this);
        if (person.getLocation() instanceof hasAlcohol) {
            LocWithAlco locWithAlco = (LocWithAlco) person.getLocation();
            int alcoholAmount = locWithAlco.getAlcoholAmount().toInt();
            if (alcoholAmount > 0){
                if (alcoholAmount - amount.toInt() > 0){
                    locWithAlco.setAlcoholAmount(AMOUNT.fromInt(alcoholAmount - amount.toInt()));
                    person.setCondition(CONDITION.DRUNK);
                    System.out.println(person.getName() + " drank " + amount + " " + beverage.getTare() + " " + beverage.getName() + ", and now " + person.getCondition().toString());
                    System.out.println("At " + locWithAlco.getLocname() + " there is " + locWithAlco.getAlcoholAmount() + " of alcohol");
                } else if (alcoholAmount - amount.toInt() <= 0) {
                    locWithAlco.setAlcoholAmount(AMOUNT.NONE);
                    person.setCondition(CONDITION.DRUNK);
                    System.out.println(person.getName() + " drank all of the remaining alcohol and there was " + AMOUNT.fromInt(alcoholAmount) + " of it and now this person is " + person.getCondition().toString());
                    System.out.println(locWithAlco.getLocname() + " now does not have any alcohol");
                } else {
                    System.out.println(person.getName() + " wanted to drink but " + person.getLocation().getLocname() + " had no alcohol ");
                }

            }
        } else {
            System.out.println(person.getName() + " wanted to drink but " + person.getLocation().getLocname() + " had no alcohol");
        }
        person.removeDoing(this);
    }

}

package actions;

import ChildClasses.Beverage;
import ChildClasses.Person;
import Enums.AMOUNT;
import Enums.CONDITION;
import Interfaces.hasAlcohol;
import ParentClasses.Action;

public class DrinkAlco extends Action {
    public DrinkAlco(String actionName) {
        super(actionName);
    }

    public void drinkAlco(Person person, Beverage beverage, AMOUNT amount){
        person.addDoing(this);
        if (person.getLocation() instanceof hasAlcohol) {
//            OuterPlace outerPlace = (OuterPlace) person.getLocation();
            int alcoholAmount = outerPlace.getAlcoholAmount().toInt();
            if (alcoholAmount > 0){
                if (alcoholAmount - amount.toInt() > 0){
                    outerPlace.setAlcoholAmount(AMOUNT.fromInt(alcoholAmount - amount.toInt()));
                    person.setCondition(CONDITION.DRUNK);
                    System.out.println(person.getName() + " drank " + amount.toString() + " " + beverage.getTare() + " " + beverage.getName() + ", and now " + person.getCondition().toString());
                    System.out.println("At " + outerPlace.getLocname() + " there is " + outerPlace.getAlcoholAmount() + " of alcohol");
                } else if (alcoholAmount - amount.toInt() < 0) {
                    outerPlace.setAlcoholAmount(AMOUNT.NONE);
                    person.setCondition(CONDITION.DRUNK);
                    System.out.println(person.getName() + " drank all of the remaining alcohol that there was " + AMOUNT.fromInt(alcoholAmount-amount.toInt()) + " and now" + person.getCondition().toString());
                    System.out.println("В " + outerPlace.getLocname() + " не осталось выпивки");
                } else {
                    System.out.println(person.getName() + " wanted to drink but " + person.getLocation().getLocname() + " had no alcohol ");
                }

            }
        } else {
            System.out.println(person.getName() + " wanted to drink but " + person.getLocation().getLocname() + " had no alcohol ");
        }
        person.removeDoing(this);
    }

}

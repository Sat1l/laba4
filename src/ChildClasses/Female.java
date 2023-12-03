package ChildClasses;

import Enums.AMOUNT;
import Enums.INTEREST;
import ParentClasses.Item;
import ParentClasses.Location;
import ParentClasses.Person;

public class Female extends Person {

    public Female(String name, Location location){
        super(name, location);
    }

    public void findItem(Item item){
        System.out.println(this.name + " отыскала " + item);
    }
    public void zip(Clothing clothing){
        if(clothing.getIsZipepd()){
            System.out.println(this.name + "попыталась застегнуть " + clothing.getName() + ", но она уже была застегнута");
        }
        else {
            clothing.setIsZipped(true);
        }
    }

    @Override
    public void bring(Item item){
        System.out.println(this.name + " принесла " + item.getName());
    }
    @Override
    public void say(String phrase){
        System.out.println(" - " + phrase + " сказала " + this.name);
    }
    @Override
    public void drinkAlcohol(Beverage beverage, AMOUNT amount){
        if (this.location instanceof OuterPlace) {
            OuterPlace outerPlace = (OuterPlace) this.location;
            AMOUNT alcoholAmount = outerPlace.getAlcoholAmount();
            if (alcoholAmount != AMOUNT.NONE){
                switch (alcoholAmount){
                    case ALOT -> {
                        outerPlace.setAlcoholAmount(AMOUNT.PLENTY);
                    }
                    case PLENTY -> {
                        outerPlace.setAlcoholAmount(AMOUNT.FEW);
                    }
                    case FEW -> {
                        outerPlace.setAlcoholAmount(AMOUNT.NONE);
                    }
                    default -> {
                        break;
                    }
                }
                System.out.println(this.name + " выпила " + amount + " " + beverage.getTare() + " " + beverage.getName());
                if (outerPlace.getAlcoholAmount() != AMOUNT.NONE) {
                    System.out.println("В " + outerPlace.getLocname() + " осталось " + outerPlace.getAlcoholAmount() + " выпивки");
                } else {
                    System.out.println("В " + outerPlace.getLocname() + " не осталось выпивки");
                }
            }
        } else {
            System.out.println(this.name + " хотела было выпить, но в " + this.location.getLocname() + " не оказалось выпивки ");
        }
    }
    @Override
    public void think(String thought){
        System.out.println(this.name + " подумала: " + thought);
    }
    @Override
    public void ask(String phrase, INTEREST interest){
        System.out.println(" - " + phrase + " - спросила " + this.name + " " + interest);
    }
    @Override
    public void putOn(Clothing clothing){
        this.wears.add(clothing);
        System.out.println(this.name + " надела " + clothing.getName());
    }
}


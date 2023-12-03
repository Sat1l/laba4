package ChildClasses;

import Enums.AMOUNT;
import Enums.INTEREST;
import ParentClasses.Item;
import ParentClasses.Location;
import ParentClasses.Person;

public class Alien extends Person {

    public Alien(String name, Location location){
        super(name, location);
    }

    public void findItem(Item item){
        System.out.println(this.name + " отыскало " + item);
    }
    public void zip(Clothing clothing){
        if(clothing.getIsZipepd()){
            System.out.println(this.name + "попыталось застегнуть " + clothing.getName() + ", но она уже была застегнута");
        }
        else {
            clothing.setIsZipped(true);
        }
    }

    @Override
    public void bring(Item item){
        System.out.println(this.name + " принесло " + item.getName());
    }
    @Override
    public void say(String phrase){
        System.out.println(" - " + phrase + " сказало " + this.name);
    }
    @Override
    public void drink(Beverage beverage, AMOUNT amount){
        System.out.println(this.name + " выпило "+ amount + " " + beverage.getTare() + " " + beverage.getName());
    }
    @Override
    public void think(String thought){
        System.out.println(this.name + " подумало: " + thought);
    }
    @Override
    public void ask(String phrase, INTEREST interest){
        System.out.println(" - " + phrase + " - спросило " + this.name + " " + interest);
    }
    @Override
    public void putOn(Clothing clothing){
        this.wears.add(clothing);
        System.out.println(this.name + " надело " + clothing.getName());
    }
}

package ChildClasses;

import Enums.AMOUNT;
import Enums.INTEREST;
import ParentClasses.Item;
import ParentClasses.Location;
import ParentClasses.Person;

public class Male extends Person {

    public Male(String name, Location location){
        super(name, location);
    }

    public void findItem(Item item){
        System.out.println(this.name + " отыскал " + item);
    }
    public void zip(Clothing clothing){
        if(clothing.getIsZipepd()){
            System.out.println(this.name + "попытался застегнуть " + clothing.getName() + ", но она уже была застегнута");
        }
        else {
            clothing.setIsZipped(true);
        }
    }

    @Override
    public void bring(Item item){
        System.out.println(this.name + " принес " + item.getName());
    }
    @Override
    public void say(String phrase){
        System.out.println(" - " + phrase + " сказал " + this.name);
    }
    @Override
    public void drink(Beverage beverage, AMOUNT amount){
        System.out.println(this.name + " выпил "+ amount + " " + beverage.getTare() + " " + beverage.getName());
    }
    @Override
    public void think(String thought){
        System.out.println(this.name + " подумал: " + thought);
    }
    @Override
    public void ask(String phrase, INTEREST interest){
        System.out.println(" - " + phrase + " - спросил " + this.name + " " + interest);
    }
    @Override
    public void putOn(Clothing clothing){
        this.wears.add(clothing);
        System.out.println(this.name + " надел " + clothing.getName());
    }
}

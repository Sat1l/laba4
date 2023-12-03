package ParentClasses;

import ChildClasses.Beverage;
import ChildClasses.Clothing;
import ChildClasses.TV;
import Enums.AMOUNT;
import Enums.INTEREST;
import Enums.SEX;

import java.util.LinkedList;

public abstract class Person {
    protected String name;
    protected LinkedList<Clothing> wears;
    protected Location location;

    public Person(String name, Location location){
        this.name = name;
        this.wears = new LinkedList<Clothing>();
        this.wears.add(new Clothing("дефолт одежда"));
        this.location = location;
    }

    public abstract void findItem(Item item);
    public abstract void zip(Clothing clothing);

    Location getLocation(){
        return this.location;
    }
    void setLocation(Location location){
      this.location = location;
    }
    public abstract void bring(Item item);
    public abstract void say(String phrase);

    public abstract void drink(Beverage beverage, AMOUNT amount);

    public abstract void think(String thought);

    public abstract void ask(String phrase, INTEREST interest);

    void watchTV(TV tv){
        System.out.println(this.name + " смотрит " + tv.getShows());
    }

    public abstract void putOn(Clothing clothing);

    void flipPages(INTEREST interest){
        System.out.println(this.name + " " + interest + " " + "перелистывает страницы");
    }

    void sit(){
        System.out.println(this.name + " сидит ");
    }
}

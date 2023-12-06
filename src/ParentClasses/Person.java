package ParentClasses;

import ChildClasses.Beverage;
import ChildClasses.Clothing;
import ChildClasses.TV;
import Enums.AMOUNT;
import Enums.CONDITION;
import Enums.INTEREST;

import java.util.LinkedList;

public abstract class Person {

    private String name;

    private CONDITION condition;

    protected LinkedList<Clothing> wears;

    protected Location location;

    public Person(String name, Location location){
        this.name = name;
        this.condition = CONDITION.NORMAL;
        this.wears = new LinkedList<Clothing>();
        this.wears.add(new Clothing("дефолт одежда"));
        this.location = location;
    }

    public void watchTV(TV tv){
        System.out.println(this.name + " смотрит " + tv.getShows());
    }
    public void flipPages(INTEREST interest){
        System.out.println(this.name + " " + interest + " " + "перелистывает страницы");
    }
    public void sit(){
        System.out.println(this.name + " сидит ");
    }

    public abstract void give(Item item, Person person);

    public abstract void findItem(Item item);

    public abstract void zip(Clothing clothing);

    public abstract void bring(Item item);

    public abstract void say(String phrase);

    public abstract void drinkAlcohol(Beverage beverage, AMOUNT amount);

    public abstract void think(String thought);

    public abstract void ask(String phrase, INTEREST interest);

    public abstract void putOn(Clothing clothing);

    Location getLocation(){
        return this.location;
    }

    public void setLocation(Location location){
        this.location = location;
    }

    public String getName(){
        return this.name;
    }

    public CONDITION getCondition() {
        return condition;
    }

    public void setCondition(CONDITION condition) {
        this.condition = condition;
    }

}

package ParentClasses;

import ChildClasses.Beverage;
import ChildClasses.Clothing;
import ChildClasses.TV;
import Enums.AMOUNT;
import Enums.INTEREST;
import Enums.SEX;

import java.util.LinkedList;

public abstract class Person {
    private String name;
    private SEX sex;
    private LinkedList<Clothing> wears;
    private Location location;

    public Person(String name, Location location, SEX sex){
        this.name = name;
        this.sex = sex;
        this.wears = new LinkedList<Clothing>();
        this.wears.add(new Clothing("дефолт одежда"));
        this.location = location;
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

    Location getLocation(){
        return this.location;
    }
    void setLocation(Location location){
      this.location = location;
    }
    void bring(Item item) {
        System.out.println(this.name + GrammarUtils.genderify("принес", this.sex) + item.getName());
    }
    void say(String phrase){
        System.out.println(" - " + phrase + " " + GrammarUtils.genderify("сказал", this.sex) + " "+ this.name);
    }

    void drink(Beverage beverage, AMOUNT amount){
        System.out.println(this.name + " " + GrammarUtils.genderify("выпил", this.sex) + " " + amount + " " + beverage.getTare() + " " + beverage.getName());
    }

    void think(String thought){
        System.out.println(this.name + " " + GrammarUtils.genderify("подумал", this.sex) + ": " + thought);
    }

    void ask(String phrase, INTEREST interest){
        System.out.println(" - " + phrase + " - " + GrammarUtils.genderify("спросил", this.sex) + " " + this.name + " " + interest);
    }

    void watchTV(TV tv){
        System.out.println(this.name + " смотрит " + tv.getShows());
    }

    void putOn(Clothing clothing){
        this.wears.add(clothing);
        System.out.println(this.name + " " + GrammarUtils.genderify("надел", this.sex) + " " + clothing.getName());
    }

    void flipPages(INTEREST interest){
        System.out.println(this.name + " " + interest + " " + "перелистывает страницы");
    }

    void sit(){
        System.out.println(this.name + " сидит ");
    }
}

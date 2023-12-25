package ParentClasses;

import ChildClasses.Beverage;
import ChildClasses.Clothing;
import ParentClasses.Action;
import ChildClasses.TV;
import Enums.AMOUNT;
import Enums.CONDITION;
import Enums.INTEREST;
import javax.swing.*;
import java.util.LinkedList;

public abstract class Alive {

    private String name;

    private CONDITION condition = CONDITION.NORMAL;

    private LinkedList<Action> doing;

    protected Location location;

    public Alive(String name, Location location){
        this.name = name;
        this.doing = new LinkedList<Action>();
        this.location = location;
    }

    public String getName(){
        return name;
    }

    public CONDITION getCondition() {
        return condition;
    }

    public void setCondition(CONDITION newCondition) {
        this.condition = newCondition;
    }

    public Location getLocation(){
        return location;
    }

    public void setLocation(Location newLocation){
        this.location = newLocation;
    }

    public LinkedList<Action> getDoing(){
        return doing;
    }

    public void addDoing(Action action){
        this.doing.add(action);
    }

    public void removeDoing(Action action){
        this.doing.remove(action);
    }

}

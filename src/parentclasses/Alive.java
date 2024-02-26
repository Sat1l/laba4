package parentclasses;

import enums.Condition;
import interfaces.HasInventory;
import interfaces.HasLocation;
import interfaces.HasName;

import java.util.LinkedList;

public abstract class Alive implements HasLocation, HasInventory, HasName {

    private final String name;

    private Condition condition = Condition.NORMAL;

    private final LinkedList<Action> doing;

    protected Location location;

    public Alive(String name, Location location){
        this.name = name;
        this.doing = new LinkedList<>();
        this.location = location;
    }

    public String getName(){
        return name;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition newCondition) {
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

    public String getDoingString(){
        StringBuilder text = new StringBuilder("As of now, " + this.getName() + " is: ");
        if (!this.getDoing().isEmpty()){
                text.append(this.getDoing().toString());
        } else {
            text.append("doing nothing");
        }
        return text.toString();
    }

    public void addDoing(Action action){
        this.doing.add(action);
    }

    public void removeDoing(Action action){
        this.doing.remove(action);
    }

}

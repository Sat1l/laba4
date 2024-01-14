package parentclasses;

import enums.CONDITION;

import java.util.LinkedList;

public abstract class Alive {

    private final String name;

    private CONDITION condition = CONDITION.NORMAL;

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

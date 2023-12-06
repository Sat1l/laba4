package ParentClasses;

public class LocManager {

    private Location storyLocation;

    public LocManager(Location storyLocation){
        this.storyLocation = storyLocation;
    }

    public void setStoryLocation(Location newlocation){
        this.storyLocation = newlocation;
        System.out.println("Действия перемещаются в " + newlocation);
    }

    public Location getStoryLocation(){
        return this.storyLocation;
    }

}

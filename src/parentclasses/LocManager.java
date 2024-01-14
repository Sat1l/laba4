package parentclasses;

public class LocManager {

    private Location storyLocation;

    public LocManager(Location storyLocation){
        this.storyLocation = storyLocation;
    }

    public void setStoryLocation(Location newlocation){
        this.storyLocation = newlocation;
        System.out.println("Story is transfered to  " + newlocation);
    }

    public Location getStoryLocation(){
        return this.storyLocation;
    }

}

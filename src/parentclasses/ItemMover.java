package parentclasses;

import java.util.LinkedList;

public class ItemMover {

    public void moveUObjectToLoc(UObject toMove, Location dest){
        toMove.getLocation().removeInventory(toMove);
        toMove.setLocation(dest);
        dest.addInventory(toMove);
    }

}

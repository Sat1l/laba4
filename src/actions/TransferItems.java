package actions;

import childclasses.Storage;
import parentclasses.Action;
import parentclasses.Alive;
import parentclasses.UObject;

import java.util.LinkedList;

public class TransferItems extends Action {

    public TransferItems(String actionName){
        super(actionName);
    }

    public void TransferItems(Alive transferrer, Storage source, UObject toTransfer,Storage keeper){
        transferrer.addDoing(this);
        if(source.getInventory().contains(toTransfer) && (source.getLocation() == keeper.getLocation()) && (source.getLocation() == transferrer.getLocation()) )  {
            source.removeInventory(toTransfer);
            keeper.addInventory(toTransfer);
            transferrer.removeDoing(this);
        }
    }


}

package actions;

import childclasses.Person;
import childclasses.Storage;
import exceptions.LocationMissmatchException;
import parentclasses.Action;
import parentclasses.Alive;
import parentclasses.Couple;
import parentclasses.UObject;

public class TransferItems extends Action {

    public TransferItems(String actionName){
        super(actionName);
    }

    public void transferItems(Alive transferrer, Storage source, UObject toTransfer,Storage keeper){
        transferrer.addDoing(this);
        if(source.getInventory().contains(toTransfer) && (source.getLocation() == keeper.getLocation()) && (source.getLocation() == transferrer.getLocation()) )  {
            source.removeInventory(toTransfer);
            keeper.addInventory(toTransfer);
            transferrer.removeDoing(this);
        }
    }


    public void transferItems(Couple couple, Storage source, UObject toTransfer, Storage keeper){
        Person husband = couple.getHusband();
        Person wife = couple.getWife();
        husband.addDoing(this);
        wife.addDoing(this);
        if(source.getInventory().contains(toTransfer) && (source.getLocation() == keeper.getLocation()) && (source.getLocation() == husband.getLocation()))  {
            source.removeInventory(toTransfer);
            keeper.addInventory(toTransfer);
            husband.removeDoing(this);
            wife.removeDoing(this);
        } else {
            throw new LocationMissmatchException(source, keeper);
        }
    }
}

package exceptions;

import interfaces.HasInventory;
import parentclasses.UObject;

public class ItemNotInPlaceException extends RuntimeException{
    public ItemNotInPlaceException(HasInventory hasInventory, UObject uObject){
        super(hasInventory + " doesnt have " + uObject);
    }
}

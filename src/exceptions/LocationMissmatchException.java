package exceptions;

import interfaces.HasLocation;

public class LocationMissmatchException extends Exception{
    public LocationMissmatchException(HasLocation obj1, HasLocation obj2){
        super(obj1 + " does not match the location of " + obj2);
    }
}

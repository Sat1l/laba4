package exceptions;

public class NegativeNotAllowedException extends RuntimeException {
    public NegativeNotAllowedException(String message){
        super(message);
    }
}

package enums;

public enum Condition {

    NORMAL("normal"),

    DRUNK("drunk"),

    CALM("calm"),

    BUYANIT("buyanit");

    private final String condition;

    Condition(String condition){
        this.condition = condition;
    }

    @Override
    public String toString(){
        return this.condition;
    }
}

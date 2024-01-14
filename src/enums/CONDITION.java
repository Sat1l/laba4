package enums;

public enum CONDITION {

    NORMAL("normal"),

    DRUNK("drunk"),

    CALM("calm"),

    BUYANIT("buyanit");

    private final String condition;

    CONDITION(String condition){
        this.condition = condition;
    }

    @Override
    public String toString(){
        return this.condition;
    }
}

package Enums;

public enum DIRECTION {

    NORTH("север"),

    EAST("восток"),

    SOUTH("юг"),

    WEST("запад"),

    NONE("отсутствует");

    private final String direction;

    private DIRECTION(String direction){
        this.direction = direction;
    }

    @Override
    public String toString(){
        return this.direction;
    }

}

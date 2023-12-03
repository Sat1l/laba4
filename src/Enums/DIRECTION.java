package Enums;

public enum DIRECTION {
    NORTH("север"),
    EAST("восток"),
    SOUTH("юг"),
    WEST("запад");
    private final String direction;

    private DIRECTION(String direction){
        this.direction = direction;
    }
    public String toString(){
        return this.direction;
    }

}

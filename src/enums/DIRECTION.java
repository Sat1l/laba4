package enums;

public enum DIRECTION {

    NORTH("north"),

    EAST("east"),

    SOUTH("south"),

    WEST("west"),

    NONE("none");

    private final String direction;

    DIRECTION(String direction){
        this.direction = direction;
    }

    @Override
    public String toString(){
        return this.direction;
    }

}

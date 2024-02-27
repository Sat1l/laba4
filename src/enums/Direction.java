package enums;

public enum Direction {

    //NORTH("north"),

    EAST("east"),

    //SOUTH("south"),

    //NONE("none"),

    WEST("west");

    private final String direction;

    Direction(String direction){
        this.direction = direction;
    }

    @Override
    public String toString(){
        return this.direction;
    }

}

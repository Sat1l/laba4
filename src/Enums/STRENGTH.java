package Enums;

public enum STRENGTH {
    WEAK("слабый"),
    MEDIUM("средний"),
    STRONG("сильный");
    private final String strength;
    private STRENGTH(String strength){
        this.strength = strength;
    }

    @Override
    public String toString(){
        return this.strength;
    }
}

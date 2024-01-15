package enums;

public enum Strength {

    NONE("none"),

    WEAK("weak"),

    MEDIUM("mid"),

    STRONG("strong");

    private final String strength;

    Strength(String strength){
        this.strength = strength;
    }

    @Override
    public String toString(){
        return this.strength;
    }

}

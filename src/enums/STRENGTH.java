package enums;

public enum STRENGTH {

    NONE("none"),

    WEAK("weak"),

    MEDIUM("mid"),

    STRONG("strong");

    private final String strength;

    STRENGTH(String strength){
        this.strength = strength;
    }

    @Override
    public String toString(){
        return this.strength;
    }

}

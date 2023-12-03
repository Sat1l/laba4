package Enums;

import jdk.jfr.Percentage;

public enum STRENGTH {
    WEAK("слабый"),
    MEDIUM("средний"),
    STRONG("сильный");
    public String strength;
    private STRENGTH(String strength){
        this.strength = strength;
    }

    @Override
    public String toString(){
        return this.strength;
    }
}

package Enums;

public enum STRENGTH {
    WEAK("слабый"),
    MEDIUM("средний"),
    STRONG("сильный");
    public String naming;
    private STRENGTH(String strength){
        this.naming = naming;
    }
    public String toString(){
        return this.naming;
    }
}

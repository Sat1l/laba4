package Enums;

public enum CONDITION {

    NORMAL("нормальный"),

    DRUNK("пьяный"),

    CALM("спокойный");

    private final String condition;

    private CONDITION(String condition){
        this.condition = condition;
    }

    @Override
    public String toString(){
        return this.condition;
    }

}

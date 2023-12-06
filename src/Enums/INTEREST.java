package Enums;

public enum INTEREST {

    DEDICATED("с интересом"),

    CARELESS("без интереса");

    private final String interest;

    private INTEREST(String interest){
        this.interest = interest;
    }

    @Override
    public String toString(){
        return this.interest;
    }

}

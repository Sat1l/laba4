package Enums;

public enum INTEREST {
    DEDICATED("с интересом"),
    CARELESS("без интереса");

    public String interest;

    private INTEREST(String interest){this.interest = interest;}

    public String toString(){
        return this.interest;
    }
}
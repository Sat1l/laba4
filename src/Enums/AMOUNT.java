package Enums;

public enum AMOUNT {
    NONE("отсутствуют"),
    FEW("немного"),
    PLENTY("достаточно"),
    ALOT("большое количество");
    public String naming;
    private AMOUNT(String amount){
        this.naming = naming;
    }
    public String toString(){
        return this.naming;
    }
}

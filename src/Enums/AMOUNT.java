package Enums;

public enum AMOUNT {
    NONE("отсутствуют"),
    FEW("немного"),
    PLENTY("достаточно"),
    ALOT("большое количество");
    public String amount;
    private AMOUNT(String amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return this.amount;
    }
}

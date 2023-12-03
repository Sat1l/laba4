package Enums;

public enum AMOUNT {
    NONE("отсутствуют", 0),
    FEW("немного", 1),
    PLENTY("достаточно", 2),
    ALOT("большое количество", 3);
    private final String strAmount;
    private final int intAmount;
    private AMOUNT(String strAmount, int intAmount){
        this.strAmount = strAmount;
        this.intAmount = intAmount;
    }

    @Override
    public String toString(){
        return strAmount;
    }

    public int toInt(){
        return intAmount;
    }

    public static AMOUNT fromInt(int value){
        for(AMOUNT amount : AMOUNT.values()){
            if (amount.intAmount == value){
                return amount;
            }
        }
        throw new IllegalArgumentException("Такого не бывает! Этот енам не может быть равен: " + value);
    }
}

package enums;

public enum AMOUNT {

    NONE("none", 0),

    FEW("few", 1),

    PLENTY("plenty", 2),

    ALOT("a lot", 3);

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

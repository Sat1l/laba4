package enums;

public enum Amount {

    NONE("none", 0),

    FEW("few", 1),

    PLENTY("plenty", 2),

    ALOT("a lot", 3);

    private final String strAmount;

    private final int intAmount;

    Amount(String strAmount, int intAmount){
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

    public static Amount fromInt(int value){
        for(Amount amount : Amount.values()){
            if (amount.intAmount == value){
                return amount;
            }
        }
        throw new IllegalArgumentException("Такого не бывает! Этот енам не может быть равен: " + value);
    }

}

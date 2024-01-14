package enums;

public enum INTEREST {

    DEDICATED("interested"),

    CARELESS("no interest");

    private final String interest;

    INTEREST(String interest){
        this.interest = interest;
    }

    @Override
    public String toString(){
        return this.interest;
    }

}

package enums;

public enum Interest {

    DEDICATED("interested"),

    CARELESS("no interest");

    private final String interest;

    Interest(String interest){
        this.interest = interest;
    }

    @Override
    public String toString(){
        return this.interest;
    }

}

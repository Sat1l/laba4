package enums;

public enum ZIPPERSTAT {

    NORMAL("normal"),

    STUCK("stuck"),

    OFFRAILS("off rails");

    private final String zipperStat;

    private ZIPPERSTAT(String zipperStat){
        this.zipperStat = zipperStat;
    }

    @Override
    public String toString(){
        return this.zipperStat;
    }

}

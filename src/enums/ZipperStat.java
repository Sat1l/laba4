package enums;

public enum ZipperStat {

    NORMAL("normal"),

    STUCK("stuck"),

    OFFRAILS("off rails");

    private final String zipperStat;

    ZipperStat(String zipperStat){
        this.zipperStat = zipperStat;
    }

    @Override
    public String toString(){
        return this.zipperStat;
    }

}

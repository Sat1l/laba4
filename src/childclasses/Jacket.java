package childclasses;

import enums.ZipperStat;
import parentclasses.Location;

public class Jacket extends Clothing{

    private Boolean isZipped;

    private ZipperStat zipperstat;

    public Jacket(String name, Boolean isZipped, Location location) {
        super(name, location);
        this.isZipped = isZipped;
        this.zipperstat = ZipperStat.NORMAL;
    }

    public boolean getIsZipepd(){
        return isZipped;
    }

    public void setIsZipped(boolean zorunz){ // zorunz = zip or unzip
        this.isZipped = zorunz;
    }

    public ZipperStat getZipperstat(){
        return zipperstat;
    }

    public void setZipperstat(ZipperStat zipperstat){
        this.zipperstat = zipperstat;
    }
}

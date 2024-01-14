package childclasses;

import enums.ZIPPERSTAT;
import parentclasses.Location;

public class Jacket extends Clothing{

    private Boolean isZipped;

    private ZIPPERSTAT zipperstat;

    public Jacket(String name, Boolean isZipped, Location location) {
        super(name, location);
        this.isZipped = isZipped;
        this.zipperstat = ZIPPERSTAT.NORMAL;
    }

    public boolean getIsZipepd(){
        return isZipped;
    }

    public void setIsZipped(boolean zorunz){ // zorunz = zip or unzip
        this.isZipped = zorunz;
    }

    public ZIPPERSTAT getZipperstat(){
        return zipperstat;
    }

    public void setZipperstat(ZIPPERSTAT zipperstat){
        this.zipperstat = zipperstat;
    }
}

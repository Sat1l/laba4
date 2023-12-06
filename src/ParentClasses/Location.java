package ParentClasses;

import java.util.Objects;
public class Location {

    protected String locname;

    public Location(String locname){
        this.locname = locname;
    }

    public String getLocname(){
        return this.locname;
    }

    @Override
    public int hashCode(){
        int result = 3;
        result = 31 * result + (locname != null ? locname.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object toeq){ //toeq = to *calculate if* equals
        if (this == toeq) return true;
        if (toeq == null || getClass() != toeq.getClass()) return false;
        Location sec = (Location) toeq;
        return locname == null ? sec.locname == null : locname.equals(sec.locname);
    }

}

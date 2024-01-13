package ParentClasses;

import java.util.LinkedList;

public class Location {

    protected String locname;

    protected LinkedList<Object> objects;

    public Location(String locname){
        this.locname = locname;
        this.objects = new LinkedList<Object>();
    }

    public String getLocname(){
        return locname;
    }

    public LinkedList<Object> getObjects(){
        return objects;
    }

    public void addObject(Object object){
        this.objects.add(object);
    }


    @Override
    public String toString(){
        return locname;
    }

    @Override
    public int hashCode(){
        int result = 3;
        result = 31 * result + (locname != null ? locname.hashCode() : 0);
        return result;
    }

//    @Override
//    public boolean equals(Location toeq){ //toeq = to *calculate if* equals
//        if (this == toeq) return true;
//        if (toeq == null || getClass() != toeq.getClass()) return false;
//        Location sec = (Location) toeq;
//        return locname == null ? sec.locname == null : locname.equals(sec.locname);
//    }
}

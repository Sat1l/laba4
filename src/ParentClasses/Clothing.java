package ParentClasses;

public class Clothing extends Item{
    private boolean isZipped;

    public Clothing(String name) {
        super(name);
        this.isZipped = false;
    }

    public boolean getIsZipepd(){ return isZipped; }

    public void setIsZipped(boolean zorunz){ // zorunz = zip or unzip
        this.isZipped = zorunz;
    }
}

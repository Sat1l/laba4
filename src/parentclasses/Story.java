package parentclasses;

public class Story {

    public final String name;

    public final String origin;

    public Story(String name, String origin){
        this.name = name;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

}

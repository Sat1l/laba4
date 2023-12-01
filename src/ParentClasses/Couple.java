package ParentClasses;

public abstract class Couple {
    private String name;

    public Couple(String name){ this.name = name; }

    void bringTogether(Item item) {
        System.out.println(this.name + " принесли " + item.name);
    }
}

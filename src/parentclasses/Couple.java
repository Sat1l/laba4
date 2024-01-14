package parentclasses;

import childclasses.Person;

public class Couple {

    private String name;

    private Person husband;

    private Person wife;

    public Couple(String name, Person husband, Person wife){
        this.name = name;
        this.husband = husband;
        this.wife = wife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getHusband(){
        return husband;
    }

    public Person getWife(){
        return wife;
    }

}

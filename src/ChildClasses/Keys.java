package ChildClasses;

import ParentClasses.Item;

public class Keys extends Item {
    private String whatFor;

    public Keys(String name, String whatFor){
        super(name);
        this.whatFor = whatFor;
    }
}

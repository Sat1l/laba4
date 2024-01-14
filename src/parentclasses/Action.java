package parentclasses;

public class Action {

    String actionName;
    public Action(String actionName){
        this.actionName = actionName;
    }

    @Override
    public String toString(){
        return actionName;
    }

    public String getActionName(){
        return actionName;
    }
}

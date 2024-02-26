package actions;

import childclasses.Person;
import childclasses.Shop;
import parentclasses.Action;
import parentclasses.UObject;

public class Buy extends Action {
    public Buy(String actionName){
        super(actionName);
    }

    public void buy(Person buyer, UObject merch, Shop seller){
        buyer.addDoing(this);
        UObject money = hasMoney(buyer);
        if(seller.getInventory().contains(merch) && (money != null)){
            buyer.removeInventory(money);
            seller.addInventory(money);
            seller.removeInventory(merch);
            buyer.addInventory(merch);
        }
        buyer.removeDoing(this);
    }

    private UObject hasMoney(Person person){
        UObject toret = null;
        for (UObject item : person.getInventory()) {
            if (item.getName().equalsIgnoreCase("money")) {
                toret = item;
                break;
            }
        }
        return toret;
    }
}

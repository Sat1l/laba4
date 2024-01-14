import childclasses.*;
import enums.*;
import parentclasses.*;
import actions.*;

public class Main {
    public static void main(String[] args){

        Conditions conditions = new Conditions(AMOUNT.NONE, STRENGTH.WEAK, DIRECTION.WEST);
        Location home = new Location("home");
        Location somewhere = new Location("somewhere"); //used for the loc that is not given/left outta text
        LocManager locManager = new LocManager(home);

        //setting up other locs and things
        LadlowHome ladlowHome = new LadlowHome("Ladlow home", "wake", AMOUNT.PLENTY);
        Party party = new Party("Party", AMOUNT.ALOT);

        //setting up items
        Furniture chairAtHome = new Furniture("chair", home);
        Jacket louisJacket = new Jacket("jacket", false, home);
        UObject sedative = new UObject("sedative", home);
        Journal rachelsJournal = new Journal("journal", home);
        TV tvAtHome = new TV("tv", "little house on the prairie", home);
        Photo gadgesPhoto = new Photo("Gadges photo", "Gadge", home);
        Keys civicKeys = new Keys("keys", "Civic", home);
        Beverage beer = new Beverage("beer", "pint", Boolean.TRUE, ladlowHome);
        Shelve shelveAtHome = new Shelve("shelve", home);
        UObject potWithBurgers = new UObject("Pot with burgers", somewhere);
        UObject quitch = new UObject("quitch", somewhere);
        UObject canendHam = new UObject("canned ham", somewhere);
        UObject coldMaC = new UObject("cold meat and cheeze", somewhere);
        UObject cheeze = new UObject("wheel of Mister Retha", somewhere);
        UObject pie = new UObject("sweet pie", somewhere);
        UObject apples = new UObject("bag of apples", somewhere);

        //setting up the actions
        Ask ask = new Ask("asking");
        Bring bring = new Bring("bringing");
        BringTogether bringTogether = new BringTogether("bringing together");
        Crying crying = new Crying("Crying");
        DrinkAlco drinkAlco = new DrinkAlco("drinking");
        EatSedative eatSedativePast = new EatSedative("Ate sedative");
        FindItem findItem = new FindItem("searching");
        FlipPages flipPages = new FlipPages("flipping through the pages");
        Give give = new Give("giving");
        Holding holding = new Holding("holding");
        NewTuchi newTuchi = new NewTuchi("forming new clouds");
        PutOn putOn = new PutOn("putting on");
        Receive receive = new Receive("receiving");
        Say say = new Say("saying");
        Sit sit = new Sit("sitting on a");
        ThinkToDo thinkToDo = new ThinkToDo("thinking to do");
        Unzip unzip = new Unzip("unzipping");
        WatchTV watchTV = new WatchTV("watching");
        WindBlow windBlow = new WindBlow("blowing wind");
        Zip zip = new Zip("zipping");
        Action tellStories = new Action("tell uncle Carls stories");

        //setting up the characters
        Person louis = new Person("Louis", home);
        louis.addInventory(sedative);
        Person rachel = new Person("Rachel", home);
        Person ellie = new Person("Ellie", home);
        watchTV.watchTV(ellie, tvAtHome);
        ellie.addInventory(gadgesPhoto);
        holding.holding(ellie, gadgesPhoto);
        Person steveMasterton = new Person("Steve Masterton", somewhere);
        steveMasterton.addInventory(potWithBurgers);
        Person msMasterton = new Person("Miss Masterton", somewhere);
        Person charlton = new Person("Charlton", somewhere);
        charlton.addInventory(quitch);
        Person mrDenniker = new Person("mrDenniker", somewhere);
        mrDenniker.addInventory(canendHam);
        Person msDenniker = new Person("msDenniker", somewhere);
        Person mrGoldman = new Person("mrGoldman", somewhere);
        mrGoldman.addInventory(coldMaC);
        Person msGoldman = new Person("msGoldman", somewhere);
        Person jude = new Person("Jude", somewhere);
        jude.addInventory(cheeze);
        Person missDanbridge = new Person("Miss Danbridge", somewhere);
        missDanbridge.addInventory(pie);
        Person hardu = new Person("Surendra Hardu", somewhere);
        hardu.addInventory(apples);

        //setting up the couples
        Couple mastertons = new Couple("Mastertons", steveMasterton, msMasterton);
        Couple dennikers = new Couple("Dennikers", mrDenniker, msDenniker);
        Couple goldmans = new Couple("Goldmans", mrGoldman, msGoldman);

        locManager.setStoryLocation(home);
        newTuchi.newTuchi(conditions);
        windBlow.windBlow(conditions, DIRECTION.WEST, STRENGTH.STRONG);
        putOn.putOn(louis, louisJacket);
        zip.zip(louis, louisJacket);
        findItem.findItem(louis, shelveAtHome, civicKeys);
        ask.ask(rachel, louis, "Where are you going, Lewis?", INTEREST.CARELESS);
        System.out.println("*Scene in the past*");
        crying.crying(rachel);
        give.give(louis, rachel, sedative);
        eatSedativePast.eatSedative(rachel);
        System.out.println("*now*");
        if(rachel.getCondition() == CONDITION.CALM){
            rachel.addInventory(rachelsJournal);
            sit.sit(rachel, chairAtHome);
            flipPages.flipPages(rachel, rachelsJournal, INTEREST.CARELESS);
        } else {
            System.out.println(rachel.getName() + " is "+ rachel.getCondition());
        }
        System.out.println(rachel.getDoingString());
        System.out.println(ellie.getDoingString());
        say.say(louis, "I'll go buy some pizza \n");
        say.say(rachel, "Haven't you eat earlier today? \n");
        say.say(louis, "I didn't want to eat then \n");

        locManager.setStoryLocation(ladlowHome);
        System.out.println(ladlowHome.getLocname() + " " +  ladlowHome.getOccasion());
        louis.setLocation(ladlowHome);
        rachel.setLocation(ladlowHome);
        bringTogether.bringTogether(mastertons, potWithBurgers, ladlowHome);
        bring.bring(charlton, quitch, ladlowHome);
        bringTogether.bringTogether(dennikers, canendHam, ladlowHome);
        bringTogether.bringTogether(goldmans, coldMaC, ladlowHome);
        bring.bring(jude, cheeze, ladlowHome);
        bring.bring(missDanbridge, pie, ladlowHome);
        bring.bring(hardu, apples, ladlowHome);


        if (ladlowHome.equals(party)){
            System.out.println("they basically have a party at ladlows home");
        } else {
            if (party.getAlcoholAmount().toInt() > ladlowHome.getAlcoholAmount().toInt()){
                System.out.println(ladlowHome.getLocname() + " is almost similar to a " + party.getLocname() + ", but has less alcohol ");
            } else {
                System.out.println(ladlowHome.getLocname() + " is almost similar to a " + party.getLocname() + ", but has same/even more alcohol");
            }
        }

        drinkAlco.drinkAlco(louis, beer, AMOUNT.PLENTY);
        thinkToDo.thinkToDo(louis, tellStories);

    }
}

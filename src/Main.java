import childclasses.*;
import enums.*;
import exceptions.IllegalAmountException;
import exceptions.ItemNotInPlaceException;
import parentclasses.*;
import actions.*;

public class Main {
    public static void main(String[] args) throws IllegalAmountException {

        Conditions conditions = new Conditions(Amount.NONE, Strength.WEAK, Direction.WEST);
        Location home = new Location("home");
        Location somewhere = new Location("somewhere"); //used for the loc that is not given/left outta text
        LocManager locManager = new LocManager(home);

        //setting up other locs and things
        LadlowHome ladlowHome = new LadlowHome("Ladlow home", "wake");
        Party party = new Party("Party");
        LocWithAlco orringtonShop = new LocWithAlco("shop in Orrington");

        //setting up items
        Furniture chairAtHome = new Furniture("chair", home);
        Jacket louisJacket = new Jacket("jacket", false, home);
        UObject sedative = new UObject("sedative", home);
        UObject rachelsJournal = new UObject("journal", home);
        TV tvAtHome = new TV("tv", "little house on the prairie", home);
        Photo gadgesPhoto = new Photo("Gadges photo", "Gadge", home);
        Keys civicKeys = new Keys("keys", "Civic", home);
        Beverage beer = new Beverage("beer", "pint", Amount.PLENTY, ladlowHome);
        Beverage vodka = new Beverage("vodka", "bottle", Amount.ALOT, party);
        Storage shelveAtHome = new Storage("shelve", home);
        shelveAtHome.addInventory(civicKeys);
        UObject burgers = new UObject("burgers", somewhere);
        UObject quitch = new UObject("quitch", somewhere);
        UObject canendHam = new UObject("canned ham", somewhere);
        UObject coldMaC = new UObject("cold meat and cheeze", somewhere);
        UObject cheeze = new UObject("wheel of Mister Retha", somewhere);
        UObject pie = new UObject("sweet pie", somewhere);
        UObject apples = new UObject("apples", somewhere);
        Storage silverPlate = new Storage("silver plate", somewhere);
        Storage pot = new Storage("pot", somewhere);
        Storage bag = new Storage("bag", somewhere);
        Storage table = new Storage("table", ladlowHome);
        pot.addInventory(burgers);
        bag.addInventory(apples);

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
        ThinkAbout thinkAbout = new ThinkAbout("thinking about");
        Unzip unzip = new Unzip("unzipping");
        WatchAt watchTV = new WatchAt("watching tv");
        WindBlow windBlow = new WindBlow("blowing wind");
        Zip zip = new Zip("zipping");
        Action tellStories = new Action("tell uncle Carls stories");
        CalmSb calmSb = new CalmSb("calming somebody");
        TransferItems transferItems = new TransferItems("transfering items");
        Action walk = new Action("walk");
        WatchAt watchSb = new WatchAt("watching at");
        Action acceptConds = new Action("accepting condolences");
        Action nodAndThank = new Action("nods and thanks");
        Action diggingUpGraves = new Action("digging up graves");

        //setting up the characters
        Person louis = new Person("Louis", home);
        louis.addInventory(sedative);
        Person rachel = new Person("Rachel", home);
        Person ellie = new Person("Ellie", home);
        watchTV.watchAt(ellie, tvAtHome);
        ellie.addInventory(gadgesPhoto);
        holding.holding(ellie, gadgesPhoto);
        Person steveMasterton = new Person("Steve Masterton", somewhere);
        Person msMasterton = new Person("Miss Masterton", somewhere);
        Person charlton = new Person("Charlton", somewhere);
        charlton.addInventory(quitch);
        Person mrDenniker = new Person("mrDenniker", somewhere);
        Person msDenniker = new Person("msDenniker", somewhere);
        Person irvinGoldman = new Person("Irvin Goldman", somewhere);
        Person doryGoldman = new Person("Dory Goldman", somewhere);
        Person jude = new Person("Jude", somewhere);
        jude.addInventory(cheeze);
        Person missDanbridge = new Person("Miss Danbridge", somewhere);
        missDanbridge.addInventory(pie);
        Person hardu = new Person("Surendra Hardu", somewhere);
        hardu.addInventory(bag);


        //setting up the couples
        Couple mastertons = new Couple("Mastertons", steveMasterton, msMasterton);
        steveMasterton.setPartner(msMasterton);
        mastertons.addInventory(pot);
        Couple dennikers = new Couple("Dennikers", mrDenniker, msDenniker);
        mrDenniker.setPartner(msDenniker);
        dennikers.addInventory(canendHam);
        Couple goldmans = new Couple("Goldmans", irvinGoldman, doryGoldman);
        irvinGoldman.setPartner(doryGoldman);
        goldmans.addInventory(coldMaC);

        locManager.setStoryLocation(home);
        newTuchi.newTuchi(conditions);
        windBlow.windBlow(conditions, Direction.WEST, Strength.STRONG);
        putOn.putOn(louis, louisJacket);
        zip.zip(louis, louisJacket);
        findItem.findItem(louis, shelveAtHome, civicKeys);
        ask.ask(rachel, louis, "Where are you going, Lewis?", Interest.CARELESS);
        System.out.println("*Scene in the past*");
        crying.crying(rachel);
        give.give(louis, rachel, sedative);
        eatSedativePast.eatSedative(rachel);
        System.out.println("*now*");
        if(rachel.getCondition() == Condition.CALM){
            rachel.addInventory(rachelsJournal);
            sit.sit(rachel, chairAtHome);
            flipPages.flipPages(rachel, rachelsJournal, Interest.CARELESS);
        } else {
            System.out.println(rachel.getName() + " is "+ rachel.getCondition());
        }
        System.out.println(rachel.getDoingString());
        System.out.println(ellie.getDoingString());
        say.say(louis, "I'll go Buy some pizza \n");
        say.say(rachel, "Haven't you eat earlier today? \n");
        say.say(louis, "I didn't want to eat then \n");

        locManager.setStoryLocation(ladlowHome);
        System.out.println(ladlowHome.getLocname() + " " +  ladlowHome.getOccasion());
        louis.setLocation(ladlowHome);
        rachel.setLocation(ladlowHome);
        silverPlate.setLocation(ladlowHome);
        try {
            if(bringTogether.bringTogether(mastertons, pot, ladlowHome)){
                transferItems.TransferItems(steveMasterton, pot, burgers, table);
            }
        } catch (ItemNotInPlaceException e) {
            System.out.println(e);
        }
        try {
            if(bring.bring(charlton, quitch, ladlowHome)){
                transferItems.TransferItems(charlton,);
            }
        }
        bringTogether.bringTogether(dennikers, canendHam, ladlowHome);
        bringTogether.bringTogether(goldmans, coldMaC, ladlowHome);
        bring.bring(jude, cheeze, ladlowHome);
        bring.bring(missDanbridge, pie, ladlowHome);
        bring.bring(hardu, apples, ladlowHome);


        if (ladlowHome.equals(party)){
            System.out.println("they basically have a party at ladlows home");
        } else {
            if (party.countAlcohol() > ladlowHome.countAlcohol()){
                System.out.println(ladlowHome.getLocname() + " is almost similar to a " + party.getLocname() + ", but has less alcohol ");
            } else {
                System.out.println(ladlowHome.getLocname() + " is almost similar to a " + party.getLocname() + ", but has same/even more alcohol");
            }
        }

        drinkAlco.drinkAlco(louis, beer, Amount.PLENTY);
        thinkAbout.thinkAbout(louis, tellStories);

        rachel.addDoing(crying);
        calmSb.calmSb(doryGoldman, rachel);
        watchSb.watchAt(irvinGoldman, louis);

        transferItems.TransferItems(ellie, table, burgers, silverPlate);
        ellie.addDoing(walk);

        louis.addDoing(acceptConds);
        louis.addDoing(nodAndThank);
        thinkAbout.thinkAbout(louis, diggingUpGraves);



    }
}

import childclasses.*;
import enums.*;
import exceptions.BuyannyashiyDestroyedEverythingException;
import exceptions.IllegalAmountException;
import exceptions.ItemNotInPlaceException;
import exceptions.LocationMissmatchException;
import interfaces.AuthorPrinterer;
import parentclasses.*;
import actions.*;

public class Main {
    public static void main(String[] args) throws IllegalAmountException {

        class ProgInfo {
            public void printProgInfo(){
                System.out.println("This is a script for lab4. The model was made to follow the cut from the book" +
                        "Pet Cemetery. This class was just made to comply with lab's requirements" +
                        "AND THE STORY BEGINS!");
            }
        }

        AuthorPrinterer authorPrinterer = new AuthorPrinterer() {
            @Override
            public void authorPhint(String text) {
                System.out.println("- " + text + " -");
            }
        };

        ProgInfo progInfo = new ProgInfo();
        Conditions conditions = new Conditions(Amount.NONE, Strength.WEAK, Direction.EAST);
        Location home = new Location("home");
        Location somewhere = new Location("somewhere"); //used for the loc that is not given/left outta text
        LocManager locManager = new LocManager(home);
        ItemMover itemMover = new ItemMover();

        //setting up other locs and things
        LadlowHome ladlowHome = new LadlowHome("Ladlow home", "wake");
        Party party = new Party("Party");
        Shop orringtonShop = new Shop("shop in Orrington");
        Location napoli = new Location("napoli");

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
        Storage pot = new Storage("pot", somewhere);
        pot.addInventory(burgers);
        UObject quitch = new UObject("quitch", somewhere);
        Storage container = new Storage("container", somewhere);
        container.addInventory(quitch);
        UObject canendHam = new UObject("canned ham", somewhere);
        Storage plasticBag = new Storage("bag", somewhere);
        plasticBag.addInventory(canendHam);
        UObject coldMaC = new UObject("cold meat and cheeze", somewhere);
        Storage napkins = new Storage("napkins", somewhere);
        napkins.addInventory(coldMaC);
        UObject cheeze = new UObject("wheel of Mister Retha", somewhere);
        Storage packet = new Storage("packer", somewhere);
        packet.addInventory(cheeze);
        UObject pie = new UObject("sweet pie", somewhere);
        Storage box = new Storage("box", somewhere);
        box.addInventory(pie);
        UObject apples = new UObject("apples", somewhere);
        Storage bag = new Storage("bag", somewhere);
        bag.addInventory(apples);
        Storage silverPlate = new Storage("silver plate", somewhere);
        Storage table = new Storage("table", ladlowHome);
        UObject money1 = new UObject("money", somewhere);
        UObject money2 = new UObject("money", somewhere);

        Beverage packOfBeer1 = new Beverage("Beer", "Pack",Amount.ALOT, orringtonShop);
        Beverage packOfBeer2 = new Beverage("Beer", "Pack",Amount.ALOT, orringtonShop);

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
        Buy buy = new Buy("buying");
        Call call = new Call("calling");

        //setting up the characters
        Person louis = new Person("Louis", home);
        louis.addInventory(sedative);
        louis.addInventory(money1);
        louis.addInventory(money2);
        Person rachel = new Person("Rachel", home);
        Person ellie = new Person("Ellie", home);
        watchTV.watchAt(ellie, tvAtHome);
        ellie.addInventory(gadgesPhoto);
        try {
            holding.holding(ellie, gadgesPhoto);
        } catch (ItemNotInPlaceException e) {
            throw new RuntimeException(e);
        }
        Person steveMasterton = new Person("Steve Masterton", somewhere);
        Person msMasterton = new Person("Miss Masterton", somewhere);
        Person charlton = new Person("Charlton", somewhere);
        charlton.addInventory(container);
        Person mrDenniker = new Person("mrDenniker", somewhere);
        Person msDenniker = new Person("msDenniker", somewhere);
        Person irvinGoldman = new Person("Irvin Goldman", somewhere);
        Person doryGoldman = new Person("Dory Goldman", somewhere);
        Person jude = new Person("Jude", somewhere);
        jude.addInventory(packet);
        Person missDanbridge = new Person("Miss Danbridge", somewhere);
        missDanbridge.addInventory(box);
        Person hardu = new Person("Surendra Hardu", somewhere);
        hardu.addInventory(bag);
        Person napoliDispetcher = new Person("dispetcher at Napoli", napoli);


        //setting up the couples
        Couple mastertons = new Couple("Mastertons", steveMasterton, msMasterton);
        steveMasterton.setPartner(msMasterton);
        mastertons.addInventory(pot);
        Couple dennikers = new Couple("Dennikers", mrDenniker, msDenniker);
        mrDenniker.setPartner(msDenniker);
        dennikers.addInventory(plasticBag);
        Couple goldmans = new Couple("Goldmans", irvinGoldman, doryGoldman);
        irvinGoldman.setPartner(doryGoldman);
        goldmans.addInventory(napkins);

        //story begins
        progInfo.printProgInfo();
        locManager.setStoryLocation(home);
        newTuchi.newTuchi(conditions);
        windBlow.windBlow(conditions, Direction.WEST, Strength.STRONG);
        putOn.putOn(louis, louisJacket);
        try {
            zip.zip(louis, louisJacket);
        } catch (ItemNotInPlaceException e) {
            throw new RuntimeException(e);
        }
        try {
            findItem.findItem(louis, shelveAtHome, civicKeys);
        } catch (ItemNotInPlaceException | LocationMissmatchException e) {
            throw new RuntimeException(e);
        }
        ask.ask(rachel, louis, "Where are you going, Lewis?", Interest.CARELESS);
        authorPrinterer.authorPhint("Scene in the past");
        crying.crying(rachel);
            give.give(louis, rachel, sedative);
        try {
            eatSedativePast.eatSedative(rachel);
        } catch (BuyannyashiyDestroyedEverythingException e) {
            throw new RuntimeException(e);
        }
        authorPrinterer.authorPhint("now");
        rachel.addInventory(rachelsJournal);
        sit.sit(rachel, chairAtHome);
        flipPages.flipPages(rachel, rachelsJournal, Interest.CARELESS);
        System.out.println(rachel.getDoingString());
        System.out.println(ellie.getDoingString());
        say.say(louis, "I'll go Buy some pizza \n");
        say.say(rachel, "Haven't you eat earlier today? \n");
        say.say(louis, "I didn't want to eat then \n");

        locManager.setStoryLocation(ladlowHome);
        authorPrinterer.authorPhint(ladlowHome.toString());
        louis.setLocation(ladlowHome);
        rachel.setLocation(ladlowHome);

        itemMover.moveUObjectToLoc(silverPlate, ladlowHome);
        bringTogether.bringTogether(mastertons, pot, ladlowHome);
        transferItems.transferItems(mastertons, pot, burgers, table);
        bring.bring(charlton, container, ladlowHome);
        transferItems.transferItems(charlton, container, quitch, table);
        bringTogether.bringTogether(dennikers, plasticBag, ladlowHome);
        transferItems.transferItems(dennikers, plasticBag, canendHam, table);
        bringTogether.bringTogether(goldmans, napkins, ladlowHome);
        transferItems.transferItems(goldmans, napkins, coldMaC, table);
        bring.bring(jude, packet, ladlowHome);
        transferItems.transferItems(jude, packet, cheeze, table);
        bring.bring(missDanbridge, box, ladlowHome);
        transferItems.transferItems(missDanbridge, napkins, coldMaC, table);
        bring.bring(hardu, bag, ladlowHome);
        transferItems.transferItems(hardu, bag, apples, table);
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
        try {
            calmSb.calmSb(doryGoldman, rachel);
        } catch (BuyannyashiyDestroyedEverythingException e) {
            throw new RuntimeException(e);
        }
        watchSb.watchAt(irvinGoldman, louis);

        transferItems.transferItems(ellie, table, burgers, silverPlate);
        ellie.addDoing(walk);

        louis.addDoing(acceptConds);
        louis.addDoing(nodAndThank);
        thinkAbout.thinkAbout(louis, diggingUpGraves);
        louis.removeDoing(thinkAbout);

        louis.setLocation(orringtonShop);
        buy.buy(louis, packOfBeer1, orringtonShop);
        buy.buy(louis, packOfBeer2, orringtonShop);

        call.call(louis, napoliDispetcher);
        say.say(napoliDispetcher, "can i get ur name sir\n");
        thinkAbout.thinkAbout(louis, "Oz great and scary");
        louis.removeDoing(thinkAbout);
        say.say(louis,"lu kreed\n");
        say.say(napoliDispetcher, "we're busy well do this in 45mins, thats ok?\n");
        say.say(louis, "yep thats good");
        call.hangUp(louis, napoliDispetcher);
    }
}

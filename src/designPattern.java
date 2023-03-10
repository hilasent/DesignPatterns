import java.util.ArrayList;

public class designPattern {
    public static void main(String[] args) {
//        // Observer Pattern
//        Subject subject = new Subject();
//
//        OctalObserver octalObserver = new OctalObserver(subject);
//        subject.addObserver(octalObserver);
//        BinaryObserver binaryObserver = new BinaryObserver(subject);
//        subject.addObserver(binaryObserver);
//
//
//        System.out.println("First state change: 15");
//        subject.setState(15);
//        System.out.println("Second state change: 10");
//        subject.setState(10);
//        System.out.println("The List of Observers" + subject.observers);
//
//        // Decorator Pattern
//
//        Waffle basicWaffe = new PlainWaffle();
//        System.out.println("ingredient:" + basicWaffe.getDescpription());
//        System.out.println("Total price: " + basicWaffe.getCost());
//
//        Waffle WaffleWithIceCream = new WithIceCream(new PlainWaffle());
//        System.out.println("ingredient:" + WaffleWithIceCream.getDescpription());
//        System.out.println("Total price: " + WaffleWithIceCream.getCost());
//
//        Waffle wf = new PlainWaffle();
//        wf = new WhiteChocolate(wf);
//        wf = new WhiteChocolate(wf);
//        wf = new WithIceCream(wf);
//        System.out.println("ingredient:" + wf.getDescpription());
//        System.out.println("Total price: " + wf.getCost());
//
//
//        Waffle allIngrediments = new WhiteChocolate(new WithIceCream(new PlainWaffle()));
//        System.out.println("ingredient:" + allIngrediments.getDescpription());
//        System.out.println("Total price: " + allIngrediments.getCost());
//
//        // factory pattern
//        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
//        PizzaStore pStore = new PizzaStore(pizzaFactory);
//        pStore.orderPizza("cheese");
//        pStore.orderPizza("pepperoni");

        // command pattern
//        ElectronicDevice newDevice = new Television();
//
//        TurnTvOn onCommand = new TurnTvOn(newDevice);
//
//        DeviceButton onPressed = new DeviceButton(onCommand);
//
//        onPressed.press();

        // adapter pattern

//        MallardDuck mallarDuck = new MallardDuck();
//        WildTurkey turkey = new WildTurkey();
//        // Then we wrap Turkey in a TurkeyAdapter which makes looks like a Duck
//        Duck turkeyAdapter = new TurkeyAdapter(turkey);
//
//        System.out.println("The duck sayss ");
//        testDuck(mallarDuck);
//        System.out.println("The duck says without method ");
//        mallarDuck.fly();
//        mallarDuck.quack();
//        System.out.println("The turkey sayss without adapter ");
//        turkey.gobble();
//        turkey.fly();
//        System.out.println("Now lets try to pass the turkey as duck ");
//        testDuck(turkeyAdapter);

//          MallardDuck mallardDuck = new MallardDuck();
//          WildTurkey turkey = new WildTurkey();
//          BluePeacock peacock = new BluePeacock();
//
//          Duck turkeyAdapter = new TurkeyAdapter(turkey);
//          Duck peacockAdapter = new peacockAdapter(peacock);
//
//          testDuck(turkeyAdapter);
//          testDuck(peacockAdapter);
//
//    }
//
//    static void testDuck(Duck duck){
//        duck.quack();
//        duck.fly();
//
//    }

//        // Facade Design Pattern
//        Amplifier amp = new Amplifier();
//        Tuner tuner = new Tuner();
//        DvdPlayer dvd = new DvdPlayer();
//        CdPlayer cd = new CdPlayer();
//        Projector projector = new Projector();
//        TheaterLights screen = new TheaterLights();
//        Screen lights = new Screen();
//        PopcornPopper popper = new PopcornPopper();
//        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
//        homeTheaterFacade.watchMovie("Game of Thrones");

//
//        // Template Method Design Pattern
//        System.out.println("For customer 1: ");
//        Coffee coffee = new Coffee();
//        coffee.prepareRecipe();
//        System.out.println("-------------------------------------------------");
//        System.out.println("For customer 2: ");
//        Tea tea = new Tea();
//        tea.prepareRecipe();


        //Without  Iterator Design Pattern
//        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
//
//        DinerMenu dinerMenu = new DinerMenu();
//        MenuItem lunchItems[] = dinerMenu.getMenuItems();
//
//        for(int i=0; i< breakfastItems.size(); i++){
//            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
//            System.out.println(menuItem.getName() + " ");
//            System.out.println(menuItem.getDesc() + " ");
//            System.out.println(menuItem.getVegetarian() + " ");
//            System.out.println(menuItem.getPrice() + " ");
//        }
//
//        for(int i=0; i<lunchItems.length; i++){
//          MenuItem menuItem = lunchItems[i];
//            System.out.println(menuItem.getName() + " ");
//            System.out.println(menuItem.getDesc() + " ");
//            System.out.println(menuItem.getVegetarian() + " ");
//            System.out.println(menuItem.getPrice() + " ");
//        }


        // with Iterator Pattern

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();











    }
}
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

        MallardDuck mallarDuck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        // Then we wrap Turkey in a TurkeyAdapter which makes looks like a Duck
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The duck sayss ");
        testDuck(mallarDuck);
        System.out.println("The duck says without method ");
        mallarDuck.fly();
        mallarDuck.quack();
        System.out.println("The turkey sayss without adapter ");
        turkey.gobble();
        turkey.fly();
        System.out.println("Now lets try to pass the turkey as duck ");
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();

    }
}
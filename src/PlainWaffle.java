public class PlainWaffle implements Waffle {
    @Override
    public String getDescpription() {
        return "The waffle with banana, strawberry, kiwi";
    }

    @Override
    public Double getCost() {
        return 10.00;
    }

    // This class gonna be my simplest waffle, basic waffle, concrete class
    //The ConcreteComponent is the object we’re going to dynamically add new behavior to. It extends Component.

}

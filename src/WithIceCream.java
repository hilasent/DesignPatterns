public class WithIceCream extends ToppingDecorator{
    public WithIceCream(Waffle newWaffle) {
        super(newWaffle);
        System.out.println("Adding ice cream to waffle");
    }


    @Override
    public String getDescpription() {
        return tempWaffle.getDescpription() + ",ice cream";
    }

    @Override
    public Double getCost() {
        return tempWaffle.getCost() + .50;
    }
}

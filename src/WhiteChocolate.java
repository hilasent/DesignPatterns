public class WhiteChocolate extends ToppingDecorator {
    public WhiteChocolate(Waffle newWaffle) {
        super(newWaffle);
        System.out.println("Adding white chocolate");
    }

    @Override
    public String getDescpription() {
        return tempWaffle.getDescpription() + ", white chocolate";
    }

    @Override
    public Double getCost() {
        return tempWaffle.getCost() + 0.75;
    }
}

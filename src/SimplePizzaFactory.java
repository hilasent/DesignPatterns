public class SimplePizzaFactory {
    public Pizza createPizza(String type) {

        if(type.equals(null)){
            return null;
        }
        else if(type.equals("cheese")){
            return new CheesePizza();
        }
        else if(type.equals("pepperoni")){
            return new PepperoniPizza();
        }
        return null;
    }
}

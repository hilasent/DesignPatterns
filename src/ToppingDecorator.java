abstract class ToppingDecorator implements Waffle{

protected Waffle tempWaffle;

//Each decorator HAS-A (wraps) a component, which means the decorator has an
//instance variable that holds a reference to a component
//Decorators implement the same interface or abstract class as the component the are going to decorate.

public ToppingDecorator(Waffle newWaffle){

    tempWaffle = newWaffle;

}

public String getDescription(){
    return tempWaffle.getDescpription();

}

public Double getCost(){
    return tempWaffle.getCost();

}

}

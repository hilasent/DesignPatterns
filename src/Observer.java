public abstract class Observer {

    protected Subject subject;

    public abstract void update();
    // observerın içinde tek bir metot olması yeterlidir. Update olabilir, notfy olabilir.

}

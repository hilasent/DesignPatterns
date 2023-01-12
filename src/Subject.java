import java.util.ArrayList;
import java.util.List;

public class Subject {

    // Subject interface'inde bulunan bütün metotlar zorunludur. Bu subjecte abone olacak observerları eklemesi gerekiyor. Bu publishers. Yayınlayıcı.
    // Yayınlayıcı demek, sen bir gatesin ve sadece abone olanlara haber gönderebilirsin. Subject gazete, abone olanlarda observer.
    // Bi değişiklik yaptığında bütün observerlara haber vermesi gerekiyor. Peki bu observerları nasıl bilgilendirecek.
    // Kendisine abone olan observerları öncelikle bir listede tutacak.

    List<Observer> observers = new ArrayList<Observer>();
    private int state;

    int getState(){
        return this.state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    // bilgiyi yayınladığı metodu değişiklik yaptığı metoda eklemesi gerekiyor. Yani set ettiğimiz metoda.
    // setState state'i değiştirdiğimiz bir metot. State değiştiği zaman notifyAllObservers() metodu çalışacak ve diğer observerlara haber verecek.

    private void notifyAllObservers() {
         for(int i=0; i< observers.size(); i++) {
             Observer o = observers.get(i);
             o.update();
         }
    }

    public void addObserver(Observer o){
        observers.add(o);
    }



}

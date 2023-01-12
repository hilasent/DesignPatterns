public class DvdPlayer {
    Amplifier amplifier;

    public void on(){
        System.out.println("The dvd player is on");

    }

    public void off(){
        System.out.println("The dvd player is off");

    }

    public void play(String movie){
        System.out.println("DVD player is playing " + movie);

    }

    public void stop(){
        System.out.println("Dvd player is stopped!");

    }
}

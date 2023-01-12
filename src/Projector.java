public class Projector {

    DvdPlayer dvd;

    public Projector() {

    }

    public Projector(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public void on(){
        System.out.println("Projector is on!");

    }

    public void off(){
        System.out.println("Projector is off!");

    }

    public void wideScreenMode(){
        System.out.println("Projector wide screen mode (aspect 16x9)");
    }

}

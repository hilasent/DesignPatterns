public class Amplifier {
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    int volume = 0 ;

    public Amplifier(Tuner newTuner, DvdPlayer newDvd, CdPlayer newCd){
        this.cd = newCd;
        this.dvd = newDvd;
        this.tuner = newTuner;

    }

    public Amplifier() {

    }

    public void on(){
        System.out.println("Amplifier is on");
    }

    public void off(){
        System.out.println("Amplifier is off");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
        System.out.println("The dvd which you select the " + this.dvd + " will be play ");
    }

    public void setCd(CdPlayer cd) {
        this.cd = cd;
        System.out.println("The cd which you select the " + this.cd + " will be play ");
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Volume is on " + this.volume);

    }


}

public class OctalObserver extends  Observer{


    public OctalObserver(Subject subject){
        this.subject = subject;

    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + subject.getState()  );

    }
}

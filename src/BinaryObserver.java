class BinaryObserver extends Observer {

    public  BinaryObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " +  subject.getState()  );
    }
}

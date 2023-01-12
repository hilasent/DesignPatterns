public class peacockAdapter implements Duck{
    BluePeacock bluePeacock;

    public peacockAdapter(BluePeacock newpeacock){
        this.bluePeacock = newpeacock;

    }

    @Override
    public void quack() {
        bluePeacock.veep();
    }

    @Override
    public void fly() {
        bluePeacock.showTail();
    }
}

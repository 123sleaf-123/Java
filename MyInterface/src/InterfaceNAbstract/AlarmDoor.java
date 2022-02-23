package InterfaceNAbstract;

public class AlarmDoor extends Door implements Alarm{
    @Override
    public boolean open() {
        return false;
    }

    @Override
    public boolean close() {
        return false;
    }

    @Override
    public void alarm() {
        System.out.println("Biu~biu~biu~biu~biu");
    }
}

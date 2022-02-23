package RelationItfNClass;

public class Son extends Father implements ItfA, ItfC, ItfOne{
    @Override
    public void Unknown() {
        super.Unknown();
    }

    @Override
    public int[] allocatePoints() {
        return new int[0];
    }

    @Override
    public int StochasticBuff() {
        return 0;
    }

    @Override
    public void show() {
        System.out.println("Damn it!");
    }
}

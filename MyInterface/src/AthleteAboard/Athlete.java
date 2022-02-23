package AthleteAboard;

public abstract class Athlete extends Human{
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void exercise();
}

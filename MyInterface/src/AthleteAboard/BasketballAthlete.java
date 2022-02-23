package AthleteAboard;

public class BasketballAthlete extends Athlete{
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Basketball athlete is eating meat and eggs.");
    }

    @Override
    public void exercise() {
        System.out.println("Basketball athlete is exercising basketball.");
    }
}

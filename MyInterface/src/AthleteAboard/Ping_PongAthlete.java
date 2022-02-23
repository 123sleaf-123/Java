package AthleteAboard;

public class Ping_PongAthlete extends Athlete implements LanguageLearning{
    public Ping_PongAthlete() {
    }

    public Ping_PongAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Ping pong ball athlete is eating meat and eggs.");
    }

    @Override
    public void exercise() {
        System.out.println("Ping pong ball athlete is exercising Ping pong ball.");
    }

    @Override
    public void English() {
        System.out.println("Ping pong ball athlete is learning English to go aboard for communication");
    }
}

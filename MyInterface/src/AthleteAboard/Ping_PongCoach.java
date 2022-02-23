package AthleteAboard;

public class Ping_PongCoach extends Coach implements LanguageLearning{
    public Ping_PongCoach() {
    }

    public Ping_PongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Ping pong ball coach is eating beef noodles with an egg.");
    }

    @Override
    public void train() {
        System.out.println("Ping pong ball coach is training Ping pong ball.");
    }

    @Override
    public void English() {
        System.out.println("Ping pong ball coach is learning English to go aboard for communication");
    }
}

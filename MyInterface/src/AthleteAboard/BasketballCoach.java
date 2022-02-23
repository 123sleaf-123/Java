package AthleteAboard;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Basketball coach is eating pork steaks with an egg.");
    }

    @Override
    public void train() {
        System.out.println("Basketball coach is training basketball.");
    }
}

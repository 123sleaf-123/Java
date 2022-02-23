package InterfaceAnimals;

public class Cat extends Animal implements Jumping{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat eat fish.");
    }

    @Override
    public void jump() {
        System.out.println("Cat jumps.");
    }
}

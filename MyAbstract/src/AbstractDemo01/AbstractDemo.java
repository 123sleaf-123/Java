package AbstractDemo01;

public class AbstractDemo {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
        cat.sleep();

        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}

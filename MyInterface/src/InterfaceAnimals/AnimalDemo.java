package InterfaceAnimals;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());

        cat.setAge(4);
        cat.setName("Shit");

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
//        cat.jump();
        cat.jump();
        cat.eat();

        Cat cat2 = new Cat("Susy", 7);
        System.out.println(cat2.getName());
        System.out.println(cat2.getAge());
        cat2.eat();
        cat2.jump();
    }
}

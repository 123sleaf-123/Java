package AbstractDogNCat;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal cat_01 = new Cat();
        Animal dog_01 = new Dog();
        cat_01.eat();
        dog_01.eat();
        System.out.println(cat_01.getAge() + " " + cat_01.getName());
        System.out.println(dog_01.getAge() + " " + dog_01.getName());

        cat_01.setName("Sally");
        cat_01.setAge(5);

        dog_01.setName("Tom");
        dog_01.setAge(10);
        System.out.println(cat_01.getAge() + " " + cat_01.getName());
        System.out.println(dog_01.getAge() + " " + dog_01.getName());


        Animal cat_02 = new Cat("Kelly", 4);
        Animal dog_02 = new Dog("Bell", 6);

        cat_02.eat();
        dog_02.eat();
        System.out.println(cat_02.getAge() + " " + cat_02.getName());
        System.out.println(dog_02.getAge() + " " + dog_02.getName());
    }
}

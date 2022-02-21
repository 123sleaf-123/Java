package PolymorDemo02;

public class PolyDemo {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
//        Cat cat = new Cat();
//        Dog dog = new Dog();
        AnimalOperator animalOperator = new AnimalOperator();
        animalOperator.useAnimal(cat);
        animalOperator.useAnimal(dog);
    }
}

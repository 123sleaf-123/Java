package PolymorDemo02;

public class AnimalOperator {
    public void useAnimal(Animal animal) {
        if (animal == null) {
            return;
        }
        animal.eat();
    }
//    public void useAnimal(Cat cat) {
//        if (cat == null) {
//            return;
//        }
//        cat.eat();
//    }
//    public void useAnimal(Dog dog) {
//        if (dog == null) {
//            return;
//        }
//        dog.eat();
//    }
}

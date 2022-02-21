package PolymorDemo01;

public class Cat extends Animal{
    public int age = 8;
    public float weight = 10.5f;

    @Override
    public void eat() {
        System.out.println("Cat is eating fish.");
    }
}

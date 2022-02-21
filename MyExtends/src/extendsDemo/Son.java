package extendsDemo;

public class Son extends Father {
    public Son() {
        super();
        System.out.println("Construction method of Son class without parameters is called.");
    }

    public Son(int a) {
        super();
        System.out.println("Construction method of Son class with parameters is called.");
    }

    public void show_son() {
        System.out.println("Method 'show_son' is called.");
        System.out.println(this.height);
        System.out.println(super.height);
    }
    public float height = 1.79f;
}

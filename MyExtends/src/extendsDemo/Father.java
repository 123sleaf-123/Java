package extendsDemo;

public class Father {
    public Father() {
        System.out.println("Construction method of Father class without parameters is called.");
    }

    public Father(int a) {
        System.out.println("Construction method of Father class with parameters is called.");
    }
    
    public void show() {
        System.out.println("Method 'show' is called.");
    }
    protected float height = 1.88f;
    private float weight = 70.5f;
}

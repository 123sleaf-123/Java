package OverridingDemo;

public class ExtendDemoMain {
    public static void main(String[] args) {
        Phone p = new Phone();
        String name = "Theresa";
        p.call(name);

        NewPhone np = new NewPhone();
        np.call(name);
    }
}

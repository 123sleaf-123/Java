package InnerDemo01;

public class Outer {
    public int val = 10;

    public class Inner {
        public void show() {
            System.out.println(val);
        }
    }
}

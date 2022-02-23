package InnerDemo02;

public class Outer {
    public int val = 10;

    private class Inner {
        public void show() {
            System.out.println(val);
        }
    }

    public void method() {
        Inner inner = new Inner();
        inner.show();
    }
}

package LocalInnerClassDemo01;

public class Outer {
    private int var1 = 10;
    public String var2 = "shit";

    public void method() {
        int var_in_1 = 15;

        class Inner {
            public void method() {
                // private attribute of outer class
                System.out.println("var1 = " + var1);

                // private attribute of outer class
                System.out.println("var2 = " + var2);

                // variable in local method
                System.out.println("var_in_1 = " + var_in_1);
            }
        }

        Inner inner = new Inner();
        inner.method();
    }
}

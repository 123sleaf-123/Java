package Method;

public class Overload {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.0f, 2.0f));
        System.out.println(sum(1.0, 2.0));
        System.out.println(sum((byte) 1, (byte) 2));
        System.out.println(sum((short) 1, (short) 2));
    }

    public static void method_1(int input) {
    }

//    You can't do this without changing the types or number of variables to overload a method
//    public static int method_1(int input) {
//        return 1;
//    }
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static float sum(float a, float b) {
        float sum = a + b;
        return sum;
    }

    public static double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static byte sum(byte a, byte b) {
        byte sum = (byte) (a + b);
        return sum;
    }

    public static short sum(short a, short b) {
        short sum = (short) (a + b);
        return sum;
    }
}

package Method;

public class Fibonacci {
    public static void main(String[] args) {
        int limit = 80;
        long[] f = new long[limit];
        f[0] = 1;
        f[1] = 1;
        for(int i = 2; i < limit; i++) {
            f[i] = f[i-1] + f[i-2];
            System.out.printf("f[%d] = %d\n", i, f[i]);
        }
    }
}

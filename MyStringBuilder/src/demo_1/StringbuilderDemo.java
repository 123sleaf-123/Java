package demo_1;

public class StringbuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1: " + sb1);
        System.out.println("sb1.length(): " + sb1.length() );

        StringBuilder sb2 = new StringBuilder("Hello, world!");
        System.out.println("sb2: " + sb2);
        System.out.println("sb2.length(): " + sb2.length() );

        StringBuilder sb3 = sb2.append('.');
        System.out.printf("sb2 == sb3 is '%s' == '%s', which is %b.\n", sb2, sb3 , (sb2 == sb3));

        System.out.println("sb1.append(\"Hello\").append(\", \").append(\"world!\") is " + sb1.append("Hello").append(", ").append(100));
        System.out.printf("sb1 is \"%s\"\n", sb1);

        System.out.printf("sb1.reverse() is \"%s\"\n", sb1.reverse());
        System.out.printf("sb1 is \"%s\"\n", sb1);
    }
}

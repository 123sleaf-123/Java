// A class in the same package but doesn't extend from class Father

package Demo01;

public class Demo01 {
    public static void main(String[] args) {
        Father f = new Father();
        f.show2();
        f.show3();
        f.show4();

        Son s = new Son();
        s.show2();
        s.show3();
        s.show4();
    }
}

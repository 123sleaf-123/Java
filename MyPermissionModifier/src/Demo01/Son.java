// A class in the same package and extends from class Father

package Demo01;

public class Son extends Father{
    public Son() {
        System.out.println("In Son:");
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.show2();
        s.show3();
        s.show4();
    }
}

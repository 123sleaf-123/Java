// A class out of package but extends from class Father

package Demo01_extend;

import Demo01.Father;

public class Daughter extends Father {
    public Daughter() {
        System.out.println("In Daughter:");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.show4();

        Daughter d = new Daughter();
        d.show3();
        d.show4();
    }
}

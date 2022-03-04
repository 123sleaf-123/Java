// Class out of package and has no extension

package Demo01_extend;

import Demo01.Father;

public class Demo02 {
    public static void main(String[] args) {
        Father f = new Father();
        f.show4();

        Daughter d = new Daughter();
        d.show4();
//        d.show3();
    }
}

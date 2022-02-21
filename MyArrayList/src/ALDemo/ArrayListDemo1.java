package ALDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        System.out.println("array = " + array);

        array.add("Hello");
        array.add("world");
        array.add("JavaSE");

        System.out.println("array = " + array);

        array.add(2, "Java");
        System.out.println("array = " + array);

        array.add(4, "100");
        System.out.println("array = " + array);

//        Index Out Of Bounds Exception
//        array.add(6, "fuck!");
//        System.out.println("array = " + array);

//        public boolean remove(Object o);
        System.out.println("array.remove(\"100\") is " + array.remove("100"));
        System.out.println("array = " + array);

//        public E remove(int idx);
        System.out.println("array.remove(3) is " + array.remove(3));
        System.out.println("array = " + array);

//        Index Out Of Bounds Exception
//        System.out.println("array.remove(3) again is " + array.remove(3));

        System.out.println("array.set(2, \"JavaEE\") is " + array.set(2, "JavaEE"));
        System.out.println("array = " + array);

//        Index Out Of Bounds Exception
//        System.out.println("array.set(3, \"JavaSE\") is " + array.set(3, "JavaSE"));

        for (int i = 0; i < array.size(); i++) {
            System.out.printf("array.get(%d) = %s\n", i, array.get(i));
        }

//        Index Out Of Bounds Exception
//        System.out.println("array.get(3) = " + array.get(3));

        System.out.println("array.size() is " + array.size());
        System.out.println("array = " + array);
    }
}

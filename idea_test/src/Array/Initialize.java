package Array;

import java.util.Random;

public class Initialize {
    public static void main(String[] args) {
//        Dynamic array initialize
        int[] arr = new int[3];
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            arr[i] = r.nextInt(10);
            System.out.println("arr[i] = " + arr[i]);
        }

//        Second variable store the same pointer
        int[] arr2 = arr;
        for (int i = 0; i < 3; i++) {
            arr2[i] = r.nextInt(10);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[i] = " + arr2[i]);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }

//        Statistic array initialize
        int[] arr3 = {r.nextInt(100, 200), r.nextInt(50), r.nextInt(-50, 20)};
        System.out.println("arr3 = " + arr3);
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[i] = " + arr3[i]);
        }
//        arr.length
        System.out.println("arr.length");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr3[i] = " + arr3[i]);
        }

        System.out.println();

//        store pointer itself
//        int[] arr_pt;
//        arr_pt =  [I@6d03e736;
//        fail!

    }
}

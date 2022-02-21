package Strings;

public class intSequence2String {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String s = array2String(arr);
        System.out.println(s);
    }

    // Old method
//    public static String array2String(int[] arr) {
//        char[] chs = new char[arr.length * 3];
//        chs[0] = '[';
//        for (int i = 0; i < arr.length; i++) {
//            chs[3 * i + 1] = (char) (arr[i] + 48);
//            if (i + 1 != arr.length) {
//                chs[3 * i + 2] = ',';
//                chs[3 * (i + 1)] = ' ';
//            }
//        }
//        chs[chs.length - 1] = ']';
//        String s = new String(chs);
//        return s;
//    }

    public static String array2String(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            if (i + 1 == arr.length)
                continue;
            s += ", ";
//            s += ' ';
        }
        s += ']';
        return s;
    }
}

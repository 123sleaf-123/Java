package IntegerExe01;

import java.util.Arrays;

public class Solution {
    public String StringDataSort(String str) {
        String[] s = str.split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
//        str = Arrays.toString(arr);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                stringBuilder.append(arr[i]).append(" ");
            }
            else
                stringBuilder.append(arr[i]);
        }
        return stringBuilder.toString();
    }
}

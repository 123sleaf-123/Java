package Method;

public class IsSameArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {1, 2, 3, 4, 5, 60};
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7};
        int[][] arrs = {arr1, arr2, arr3, arr4, arr5};
        for (int i = 1; i < arrs.length; i++){
            System.out.println(IsArrSame(arrs[0], arrs[i]));
        }
    }

    public static boolean IsArrSame(int[] arr1, int[] arr2) {
        int len;
        if (arr1.length != arr2.length)
            return false;
        else
            len = arr1.length;
        for (int i = 0; i < len; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}

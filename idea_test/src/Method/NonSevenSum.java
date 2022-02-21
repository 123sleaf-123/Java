package Method;

public class NonSevenSum {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int[] arr_suit = new int[arr.length];
    }

    public static boolean rule(int num) {
        if (num/10%10!=7 && num%10!=7 && num%2!=0)
            return true;
        else
            return false;
    }
}

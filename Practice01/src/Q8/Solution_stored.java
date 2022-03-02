package Q8;

public class Solution_stored {
    public static void main(String[] args) {
        String res = "";
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                res += i * j + " ";
            }
            res += '\n';
        }
        System.out.println(res);
    }
}

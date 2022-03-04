package Q9;

/**
 * @author QMUL
 * @<code>
 *     class
 * </code>
 */
public class Website {
    public static void main(String[] args) {
        int i = 8, j = 9;
        boolean test;
        test = i > 7 && j-- > i++;
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}

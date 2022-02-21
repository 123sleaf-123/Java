package Strings;

import java.util.Scanner;

public class InverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an string: ");
        String s = sc.nextLine();
        System.out.printf("The inverse string of '%s' is '%s'.\n", s, inverse(s));
    }

    public static String inverse(String s) {
        String invs = "";
        for (int i = 0; i < s.length(); i++) {
            invs += s.charAt(s.length() - i - 1);
        }
        return invs;
    }
}

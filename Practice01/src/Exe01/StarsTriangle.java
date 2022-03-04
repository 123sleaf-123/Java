package Exe01;

public class StarsTriangle {
    public static void main(String[] args) {
        int col = 0;
        int row = 0;
        int size = 8;
        while (row < size) {
            col = 0;
            while (col <= row) {
                System.out.print('*');
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}

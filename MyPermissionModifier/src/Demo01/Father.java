package Demo01;

public class Father {
    public Father() {
        System.out.println("In Father:");
    }

    private void show1() {
        System.out.println("Private method is called.");
    }

    void show2() {
        System.out.println("Default method is called.");
    }

    protected void show3() {
        System.out.println("Protected method is called.");
    }

    public void show4() {
        System.out.println("Public method is called.");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}

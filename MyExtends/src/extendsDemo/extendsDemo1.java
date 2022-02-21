package extendsDemo;

public class extendsDemo1 {
    public static void main(String[] args) {
        Father father = new Father();
        father.show();
        System.out.println(father.height + "m");
//        System.out.println(father.weight);

        System.out.println("============== Step: Son son = new Son(); ===============");
        Son son = new Son();
        son.show_son();
        son.show();
        System.out.println(son.height + "m");
        System.out.println();
    }
}

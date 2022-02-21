package Keyword_final.FinalVarDemo01;

public class VarDemo {
    public static void main(String[] args) {
        final int age = 23;
//        age = 66;
        System.out.println(age);

        final Student s = new Student();
        s.age = 20;
        System.out.println(s.age);

//        s = new Student();
    }
}

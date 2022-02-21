package StaticDemo01;

public class Student {
    public String name;
    public int age;
    public static String university = "St. Freya's College";
    public String resume;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show1() {
        System.out.println(name + ", " + age + ", " + university);
    }

    public void show2() {
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
        show4();
    }

    public static void show3() {
//        show1();
    }

    public static void show4() {
//        System.out.println(name);
        System.out.println(university);
        show3();
//        show4();
    }
}

package StaticDemo01;

public class StaDemo {
    public static void main(String[] args) {
        Student CollegeMaster = new Student("Theresa", 45);
//        CollegeMaster.university = "St. Freya's College";
        CollegeMaster.show1();

        Student Kiana = new Student("Kiana Kaslana", 16);
//        Kiana.university = "";
        Kiana.show1();

        Student Mei = new Student("Raiden Mei", 17);
        Mei.show1();

        Student Bronya = new Student("Bronya Zaychik", 14);
        Bronya.show1();
    }
}

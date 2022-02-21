package Demo;

public class PhoneUse {
    public static void main(String[] args) {
        Phone p = new Phone();
//        System.out.println(p.getBrand() + "," + p.price);
//        System.out.println(p.getBrand() + ", " + p.getPrice());
        p.show();

//        p.getBrand() = "Mi";
//        p.price = 2399;
//        p.setBrand(null);
//        p.setBrand("");
//        p.setBrand("nmslnmslnmslnmsl");
        p.setBrand("Huawei");
        p.setPrice(4999);
//        p.setPrice(249999);

//        System.out.println(p.getBrand() + "," + p.price);
//        System.out.println(p.getBrand() + ", " + p.getPrice());
        p.show();

        p.call();
        p.message();

        Phone pp = new Phone("MI6", 1999);
        pp.show();

    }
}

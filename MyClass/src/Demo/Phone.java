package Demo;

public class Phone {
    private String brand;
    private int price;

    public Phone() {
        setBrand("哼，哼哼啊啊啊啊啊");
        setPrice(114514);
    }

    public Phone(String brand, int price) {
        setBrand(brand);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && brand.length() < 15) {
            this.brand = brand;
        } else {
            for (int i = 0; i < 20; i++) {
                System.out.print("=");
            }
            System.out.print("\n");
            System.out.println("Invalid input!");
            for (int i = 0; i < 20; i++) {
                System.out.print("=");
            }
            System.out.print("\n");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0 && price <= 100000) {
            this.price = price;
        } else {
            for (int i = 0; i < 20; i++) {
                System.out.print("=");
            }
            System.out.print("\n");
            System.out.println("Invalid input!");
            for (int i = 0; i < 20; i++) {
                System.out.print("=");
            }
            System.out.print("\n");
        }
    }

    public void show() {
        System.out.println(getBrand() + ", " + getPrice());
    }

    public void call() {
        System.out.println("打电话……");
    }

    public void message() {
        System.out.println("Send message!");
    }

}

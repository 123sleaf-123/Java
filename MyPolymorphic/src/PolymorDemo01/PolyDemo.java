package PolymorDemo01;

/*
1、有继承（类）/实现（接口）关系
2、有方法重写
3、有父类对象指向子类对象
*/

public class PolyDemo {
    public static void main(String[] args) {
        Animal ani = new Cat();
        ani.eat();
        System.out.println(ani.name);
        System.out.println(ani.age);
//        System.out.println(ani.weight);
    }
}

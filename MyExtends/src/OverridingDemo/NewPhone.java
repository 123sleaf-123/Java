package OverridingDemo;

public class NewPhone extends Phone{
    @Override
    public void call(String name) {
        System.out.println("Activating video module...");
        super.call(name);
    }

//    @Override
//    public void OldGame(String name) {
//        System.out.println("Can't play.");
//    }

//    @Override
//    public void message(String text, String rec) {
//        System.out.println("Sending message to " + rec + " with Wifi.");
//        System.out.println(text);
//    }
//    @Override
//    void message(String text, String rec) {
//        System.out.println("Sending message to " + rec + " with Wifi.");
//        System.out.println(text);
//    }
}

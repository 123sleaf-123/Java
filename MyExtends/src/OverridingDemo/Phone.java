package OverridingDemo;

public class Phone {
    public void call(String name) {
        System.out.println("Call " + name + " on this phone.");
    }

    private void OldGame(String name) {
        System.out.println("Play a game" + name);
    }

    public void message(String text, String rec) {
        System.out.println("Sending message to " + rec);
        System.out.println(text);
    }
}

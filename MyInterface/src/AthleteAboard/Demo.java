package AthleteAboard;

public class Demo {
    public static void main(String[] args) {
        Ping_PongAthlete ping_pongAthlete = new Ping_PongAthlete();
        ping_pongAthlete.eat();
        ping_pongAthlete.sleep();
        ping_pongAthlete.exercise();
        ping_pongAthlete.English();
        System.out.println(ping_pongAthlete.getName() + " " + ping_pongAthlete.getAge());
        ping_pongAthlete.setName("Lemon");
        ping_pongAthlete.setAge(16);
        System.out.println(ping_pongAthlete.getName() + " " + ping_pongAthlete.getAge());

        Ping_PongAthlete ping_pongAthlete_01 = new Ping_PongAthlete("Timmy", 14);
        ping_pongAthlete_01.eat();
        ping_pongAthlete_01.sleep();
        ping_pongAthlete_01.exercise();
        ping_pongAthlete_01.English();
        System.out.println(ping_pongAthlete_01.getName() + " " + ping_pongAthlete_01.getAge());

        Ping_PongCoach ping_pongCoach = new Ping_PongCoach();
        ping_pongCoach.eat();
        ping_pongCoach.sleep();
        ping_pongCoach.train();
        ping_pongCoach.English();
        System.out.println(ping_pongCoach.getName() + " " + ping_pongCoach.getAge());
        ping_pongCoach.setName("Coach");
        ping_pongCoach.setAge(35);
        System.out.println(ping_pongCoach.getName() + " " + ping_pongCoach.getAge());

        Ping_PongCoach ping_pongCoach_01 = new Ping_PongCoach("Evil", 32);
        ping_pongCoach_01.eat();
        ping_pongCoach_01.sleep();
        ping_pongCoach_01.train();
        ping_pongCoach_01.English();
        System.out.println(ping_pongCoach_01.getName() + " " + ping_pongCoach_01.getAge());
    }
}

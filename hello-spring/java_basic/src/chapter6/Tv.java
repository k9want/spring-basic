package chapter6;

public class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    static void introduce(){
        System.out.println("Tv");
    }

    void tvIntroduce() {
        System.out.println(color + "tv" );
    }
}
